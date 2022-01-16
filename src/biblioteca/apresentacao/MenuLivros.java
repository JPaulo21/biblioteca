package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.dados.Repositorio;
import biblioteca.entidades.Livro;
import biblioteca.entidades.Usuario;
import biblioteca.negocio.Controlador;
import biblioteca.negocio.ControladorLivro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class MenuLivros extends JPanel {

	private JPanel contentPane;
	private JList listAllBooks;
	private Set<Livro> livros;

	public MenuLivros() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{99, 90, 70, 0};
		gridBagLayout.rowHeights = new int[]{0, 40, 30, 30, 0, 220, 0, 33, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel lblLivros = new JLabel("Livros");
		lblLivros.setHorizontalAlignment(SwingConstants.CENTER);
		lblLivros.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblLivros.setBounds(282, 67, 152, 52);
		GridBagConstraints gbc_lblLivros = new GridBagConstraints();
		gbc_lblLivros.insets = new Insets(15, 0, 5, 5);
		gbc_lblLivros.gridx = 1;
		gbc_lblLivros.gridy = 0;
		add(lblLivros, gbc_lblLivros);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new CadastrarLivro());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(187, 305, 105, 30);
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.anchor = GridBagConstraints.WEST;
		gbc_btnCadastrar.insets = new Insets(0, 15, 5, 5);
		gbc_btnCadastrar.gridx = 0;
		gbc_btnCadastrar.gridy = 2;
		add(btnCadastrar, gbc_btnCadastrar);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu Inicial");
		btnVoltarAoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuInicial());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro exemplar = (Livro)listAllBooks.getSelectedValue();
				
				if (exemplar == null){
					JOptionPane.showMessageDialog(null, "Selecione um usuario");
				}
				
				Frame.getFrame().setContentPane(new EditarLivro(exemplar));
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEditar.setBounds(457, 305, 89, 30);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.anchor = GridBagConstraints.WEST;
		gbc_btnEditar.insets = new Insets(0, 15, 5, 5);
		gbc_btnEditar.gridx = 0;
		gbc_btnEditar.gridy = 3;
		add(btnEditar, gbc_btnEditar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro exemplar = (Livro) listAllBooks.getSelectedValue();
				
				ControladorLivro controladorL = new ControladorLivro();
				//controladorL.deletarExemplar(exemplar);
				
				JOptionPane.showMessageDialog(null, "Livro Deletado!");
				
				
				listAllBooks.setListData(livros.toArray());
			}
		});
		btnDeletar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		GridBagConstraints gbc_btnDeletar = new GridBagConstraints();
		gbc_btnDeletar.anchor = GridBagConstraints.WEST;
		gbc_btnDeletar.insets = new Insets(0, 15, 5, 5);
		gbc_btnDeletar.gridx = 0;
		gbc_btnDeletar.gridy = 4;
		add(btnDeletar, gbc_btnDeletar);
		
		listAllBooks = new JList();
		GridBagConstraints gbc_listAllBooks = new GridBagConstraints();
		gbc_listAllBooks.gridheight = 4;
		gbc_listAllBooks.gridwidth = 2;
		gbc_listAllBooks.insets = new Insets(0, 0, 5, 15);
		gbc_listAllBooks.fill = GridBagConstraints.BOTH;
		gbc_listAllBooks.gridx = 1;
		gbc_listAllBooks.gridy = 2;
		add(listAllBooks, gbc_listAllBooks);
		
		
		btnVoltarAoMenu.setBounds(545, 583, 162, 23);
		GridBagConstraints gbc_btnVoltarAoMenu = new GridBagConstraints();
		gbc_btnVoltarAoMenu.insets = new Insets(0, 0, 5, 15);
		gbc_btnVoltarAoMenu.anchor = GridBagConstraints.WEST;
		gbc_btnVoltarAoMenu.gridx = 2;
		gbc_btnVoltarAoMenu.gridy = 6;
		add(btnVoltarAoMenu, gbc_btnVoltarAoMenu);
		
		Controlador controladorL = new Controlador();
		livros = Repositorio.getInstancia().obterTodosLivros();
		listAllBooks.setListData(livros.toArray());
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

}
