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
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;
import java.awt.event.ActionEvent;

public class AreaUsuario extends JPanel {

	private JPanel contentPane;
	private JList listPegos; 
	private JList listAtrasados;

	public AreaUsuario(Usuario usuario) {
				
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 40, 20, 80, 95, 80, 50, 50};
		gridBagLayout.rowHeights = new int[]{20, 0, 0, 20, 25, 30, 30, 50, 70, 30, 100, 50, 25, 0, 50, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 30.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		GridBagConstraints gbc_lblNewLabel_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_1.gridx = 1;
		gbc_lblNewLabel_1_1_1.gridy = 0;
		GridBagConstraints gbc_lblUsurio_1 = new GridBagConstraints();
		gbc_lblUsurio_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUsurio_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsurio_1.gridx = 2;
		gbc_lblUsurio_1.gridy = 0;
		GridBagConstraints gbc_lblXxxxxxxx = new GridBagConstraints();
		gbc_lblXxxxxxxx.anchor = GridBagConstraints.WEST;
		gbc_lblXxxxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxxx.gridx = 7;
		gbc_lblXxxxxxxx.gridy = 0;
		GridBagConstraints gbc_lblXxxxxxxxxxx = new GridBagConstraints();
		gbc_lblXxxxxxxxxxx.anchor = GridBagConstraints.WEST;
		gbc_lblXxxxxxxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxxxxxx.gridx = 11;
		gbc_lblXxxxxxxxxxx.gridy = 0;
		GridBagConstraints gbc_lblCdigo_1 = new GridBagConstraints();
		gbc_lblCdigo_1.anchor = GridBagConstraints.WEST;
		gbc_lblCdigo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigo_1.gridx = 12;
		gbc_lblCdigo_1.gridy = 0;
		GridBagConstraints gbc_lblXxxxxx = new GridBagConstraints();
		gbc_lblXxxxxx.gridwidth = 2;
		gbc_lblXxxxxx.anchor = GridBagConstraints.EAST;
		gbc_lblXxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxx.gridx = 0;
		gbc_lblXxxxxx.gridy = 1;
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 1;
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.anchor = GridBagConstraints.WEST;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 3;
		gbc_panel_2.gridy = 1;
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.anchor = GridBagConstraints.WEST;
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.gridx = 11;
		gbc_panel_6.gridy = 1;
		
		
		JLabel lblNewLabel = new JLabel("Ã�rea do UsuÃ¡rio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		gbc_lblNewLabel_1_1_1.gridwidth = 3;
		gbc_lblNewLabel_1_1_1.gridx = 1;
		gbc_lblNewLabel_1_1_1.gridy = 1;
		gbc_lblNewLabel_1_1_1.insets = new Insets(0, 0, 5, 5);
		add(lblNewLabel, gbc_lblNewLabel_1_1_1);
		
		JLabel lblUsurio = new JLabel("UsuÃ¡rio:");
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 11));
		gbc_lblUsurio_1.gridx = 2;
		gbc_lblUsurio_1.gridy = 3;
		gbc_lblUsurio_1.insets = new Insets(0, 0, 5, 5);
		add(lblUsurio, gbc_lblUsurio_1);
		
		JLabel Nome = new JLabel(usuario.getNome());
		GridBagConstraints gbc_Nome = new GridBagConstraints();
		gbc_Nome.anchor = GridBagConstraints.WEST;
		gbc_Nome.insets = new Insets(0, 0, 5, 5);
		gbc_Nome.gridx = 3;
		gbc_Nome.gridy = 3;
		add(Nome, gbc_Nome);
		
		JLabel lblCdigo = new JLabel("CÃ³digo:");
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		gbc_lblCdigo_1.anchor = GridBagConstraints.WEST;
		gbc_lblCdigo_1.gridx = 2;
		gbc_lblCdigo_1.gridy = 4;
		gbc_lblCdigo_1.insets = new Insets(0, 0, 5, 5);
		add(lblCdigo, gbc_lblCdigo_1);
		
		JLabel lblLivrosPegos = new JLabel("Livros Pegos:");
		GridBagConstraints gbc_lblLivrosPegos = new GridBagConstraints();
		gbc_lblLivrosPegos.gridwidth = 2;
		gbc_lblLivrosPegos.anchor = GridBagConstraints.WEST;
		gbc_lblLivrosPegos.insets = new Insets(0, 0, 5, 5);
		gbc_lblLivrosPegos.gridx = 2;
		gbc_lblLivrosPegos.gridy = 5;
		add(lblLivrosPegos, gbc_lblLivrosPegos);
		
