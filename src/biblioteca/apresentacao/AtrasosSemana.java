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

public class AtrasosSemana extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtrasosSemana frame = new AtrasosSemana();
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
	public AtrasosSemana() {
		
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
		gbl_panel.columnWidths = new int[]{0, 169, 294, 89, 135, 0};
		gbl_panel.rowHeights = new int[]{0, 20, 483, 45, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblAtrasosDaSemana = new JLabel("Atrasos da Semana");
		lblAtrasosDaSemana.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAtrasosDaSemana = new GridBagConstraints();
		gbc_lblAtrasosDaSemana.anchor = GridBagConstraints.NORTH;
		gbc_lblAtrasosDaSemana.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAtrasosDaSemana.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtrasosDaSemana.gridx = 1;
		gbc_lblAtrasosDaSemana.gridy = 1;
		panel.add(lblAtrasosDaSemana, gbc_lblAtrasosDaSemana);
		
		JTextArea txtrTotalDeAtrasos = new JTextArea();
		txtrTotalDeAtrasos.setText("Total de atrasos nessa semana:\r\nXX Atrasos");
		GridBagConstraints gbc_txtrTotalDeAtrasos = new GridBagConstraints();
		gbc_txtrTotalDeAtrasos.fill = GridBagConstraints.BOTH;
		gbc_txtrTotalDeAtrasos.insets = new Insets(0, 0, 5, 0);
		gbc_txtrTotalDeAtrasos.gridwidth = 4;
		gbc_txtrTotalDeAtrasos.gridx = 1;
		gbc_txtrTotalDeAtrasos.gridy = 2;
		panel.add(txtrTotalDeAtrasos, gbc_txtrTotalDeAtrasos);
		
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
