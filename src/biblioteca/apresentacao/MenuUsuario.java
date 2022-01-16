package biblioteca.apresentacao;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import biblioteca.dados.Repositorio;
import biblioteca.entidades.Usuario;
import biblioteca.negocio.Controlador;

public class MenuUsuario extends JPanel {
	private JPanel contentPane;
	private Set<Usuario> usuarios;
	private JTextField Buscador;

	
	public MenuUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 46, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 3.0;
		gbc_lblNewLabel.insets = new Insets(20, 20, 20, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		Buscador = new JTextField();
		GridBagConstraints gbc_Buscador = new GridBagConstraints();
		gbc_Buscador.gridwidth = 2;
		gbc_Buscador.insets = new Insets(0, 20, 5, 5);
		gbc_Buscador.fill = GridBagConstraints.HORIZONTAL;
		gbc_Buscador.gridx = 0;
		gbc_Buscador.gridy = 1;
		add(Buscador, gbc_Buscador);
		Buscador.setColumns(10);
		
		Buscador.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				
				
				
			}
			
		});
		
		JButton btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 20);
		gbc_btnCadastrar.gridx = 2;
		gbc_btnCadastrar.gridy = 1;
		add(btnCadastrar, gbc_btnCadastrar);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 4;
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 20, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 2;
		add(list, gbc_list);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 20);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.anchor = GridBagConstraints.NORTH;
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 20);
		gbc_btnExcluir.gridx = 2;
		gbc_btnExcluir.gridy = 3;
		add(btnExcluir, gbc_btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.weighty = 3.0;
		gbc_btnVoltar.insets = new Insets(0, 0, 20, 20);
		gbc_btnVoltar.gridx = 2;
		gbc_btnVoltar.gridy = 6;
		add(btnVoltar, gbc_btnVoltar);
		
		
		Controlador controladorU = new Controlador();
		usuarios = Repositorio.getInstancia().obterTodosUsuarios();
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
