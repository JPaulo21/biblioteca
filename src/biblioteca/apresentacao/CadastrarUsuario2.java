package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.dados.Persistencia;
import biblioteca.dados.Repositorio;
import biblioteca.entidades.Usuario;
import biblioteca.exececoes.UsuarioInvalidoException;
import biblioteca.negocio.Controlador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarUsuario2 extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	
	/**
	 * Create the frame.
	 */
	public CadastrarUsuario2() {
		

		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{43, 100, 100, 141, 89, 36, 0, 0};
		gbl_panel.rowHeights = new int[]{15, 0, 15, 10, 30, 20, 0, 50, 0, 23, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 3701.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 95.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_panel);
		
		JLabel lblCadastrarUsurio = new JLabel("Cadastrar Usu\u00E1rio");
		lblCadastrarUsurio.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblCadastrarUsurio = new GridBagConstraints();
		gbc_lblCadastrarUsurio.gridwidth = 3;
		gbc_lblCadastrarUsurio.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCadastrarUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblCadastrarUsurio.gridx = 1;
		gbc_lblCadastrarUsurio.gridy = 1;
		add(lblCadastrarUsurio, gbc_lblCadastrarUsurio);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 3;
		add(lblNome, gbc_lblNome);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		add(textField, gbc_textField);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDataDeNascimento = new GridBagConstraints();
		gbc_lblDataDeNascimento.anchor = GridBagConstraints.WEST;
		gbc_lblDataDeNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento.gridwidth = 2;
		gbc_lblDataDeNascimento.gridx = 1;
		gbc_lblDataDeNascimento.gridy = 4;
		add(lblDataDeNascimento, gbc_lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 4;
		add(textField_1, gbc_textField_1);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.anchor = GridBagConstraints.WEST;
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 5;
		add(lblCpf, gbc_lblCpf);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		add(textField_3, gbc_textField_3);
		
		
		JLabel label = new JLabel("Contato: ");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 6;
		add(label, gbc_label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 6;
		add(textField_2, gbc_textField_2);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario usuario = new Usuario();
				
				usuario.setNome(textField.getText());
				usuario.setCpf(textField_3.getText());
				usuario.setDataNascimento(textField_1.getText());
				
				//Persistencia dados = new Persistencia();
				//dados.Gravar(textField.getText(), textField_3.getText(), textField_1.getText(), null, null);
				
				Controlador controladorUsuario = new Controlador();
				try {
					controladorUsuario.cadastrarUsuario(usuario);
				} catch (UsuarioInvalidoException e) {
					JOptionPane.showMessageDialog(null, "Novo usuario cadastrado!");
				}
				
				Frame.getFrame().setContentPane(new AreaUsuario(usuario));
				Frame.getFrame().getContentPane().revalidate();
				
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuEmprestimo());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.anchor = GridBagConstraints.NORTH;
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 8;
		add(btnCancelar, gbc_btnCancelar);
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.anchor = GridBagConstraints.NORTH;
		gbc_btnCadastrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCadastrar.gridx = 5;
		gbc_btnCadastrar.gridy = 8;
		add(btnCadastrar, gbc_btnCadastrar);
	}
}
