package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PesquisaLivro extends JPanel {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisaLivro frame = new PesquisaLivro();
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
	public PesquisaLivro() {
		
		setBounds(100, 100, 733, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 717, 617);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 68, 30, 172, 89, 194, 134, 0};
		gbl_panel.rowHeights = new int[]{0, 23, 23, 23, 475, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPesquisarLivro = new JLabel("Pesquisar Livro");
		lblPesquisarLivro.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblPesquisarLivro = new GridBagConstraints();
		gbc_lblPesquisarLivro.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPesquisarLivro.insets = new Insets(0, 0, 5, 5);
		gbc_lblPesquisarLivro.gridwidth = 3;
		gbc_lblPesquisarLivro.gridx = 1;
		gbc_lblPesquisarLivro.gridy = 1;
		panel.add(lblPesquisarLivro, gbc_lblPesquisarLivro);
		
		JRadioButton rdbtnTtulo = new JRadioButton("T\u00EDtulo");
		GridBagConstraints gbc_rdbtnTtulo = new GridBagConstraints();
		gbc_rdbtnTtulo.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnTtulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnTtulo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnTtulo.gridx = 1;
		gbc_rdbtnTtulo.gridy = 2;
		panel.add(rdbtnTtulo, gbc_rdbtnTtulo);
		
		JRadioButton rdbtnCdigo = new JRadioButton("C\u00F3digo do Livro");
		GridBagConstraints gbc_rdbtnCdigo = new GridBagConstraints();
		gbc_rdbtnCdigo.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnCdigo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCdigo.gridx = 3;
		gbc_rdbtnCdigo.gridy = 2;
		panel.add(rdbtnCdigo, gbc_rdbtnCdigo);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 3;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		panel.add(textField, gbc_textField);
		
		JButton button = new JButton("Pesquisar");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 3;
		panel.add(button, gbc_button);
		
		JButton button_1 = new JButton("Voltar ao Menu Inicial");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.gridx = 6;
		gbc_button_1.gridy = 5;
		panel.add(button_1, gbc_button_1);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

}
