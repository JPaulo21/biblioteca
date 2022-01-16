package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.entidades.Usuario;
import biblioteca.exececoes.UsuarioInvalidoException;
import biblioteca.negocio.Controlador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class EditarUsuario extends JPanel {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textdataNascimento;
	private JTextField textCPF;

	
	public EditarUsuario(Usuario usuario) {
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 717, 618);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{32, 15, 85, 107, 89, 0, 50, 0};
		gbl_panel.rowHeights = new int[]{43, 20, 20, 14, 20, 45, 20, 46, 14, 128, 40, 30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblEditarUsurio = new JLabel("Editar Usu\u00E1rio");
		lblEditarUsurio.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblEditarUsurio = new GridBagConstraints();
		gbc_lblEditarUsurio.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEditarUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditarUsurio.gridx = 1;
		gbc_lblEditarUsurio.gridy = 0;
		panel.add(lblEditarUsurio, gbc_lblEditarUsurio);
		
		JLabel label_1 = new JLabel("Nome: ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 2;
		panel.add(label_1, gbc_label_1);
		
		textNome = new JTextField();
		textNome.setText(usuario.getNome());
		GridBagConstraints gbc_textNome = new GridBagConstraints();
		gbc_textNome.gridwidth = 2;
		gbc_textNome.insets = new Insets(0, 0, 5, 5);
		gbc_textNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNome.gridx = 2;
		gbc_textNome.gridy = 2;
		panel.add(textNome, gbc_textNome);
		textNome.setColumns(10);
		
		JLabel label_2 = new JLabel("Data de Nascimento: ");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 4;
		panel.add(label_2, gbc_label_2);
		
		textdataNascimento = new JTextField();
		textdataNascimento.setText(usuario.getDataNascimento());
		GridBagConstraints gbc_textdataNascimento = new GridBagConstraints();
		gbc_textdataNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_textdataNascimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textdataNascimento.gridx = 2;
		gbc_textdataNascimento.gridy = 4;
		panel.add(textdataNascimento, gbc_textdataNascimento);
		textdataNascimento.setColumns(10);
		
		JLabel label_3 = new JLabel("CPF: ");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 6;
		panel.add(label_3, gbc_label_3);
		
		textCPF = new JTextField();
		textCPF.setText(usuario.getCpf());
		GridBagConstraints gbc_textCPF = new GridBagConstraints();
		gbc_textCPF.insets = new Insets(0, 0, 5, 5);
		gbc_textCPF.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCPF.gridx = 2;
		gbc_textCPF.gridy = 6;
		panel.add(textCPF, gbc_textCPF);
		textCPF.setColumns(10);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				usuario.setNome(textNome.getText());
				usuario.setCpf(textCPF.getText());
				usuario.setDataNascimento(textdataNascimento.getText());
				
				Controlador controladorAtualizacao = new Controlador();
				try{
					controladorAtualizacao.atualizarUsuario(usuario);
				}catch (UsuarioInvalidoException e){
					e.printStackTrace();
				}
				
				Frame.getFrame().setContentPane(new MenuUsuario());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnAtualizar = new GridBagConstraints();
		gbc_btnAtualizar.anchor = GridBagConstraints.NORTH;
		gbc_btnAtualizar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAtualizar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtualizar.gridx = 4;
		gbc_btnAtualizar.gridy = 10;
		panel.add(btnAtualizar, gbc_btnAtualizar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuUsuario());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.anchor = GridBagConstraints.NORTH;
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.gridx = 5;
		gbc_btnCancelar.gridy = 10;
		panel.add(btnCancelar, gbc_btnCancelar);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
