package biblioteca.apresentacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import biblioteca.entidades.Livro;
import biblioteca.persistencia.LivroDAO;

public class CadastrarLivro extends JPanel {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtGenero;
	private JTextField textQntd;
	private JTextField txtQntd;
	private JTextField txtAutor;
	private JTextField txtDataLancamento;
	private JTextField txtEdicao;
	private JLabel lblImage;
	private String adcEditar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarLivro frame = new CadastrarLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarLivro() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 50, 133, 140};
		gridBagLayout.rowHeights = new int[]{40, 40, 40, 40, 33, 30, 45, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		GridBagConstraints gbc_txtVoltar = new GridBagConstraints();
		gbc_txtVoltar.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtVoltar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_txtVoltar.gridwidth = 4;
		gbc_txtVoltar.gridx = 2;
		gbc_txtVoltar.gridy = 0;
		
		JLabel label = new JLabel("Cadastrar Livro");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.weighty = 1.0;
		gbc_label.gridwidth = 4;
		gbc_label.insets = new Insets(0, 15, 5, 15);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		add(label, gbc_label);
		
		JLabel lblTitulo = new JLabel("Título: ");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);
		
		txtTitulo = new JTextField();
		GridBagConstraints gbc_txtTitulo = new GridBagConstraints();
		gbc_txtTitulo.anchor = GridBagConstraints.WEST;
		gbc_txtTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTitulo.gridx = 2;
		gbc_txtTitulo.gridy = 1;
		add(txtTitulo, gbc_txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel label_3 = new JLabel("Autor: ");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 2;
		add(label_3, gbc_label_3);
		
		txtAutor = new JTextField();
		GridBagConstraints gbc_txtAutor = new GridBagConstraints();
		gbc_txtAutor.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtAutor.insets = new Insets(0, 0, 5, 5);
		gbc_txtAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAutor.gridx = 2;
		gbc_txtAutor.gridy = 2;
		add(txtAutor, gbc_txtAutor);
		txtAutor.setColumns(10);
		
		lblImage = new JLabel("Capa");
		lblImage.setBackground(Color.GRAY);
		GridBagConstraints gbc_lblLabelImage = new GridBagConstraints();
		gbc_lblLabelImage.gridheight = 5;
		gbc_lblLabelImage.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabelImage.gridx = 0;
		gbc_lblLabelImage.gridy = 1;
		add(lblImage, gbc_lblLabelImage);
		
		JLabel lblDataLancamento = new JLabel("Data de Lan\u00E7amento ");
		lblDataLancamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDataLancamento = new GridBagConstraints();
		gbc_lblDataLancamento.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDataLancamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataLancamento.gridx = 1;
		gbc_lblDataLancamento.gridy = 3;
		add(lblDataLancamento, gbc_lblDataLancamento);
		
		txtDataLancamento = new JTextField();
		GridBagConstraints gbc_txtDataLancamento = new GridBagConstraints();
		gbc_txtDataLancamento.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtDataLancamento.insets = new Insets(0, 0, 5, 5);
		gbc_txtDataLancamento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDataLancamento.gridx = 2;
		gbc_txtDataLancamento.gridy = 3;
		add(txtDataLancamento, gbc_txtDataLancamento);
		txtDataLancamento.setColumns(10);
		
		JLabel lblEdicao = new JLabel("Edi\u00E7\u00E3o:");
		lblEdicao.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblEdicao = new GridBagConstraints();
		gbc_lblEdicao.anchor = GridBagConstraints.NORTH;
		gbc_lblEdicao.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdicao.gridx = 1;
		gbc_lblEdicao.gridy = 4;
		add(lblEdicao, gbc_lblEdicao);
		
		txtEdicao = new JTextField();
		GridBagConstraints gbc_txtEdicao = new GridBagConstraints();
		gbc_txtEdicao.anchor = GridBagConstraints.NORTH;
		gbc_txtEdicao.insets = new Insets(0, 0, 5, 5);
		gbc_txtEdicao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEdicao.gridx = 2;
		gbc_txtEdicao.gridy = 4;
		add(txtEdicao, gbc_txtEdicao);
		txtEdicao.setColumns(10);
		
		JLabel lblQntd = new JLabel("Quantidade:");
		lblQntd.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblQntd = new GridBagConstraints();
		gbc_lblQntd.anchor = GridBagConstraints.NORTH;
		gbc_lblQntd.insets = new Insets(0, 0, 5, 5);
		gbc_lblQntd.gridx = 1;
		gbc_lblQntd.gridy = 5;
		add(lblQntd, gbc_lblQntd);
		
		
		txtQntd = new JTextField();
		GridBagConstraints gbc_txtQntd = new GridBagConstraints();
		gbc_txtQntd.anchor = GridBagConstraints.NORTH;
		gbc_txtQntd.insets = new Insets(0, 0, 5, 5);
		gbc_txtQntd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtQntd.gridx = 2;
		gbc_txtQntd.gridy = 5;
		add(txtQntd, gbc_txtQntd);
		txtQntd.setColumns(10);
		
		if(lblImage.getText()=="Capa") {
			
			adcEditar ="Adicionar Capa";
		} else if (lblImage.getText()==null) {
			
			adcEditar = "Editar Imagem";
		}
		
		JButton btnNewButton = new JButton(adcEditar);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser pathFile = new JFileChooser();
				pathFile.setDialogTitle("Selecione a Capa");
				pathFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				
				pathFile.showOpenDialog(null);
				
				try {
					
					lblImage.setText(null);
					ImageIcon img = new ImageIcon(ImageIO.read(pathFile.getSelectedFile()));
					lblImage.setIcon(new ImageIcon(img.getImage().getScaledInstance(110, 150, ABORT)));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//					
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weightx = 2.0;
		gbc_btnNewButton.insets = new Insets(0, 15, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 6;
		add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblGnero = new JLabel("Genero:");
		lblGnero.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.anchor = GridBagConstraints.NORTH;
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 1;
		gbc_lblGnero.gridy = 6;
		add(lblGnero, gbc_lblGnero);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		GridBagConstraints gbc_txtGenero = new GridBagConstraints();
		gbc_txtGenero.anchor = GridBagConstraints.NORTH;
		gbc_txtGenero.insets = new Insets(0, 0, 5, 5);
		gbc_txtGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGenero.gridx = 2;
		gbc_txtGenero.gridy = 6;
		add(txtGenero, gbc_txtGenero);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuLivros());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Livro livro = new Livro();
				LivroDAO livroDAO = new LivroDAO();
				
				livro.setTitulo(txtTitulo.getText());
				livro.setAutor(txtAutor.getText());
				livro.setDataLancamento(txtDataLancamento.getText());
				livro.setEdicao(txtEdicao.getText());
				livro.setQuantidade(Integer.parseInt(txtQntd.getText()));
				livro.setGenero(txtGenero.getText());
				livro.setCapa(lblImage.getIcon());
				
				livroDAO.cadastrar(livro);
				
			}
		});
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.weighty = 1.0;
		gbc_btnCadastrar.insets = new Insets(0, 0, 15, 5);
		gbc_btnCadastrar.gridx = 2;
		gbc_btnCadastrar.gridy = 7;
		add(btnCadastrar, gbc_btnCadastrar);
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.insets = new Insets(0, 0, 15, 15);
		gbc_btnVoltar.gridx = 3;
		gbc_btnVoltar.gridy = 7;
		add(btnVoltar, gbc_btnVoltar);
	}


		
}

