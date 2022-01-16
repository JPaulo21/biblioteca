package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.entidades.Livro;
import biblioteca.exececoes.LivroException;
import biblioteca.negocio.ControladorLivro;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarLivro extends JPanel {

	private JPanel contentPane;

	public EditarLivro(Livro exemplar) {
	
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 717, 618);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 56, 60, 115, 115, 89, 0, 50, 0};
		gbl_panel.rowHeights = new int[]{0, 20, 0, 20, 53, 20, 52, 20, 54, 20, 41, 14, 59, 0, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblEditarLivro = new JLabel("Editar Livro");
		lblEditarLivro.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblEditarLivro = new GridBagConstraints();
		gbc_lblEditarLivro.anchor = GridBagConstraints.NORTH;
		gbc_lblEditarLivro.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEditarLivro.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditarLivro.gridwidth = 3;
		gbc_lblEditarLivro.gridx = 1;
		gbc_lblEditarLivro.gridy = 1;
		panel.add(lblEditarLivro, gbc_lblEditarLivro);
		
		JLabel label_1 = new JLabel("T\u00EDtulo: ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		panel.add(label_1, gbc_label_1);
		
		JFormattedTextField textTitulo = new JFormattedTextField();
		textTitulo.setText(exemplar.getTitulo());
		GridBagConstraints gbc_textTitulo = new GridBagConstraints();
		gbc_textTitulo.anchor = GridBagConstraints.NORTH;
		gbc_textTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_textTitulo.gridwidth = 2;
		gbc_textTitulo.gridx = 2;
		gbc_textTitulo.gridy = 3;
		panel.add(textTitulo, gbc_textTitulo);
		
		JLabel label_2 = new JLabel("Autor: ");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 5;
		panel.add(label_2, gbc_label_2);
		
		JFormattedTextField textAutor = new JFormattedTextField();
		textAutor.setText(exemplar.getAutor());
		GridBagConstraints gbc_textAutor = new GridBagConstraints();
		gbc_textAutor.anchor = GridBagConstraints.NORTH;
		gbc_textAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAutor.insets = new Insets(0, 0, 5, 5);
		gbc_textAutor.gridwidth = 2;
		gbc_textAutor.gridx = 2;
		gbc_textAutor.gridy = 5;
		panel.add(textAutor, gbc_textAutor);
		
		JLabel label_3 = new JLabel("Data de lan\u00E7amento: ");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridwidth = 3;
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 7;
		panel.add(label_3, gbc_label_3);
		
		JFormattedTextField textdataLancamento = new JFormattedTextField();
		textdataLancamento.setText(exemplar.getDataLancamento());
		GridBagConstraints gbc_textdataLancamento = new GridBagConstraints();
		gbc_textdataLancamento.anchor = GridBagConstraints.NORTH;
		gbc_textdataLancamento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textdataLancamento.insets = new Insets(0, 0, 5, 5);
		gbc_textdataLancamento.gridx = 3;
		gbc_textdataLancamento.gridy = 7;
		panel.add(textdataLancamento, gbc_textdataLancamento);
		
		JFormattedTextField textEdicao = new JFormattedTextField();
		textEdicao.setText(exemplar.getEdicao());
		GridBagConstraints gbc_textEdicao = new GridBagConstraints();
		gbc_textEdicao.anchor = GridBagConstraints.NORTH;
		gbc_textEdicao.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEdicao.insets = new Insets(0, 0, 5, 5);
		gbc_textEdicao.gridwidth = 2;
		gbc_textEdicao.gridx = 2;
		gbc_textEdicao.gridy = 9;
		panel.add(textEdicao, gbc_textEdicao);
		
		JLabel label_4 = new JLabel("Edi\u00E7\u00E3o: ");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 9;
		panel.add(label_4, gbc_label_4);
		
		JLabel lblCdigoDoLivro = new JLabel("C\u00F3digo do Livro:");
		lblCdigoDoLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCdigoDoLivro = new GridBagConstraints();
		gbc_lblCdigoDoLivro.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCdigoDoLivro.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigoDoLivro.gridwidth = 2;
		gbc_lblCdigoDoLivro.gridx = 1;
		gbc_lblCdigoDoLivro.gridy = 11;
		panel.add(lblCdigoDoLivro, gbc_lblCdigoDoLivro);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exemplar.setTitulo(textTitulo.getText());
				exemplar.setAutor(textAutor.getText());
				exemplar.setEdicao(textEdicao.getText());
				exemplar.setDataLancamento(textdataLancamento.getText());
					
					
				ControladorLivro ControladorA = new ControladorLivro();
				try {
					ControladorA.atualizarLivro(exemplar);
					
					Frame.getFrame().setContentPane(new MenuLivros());
					Frame.getFrame().getContentPane().revalidate();
					
				} catch (LivroException e) {
					JOptionPane.showMessageDialog(null, "Há erros!");
					e.printStackTrace();
					
				}
				
			
				
			}
		});
		GridBagConstraints gbc_btnAtualizar = new GridBagConstraints();
		gbc_btnAtualizar.anchor = GridBagConstraints.NORTH;
		gbc_btnAtualizar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAtualizar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtualizar.gridx = 5;
		gbc_btnAtualizar.gridy = 13;
		panel.add(btnAtualizar, gbc_btnAtualizar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuLivros());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.anchor = GridBagConstraints.NORTH;
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.gridx = 6;
		gbc_btnCancelar.gridy = 13;
		panel.add(btnCancelar, gbc_btnCancelar);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
