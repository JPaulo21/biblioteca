package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LivrosAcervo extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LivrosAcervo frame = new LivrosAcervo();
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
	public LivrosAcervo() {
		
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
		gbl_panel.columnWidths = new int[]{0, 377, 86, 89, 135, 0};
		gbl_panel.rowHeights = new int[]{0, 20, 483, 45, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNmeroDeObras = new JLabel("N\u00FAmero de obras presente no acervo");
		lblNmeroDeObras.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNmeroDeObras = new GridBagConstraints();
		gbc_lblNmeroDeObras.anchor = GridBagConstraints.NORTH;
		gbc_lblNmeroDeObras.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNmeroDeObras.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDeObras.gridx = 1;
		gbc_lblNmeroDeObras.gridy = 1;
		panel.add(lblNmeroDeObras, gbc_lblNmeroDeObras);
		
		JTextArea txtrTotalDeObras = new JTextArea();
		txtrTotalDeObras.setText("Total de obras presentes no acervo atualmente:\r\nXXXX Livros");
		GridBagConstraints gbc_txtrTotalDeObras = new GridBagConstraints();
		gbc_txtrTotalDeObras.fill = GridBagConstraints.BOTH;
		gbc_txtrTotalDeObras.insets = new Insets(0, 0, 5, 0);
		gbc_txtrTotalDeObras.gridwidth = 4;
		gbc_txtrTotalDeObras.gridx = 1;
		gbc_txtrTotalDeObras.gridy = 2;
		panel.add(txtrTotalDeObras, gbc_txtrTotalDeObras);
		
		JButton button_1 = new JButton("Imprimir");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 4;
		panel.add(button_1, gbc_button_1);
		
		JButton button = new JButton("Voltar ao Menu Inicial");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTHWEST;
		gbc_button.gridx = 4;
		gbc_button.gridy = 4;
		panel.add(button, gbc_button);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

}
