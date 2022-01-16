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

public class PesquisaLivroConsulta extends JPanel {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisaLivroConsulta frame = new PesquisaLivroConsulta();
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
	public PesquisaLivroConsulta() {
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 717, 617);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 68, 30, 172, 89, 194, 134, 0};
		gbl_panel.rowHeights = new int[]{0, 23, 23, 23, 147, 317, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("Pesquisar Livro");
		label.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTHWEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridwidth = 3;
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		
		JRadioButton radioButton = new JRadioButton("T\u00EDtulo");
		GridBagConstraints gbc_radioButton = new GridBagConstraints();
		gbc_radioButton.anchor = GridBagConstraints.NORTH;
		gbc_radioButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_radioButton.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton.gridx = 1;
		gbc_radioButton.gridy = 2;
		panel.add(radioButton, gbc_radioButton);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridwidth = 6;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 4;
		panel.add(panel_1, gbc_panel_1);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTtulo.setBounds(10, 11, 46, 14);
		panel_1.add(lblTtulo);
		
		JLabel label_2 = new JLabel("C\u00F3digo:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(10, 82, 46, 14);
		panel_1.add(label_2);
		
		JLabel lblTtulo_1 = new JLabel("T\u00EDtulo");
		lblTtulo_1.setBounds(55, 11, 90, 14);
		panel_1.add(lblTtulo_1);
		
		JLabel label_4 = new JLabel("XXXXXX");
		label_4.setBounds(55, 82, 46, 14);
		panel_1.add(label_4);
		
		JButton button_2 = new JButton("Acessar");
		button_2.setBounds(598, 113, 89, 23);
		panel_1.add(button_2);
		
		JLabel lblAutor_1 = new JLabel("Autor");
		lblAutor_1.setBounds(55, 36, 90, 14);
		panel_1.add(lblAutor_1);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(10, 36, 46, 14);
		panel_1.add(lblAutor);
		
		JLabel lblXxxxxxxx = new JLabel("XX/XX/XXXX");
		lblXxxxxxxx.setBounds(142, 61, 90, 14);
		panel_1.add(lblXxxxxxxx);
		
		JLabel lblDataDeLanamento = new JLabel("Data de Lan\u00E7amento:");
		lblDataDeLanamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataDeLanamento.setBounds(10, 61, 135, 14);
		panel_1.add(lblDataDeLanamento);
		
		JButton button_1 = new JButton("Voltar ao Menu Inicial");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.gridx = 6;
		gbc_button_1.gridy = 6;
		panel.add(button_1, gbc_button_1);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

}
