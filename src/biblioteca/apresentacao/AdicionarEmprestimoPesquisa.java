package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import biblioteca.dados.Repositorio;
import biblioteca.entidades.Livro;
import biblioteca.entidades.Usuario;
import biblioteca.exececoes.LivroException;
import biblioteca.negocio.Controlador;
import biblioteca.negocio.ControladorLivro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class AdicionarEmprestimoPesquisa extends JPanel {

	private JPanel contentPane;
	private JTextField textDePesquisa;
	private JList listEstoque;
	private Set <Livro> Encontrados;
	private JTextField textPESQUISA;


	public AdicionarEmprestimoPesquisa(Usuario usuario) { 
		
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0};
		gbl_panel.columnWidths = new int[]{50, 0, 0, 0, 80, 50};
		gbl_panel.rowHeights = new int[]{9, 0, 0, 0, 0, 0, 251, 0};
		setLayout(gbl_panel);
		
		JLabel lblAdicionarEmprstimo = new JLabel("Adicionar Empr\u00E9stimo");
		lblAdicionarEmprstimo.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblAdicionarEmprstimo = new GridBagConstraints();
		gbc_lblAdicionarEmprstimo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAdicionarEmprstimo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionarEmprstimo.gridwidth = 3;
		gbc_lblAdicionarEmprstimo.gridx = 1;
		gbc_lblAdicionarEmprstimo.gridy = 1;
		add(lblAdicionarEmprstimo, gbc_lblAdicionarEmprstimo);
		
		JLabel lblPesquisarLivro = new JLabel("Pesquisar Livro");
		lblPesquisarLivro.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblPesquisarLivro = new GridBagConstraints();
		gbc_lblPesquisarLivro.fill = GridBagConstraints.BOTH;
		gbc_lblPesquisarLivro.insets = new Insets(0, 0, 5, 5);
		gbc_lblPesquisarLivro.gridwidth = 2;
		gbc_lblPesquisarLivro.gridx = 1;
		gbc_lblPesquisarLivro.gridy = 2;
		add(lblPesquisarLivro, gbc_lblPesquisarLivro);
		
		JRadioButton rdbtnTtulo = new JRadioButton("T\u00EDtulo");
		GridBagConstraints gbc_rdbtnTtulo = new GridBagConstraints();
		gbc_rdbtnTtulo.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnTtulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnTtulo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnTtulo.gridx = 1;
		gbc_rdbtnTtulo.gridy = 3;
		add(rdbtnTtulo, gbc_rdbtnTtulo);
		
		listEstoque = new JList();
		GridBagConstraints gbc_listEstoque = new GridBagConstraints();
		gbc_listEstoque.gridheight = 2;
		gbc_listEstoque.gridwidth = 3;
		gbc_listEstoque.insets = new Insets(0, 0, 5, 5);
		gbc_listEstoque.fill = GridBagConstraints.BOTH;
		gbc_listEstoque.gridx = 1;
		gbc_listEstoque.gridy = 5;
		add(listEstoque, gbc_listEstoque);
		
		textPESQUISA = new JTextField();	
				GridBagConstraints gbc_textPESQUISA = new GridBagConstraints();
				gbc_textPESQUISA.gridwidth = 3;
				gbc_textPESQUISA.insets = new Insets(0, 0, 5, 5);
				gbc_textPESQUISA.fill = GridBagConstraints.HORIZONTAL;
				gbc_textPESQUISA.gridx = 1;
				gbc_textPESQUISA.gridy = 4;
				add(textPESQUISA, gbc_textPESQUISA);
				textPESQUISA.setColumns(10);
				
		textPESQUISA.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				ControladorLivro controladorV = new ControladorLivro();
				
					Encontrados = controladorV.buscarLivrosPorTitulo(textPESQUISA.getText());
					listEstoque.setListData(Encontrados.toArray());
				}

		});
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro livro = (Livro) listEstoque.getSelectedValue();
				
				Set <Livro> pegos = usuario.getPegos();
				pegos.add(livro);
				
				SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
				
				Calendar dataEmprestimo = Calendar.getInstance();
				
				dataEmprestimo.add(Calendar.MINUTE, 2);
				
				ControladorLivro ctrlA = new ControladorLivro();
				ctrlA.ctrlData(livro);
				
				
				JOptionPane.showMessageDialog(null, "Livro Adicionado! "
														+ "Data de Entrega: "+sd.format(dataEmprestimo.getTime()));
			
			}
		});
		
		GridBagConstraints gbc_btnAdicionar = new GridBagConstraints();
		gbc_btnAdicionar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdicionar.gridx = 3;
		gbc_btnAdicionar.gridy = 7;
		add(btnAdicionar, gbc_btnAdicionar);
		
		JButton btnVoltarAoMenu = new JButton("Voltar a Area de Usuario");
		btnVoltarAoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new AreaUsuario(usuario));
				Frame.getFrame().getContentPane().revalidate();
				
			}
		});
		GridBagConstraints gbc_btnVoltarAoMenu = new GridBagConstraints();
		gbc_btnVoltarAoMenu.insets = new Insets(0, 0, 0, 5);
		gbc_btnVoltarAoMenu.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnVoltarAoMenu.gridx = 4;
		gbc_btnVoltarAoMenu.gridy = 7;
		add(btnVoltarAoMenu, gbc_btnVoltarAoMenu);
		
		
		
		
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
	
