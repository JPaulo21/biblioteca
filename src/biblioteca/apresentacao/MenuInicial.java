package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuInicial extends JPanel {

	private JPanel contentPane;

	public MenuInicial() {
		setBounds(100, 100, 550, 354);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{140, 0, 140, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_contentPane);
		
		JLabel lblControleDeBiblioteca = new JLabel("Controle de Biblioteca");
		lblControleDeBiblioteca.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblControleDeBiblioteca = new GridBagConstraints();
		gbc_lblControleDeBiblioteca.weighty = 1.0;
		gbc_lblControleDeBiblioteca.insets = new Insets(0, 0, 5, 5);
		gbc_lblControleDeBiblioteca.gridx = 1;
		gbc_lblControleDeBiblioteca.gridy = 0;
		add(lblControleDeBiblioteca, gbc_lblControleDeBiblioteca);
		
		JButton btnEmprstimos = new JButton("Novo Empr\u00E9stimos");
		btnEmprstimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuEmprestimo());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		btnEmprstimos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEmprstimos = new GridBagConstraints();
		gbc_btnEmprstimos.anchor = GridBagConstraints.NORTH;
		gbc_btnEmprstimos.insets = new Insets(0, 0, 10, 5);
		gbc_btnEmprstimos.gridx = 1;
		gbc_btnEmprstimos.gridy = 1;
		add(btnEmprstimos, gbc_btnEmprstimos);
		
		JButton btnUsurio = new JButton("Cadastro e Busca de Usu\u00E1rio");
		btnUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuUsuario());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		
		JButton btnCadastroELivro = new JButton("Cadastro e Busca de Livros");
		btnCadastroELivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuLivros());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		btnCadastroELivro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnCadastroELivro = new GridBagConstraints();
		gbc_btnCadastroELivro.anchor = GridBagConstraints.NORTH;
		gbc_btnCadastroELivro.insets = new Insets(0, 0, 10, 5);
		gbc_btnCadastroELivro.gridx = 1;
		gbc_btnCadastroELivro.gridy = 2;
		add(btnCadastroELivro, gbc_btnCadastroELivro);
		btnUsurio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnUsurio = new GridBagConstraints();
		gbc_btnUsurio.anchor = GridBagConstraints.NORTH;
		gbc_btnUsurio.insets = new Insets(0, 0, 10, 5);
		gbc_btnUsurio.gridx = 1;
		gbc_btnUsurio.gridy = 3;
		add(btnUsurio, gbc_btnUsurio);
		
		JButton btnRelatrios = new JButton("Relat\u00F3rios");
		btnRelatrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuRelatorios());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		btnRelatrios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnRelatrios = new GridBagConstraints();
		gbc_btnRelatrios.anchor = GridBagConstraints.NORTH;
		gbc_btnRelatrios.weighty = 1.0;
		gbc_btnRelatrios.insets = new Insets(0, 0, 0, 5);
		gbc_btnRelatrios.gridx = 1;
		gbc_btnRelatrios.gridy = 4;
		add(btnRelatrios, gbc_btnRelatrios);
	}

}