		listPegos = new JList();
		GridBagConstraints gbc_listPegos = new GridBagConstraints();
		gbc_listPegos.gridwidth = 3;
		gbc_listPegos.gridheight = 3;
		gbc_listPegos.insets = new Insets(0, 0, 5, 5);
		gbc_listPegos.fill = GridBagConstraints.BOTH;
		gbc_listPegos.gridx = 2;
		gbc_listPegos.gridy = 6;
		add(listPegos, gbc_listPegos);
		
		JButton buttonDevolver = new JButton("Devolver");
		buttonDevolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro livro = (Livro) listPegos.getSelectedValue();
				
				Set <Livro> pegos = usuario.getPegos();
				pegos.remove(livro);
				
				Frame.getFrame().setContentPane(new AreaUsuario(usuario));
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_buttonDevolver = new GridBagConstraints();
		gbc_buttonDevolver.anchor = GridBagConstraints.SOUTHWEST;
		gbc_buttonDevolver.insets = new Insets(0, 0, 5, 5);
		gbc_buttonDevolver.gridx = 5;
		gbc_buttonDevolver.gridy = 8;
		add(buttonDevolver, gbc_buttonDevolver);
		
		
		JLabel lblLivrosAtrasados = new JLabel("Livros Atrasados");
		GridBagConstraints gbc_lblLivrosAtrasados = new GridBagConstraints();
		gbc_lblLivrosAtrasados.anchor = GridBagConstraints.WEST;
		gbc_lblLivrosAtrasados.gridwidth = 2;
		gbc_lblLivrosAtrasados.insets = new Insets(0, 0, 5, 5);
		gbc_lblLivrosAtrasados.gridx = 2;
		gbc_lblLivrosAtrasados.gridy = 9;
		add(lblLivrosAtrasados, gbc_lblLivrosAtrasados);
		
		
		
		listAtrasados = new JList();
		GridBagConstraints gbc_listAtrasados = new GridBagConstraints();
		gbc_listAtrasados.gridheight = 2;
		gbc_listAtrasados.gridwidth = 3;
		gbc_listAtrasados.insets = new Insets(0, 0, 5, 5);
		gbc_listAtrasados.fill = GridBagConstraints.BOTH;
		gbc_listAtrasados.gridx = 2;
		gbc_listAtrasados.gridy = 10;
		add(listAtrasados, gbc_listAtrasados);
		
		//ControladorLivro ctrlA = new ControladorLivro();
		//Set <Calendar> Atrasados = ctrlA.livrosAtrasados();
		//listAtrasados.setListData(Atrasados.toArray());
		
		JButton btnGerarMulta = new JButton("Gerar Multa");
		btnGerarMulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro livro = (Livro) listAtrasados.getSelectedValue();
				
				
				ControladorLivro Multa = new ControladorLivro();
				Multa.gerarMulta(usuario, livro);
				
			}
		});
		GridBagConstraints gbc_btnGerarMulta = new GridBagConstraints();
		gbc_btnGerarMulta.anchor = GridBagConstraints.WEST;
		gbc_btnGerarMulta.insets = new Insets(0, 0, 5, 5);
		gbc_btnGerarMulta.gridx = 5;
		gbc_btnGerarMulta.gridy = 11;
		add(btnGerarMulta, gbc_btnGerarMulta);
		
		JButton btnNovoEmprestimo = new JButton("Novo Emprestimo");
		btnNovoEmprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new AdicionarEmprestimoPesquisa(usuario));
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnNovoEmprestimo = new GridBagConstraints();
		gbc_btnNovoEmprestimo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNovoEmprestimo.gridx = 4;
		gbc_btnNovoEmprestimo.gridy = 13;
		add(btnNovoEmprestimo, gbc_btnNovoEmprestimo);
		
		JButton btnFinalizarSesso = new JButton("Finalizar Sessão");
		btnFinalizarSesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuInicial());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnFinalizarSesso = new GridBagConstraints();
		gbc_btnFinalizarSesso.insets = new Insets(0, 0, 5, 5);
		gbc_btnFinalizarSesso.gridx = 5;
		gbc_btnFinalizarSesso.gridy = 13;
		add(btnFinalizarSesso, gbc_btnFinalizarSesso);
		
		
			
			
				ControladorLivro ctrlA = new ControladorLivro();
		
				Set<Livro> pegos = usuario.getPegos();
				ctrlA.verificarLivros(pegos);
				
				
				listPegos.setListData(pegos.toArray());
			
		
	}


}
