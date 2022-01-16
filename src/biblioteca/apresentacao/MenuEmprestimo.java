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

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class MenuEmprestimo extends JPanel {

	private JPanel contentPane;
	private JTextField Buscador;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JList listUsers;
	private Set <Usuario> encontrados;


	public MenuEmprestimo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{49, 113, 79, 80, 50, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 350, 30, 15, 0, 23, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
				GridBagConstraints gbc_lblConsultarUsurio_1_1 = new GridBagConstraints();
				gbc_lblConsultarUsurio_1_1.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblConsultarUsurio_1_1.insets = new Insets(0, 0, 0, 5);
				gbc_lblConsultarUsurio_1_1.gridx = 0;
				gbc_lblConsultarUsurio_1_1.gridy = 0;
		GridBagConstraints gbc_rdbtnNome_1 = new GridBagConstraints();
		gbc_rdbtnNome_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnNome_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnNome_1.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnNome_1.gridx = 0;
		gbc_rdbtnNome_1.gridy = 0;
		
				
				JLabel lblConsultarUsurio = new JLabel("Consultar Usu\u00E1rio");
				lblConsultarUsurio.setFont(new Font("Tahoma", Font.BOLD, 19));
				
				gbc_lblConsultarUsurio_1_1.anchor = GridBagConstraints.WEST;
				gbc_lblConsultarUsurio_1_1.gridwidth = 3;
				gbc_lblConsultarUsurio_1_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblConsultarUsurio_1_1.gridx = 1;
				gbc_lblConsultarUsurio_1_1.gridy = 1;
				add(lblConsultarUsurio, gbc_lblConsultarUsurio_1_1);
		GridBagConstraints gbc_rdbtnCdigoDeUsurio_1 = new GridBagConstraints();
		gbc_rdbtnCdigoDeUsurio_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnCdigoDeUsurio_1.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnCdigoDeUsurio_1.gridx = 1;
		gbc_rdbtnCdigoDeUsurio_1.gridy = 0;
		
		JRadioButton rdbtnNome = new JRadioButton("Nome");
		buttonGroup.add(rdbtnNome);
	
		gbc_rdbtnNome_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNome_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNome_1.gridx = 1;
		gbc_rdbtnNome_1.gridy = 2;
		add(rdbtnNome, gbc_rdbtnNome_1);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 0;
		
		JRadioButton rdbtnCdigoDeUsurio = new JRadioButton("C\u00F3digo de Usu\u00E1rio");
		buttonGroup.add(rdbtnCdigoDeUsurio);
		
		gbc_rdbtnCdigoDeUsurio_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCdigoDeUsurio_1.gridx = 2;
		gbc_rdbtnCdigoDeUsurio_1.gridy = 2;
		add(rdbtnCdigoDeUsurio, gbc_rdbtnCdigoDeUsurio_1);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu Inicial");
		btnVoltarAoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuInicial());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		
		Buscador = new JTextField();
		GridBagConstraints gbc_Buscador = new GridBagConstraints();
		gbc_Buscador.gridwidth = 2;
		gbc_Buscador.insets = new Insets(0, 0, 5, 5);
		gbc_Buscador.fill = GridBagConstraints.HORIZONTAL;
		gbc_Buscador.gridx = 1;
		gbc_Buscador.gridy = 3;
		add(Buscador, gbc_Buscador);
		Buscador.setColumns(10);
		
		Buscador.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Controlador controladorG = new Controlador();
				encontrados = controladorG.buscarUsuarioPorNome(Buscador.getText());
				listUsers.setListData(encontrados.toArray());
				
			}
		});

		
		
		listUsers = new JList();
		GridBagConstraints gbc_listUsers = new GridBagConstraints();
		gbc_listUsers.gridheight = 2;
		gbc_listUsers.gridwidth = 2;
		gbc_listUsers.insets = new Insets(0, 0, 5, 5);
		gbc_listUsers.fill = GridBagConstraints.BOTH;
		gbc_listUsers.gridx = 1;
		gbc_listUsers.gridy = 4;
		add(listUsers, gbc_listUsers);
		
		JButton Acessar = new JButton("Acessar");
		Acessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Usuario usuario = (Usuario) listUsers.getSelectedValue();
				
				if (usuario == null){
					JOptionPane.showMessageDialog(null, "Selecione um usuario");
				}
				
				
				Frame.getFrame().setContentPane(new AreaUsuario(usuario));
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		Acessar.setBackground(Color.WHITE);
		GridBagConstraints gbc_Acessar = new GridBagConstraints();
		gbc_Acessar.insets = new Insets(0, 0, 5, 5);
		gbc_Acessar.gridx = 3;
		gbc_Acessar.gridy = 5;
		add(Acessar, gbc_Acessar);
		
		JButton btnCadastrarNovoUsuario = new JButton("Novo Cadastro");
		btnCadastrarNovoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.getFrame().setContentPane(new CadastrarUsuario2());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnCadastrarNovoUsuario = new GridBagConstraints();
		gbc_btnCadastrarNovoUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnCadastrarNovoUsuario.gridx = 2;
		gbc_btnCadastrarNovoUsuario.gridy = 7;
		add(btnCadastrarNovoUsuario, gbc_btnCadastrarNovoUsuario);
		GridBagConstraints gbc_btnVoltarAoMenu_1_1 = new GridBagConstraints();
		gbc_btnVoltarAoMenu_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltarAoMenu_1_1.gridx = 3;
		gbc_btnVoltarAoMenu_1_1.gridy = 7;
		add(btnVoltarAoMenu, gbc_btnVoltarAoMenu_1_1);
		
		gbc_btnVoltarAoMenu_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltarAoMenu_1_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnVoltarAoMenu_1_1.gridx = 6;
		gbc_btnVoltarAoMenu_1_1.gridy = 0;
		

		Controlador controladorV = new Controlador();
		Set<Usuario> usuarios = Repositorio.getInstancia().obterTodosUsuarios();
		listUsers.setListData(usuarios.toArray());
		
	}
	

	

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
