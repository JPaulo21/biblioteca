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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LivrosPopulares extends JPanel {

	private JPanel contentPane;

	public LivrosPopulares() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 717, 617);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{50, 235, 228, 60, 50, 0};
		gbl_panel.rowHeights = new int[]{0, 20, 350, 45, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblLivrosMaisPopulares = new JLabel("Livros mais Populares");
		lblLivrosMaisPopulares.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblLivrosMaisPopulares = new GridBagConstraints();
		gbc_lblLivrosMaisPopulares.anchor = GridBagConstraints.NORTH;
		gbc_lblLivrosMaisPopulares.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLivrosMaisPopulares.insets = new Insets(0, 0, 5, 5);
		gbc_lblLivrosMaisPopulares.gridx = 1;
		gbc_lblLivrosMaisPopulares.gridy = 1;
		panel.add(lblLivrosMaisPopulares, gbc_lblLivrosMaisPopulares);
		
		JTextArea txtrLivrosMaisPopulares = new JTextArea();
		txtrLivrosMaisPopulares.setText("Livros mais populares do m\u00EAs:\r\n\r\n1\u00BA - T\u00EDtulo: XXXX\r\n\tAutor: XXXX\r\n\r\n2\u00BA - T\u00EDtulo: XXXX\r\n\tAutor: XXXX\r\n\r\n3\u00BA - T\u00EDtulo: XXXX\r\n\tAutor: XXXX\r\n\r\n4\u00BA - T\u00EDtulo: XXXX\r\n\tAutor: XXXX\r\n\r\n5\u00BA - T\u00EDtulo: XXXX\r\n\tAutor: XXXX");
		GridBagConstraints gbc_txtrLivrosMaisPopulares = new GridBagConstraints();
		gbc_txtrLivrosMaisPopulares.fill = GridBagConstraints.BOTH;
		gbc_txtrLivrosMaisPopulares.insets = new Insets(0, 0, 5, 0);
		gbc_txtrLivrosMaisPopulares.gridwidth = 4;
		gbc_txtrLivrosMaisPopulares.gridx = 1;
		gbc_txtrLivrosMaisPopulares.gridy = 2;
		panel.add(txtrLivrosMaisPopulares, gbc_txtrLivrosMaisPopulares);
		
		JButton button_1 = new JButton("Imprimir");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 4;
		panel.add(button_1, gbc_button_1);
		
		JButton button = new JButton("Voltar ao Menu Inicial");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuRelatorios());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
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
