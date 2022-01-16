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

public class MultaImpressao extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultaImpressao frame = new MultaImpressao();
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
	public MultaImpressao() {
		setBounds(100, 100, 733, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 169, 294, 89, 135, 0};
		gbl_contentPane.rowHeights = new int[]{0, 20, 483, 45, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Multa por Atraso");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextArea txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = new JTextArea();
		txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		GridBagConstraints gbc_txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = new GridBagConstraints();
		gbc_txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.fill = GridBagConstraints.BOTH;
		gbc_txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.insets = new Insets(0, 0, 5, 0);
		gbc_txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.gridwidth = 4;
		gbc_txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.gridx = 1;
		gbc_txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.gridy = 2;
		contentPane.add(txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, gbc_txtrXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
		
		JButton btnImprimir = new JButton("Imprimir");
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.anchor = GridBagConstraints.NORTH;
		gbc_btnImprimir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnImprimir.insets = new Insets(0, 0, 0, 5);
		gbc_btnImprimir.gridx = 3;
		gbc_btnImprimir.gridy = 4;
		contentPane.add(btnImprimir, gbc_btnImprimir);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu Inicial");
		GridBagConstraints gbc_btnVoltarAoMenu = new GridBagConstraints();
		gbc_btnVoltarAoMenu.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnVoltarAoMenu.gridx = 4;
		gbc_btnVoltarAoMenu.gridy = 4;
		contentPane.add(btnVoltarAoMenu, gbc_btnVoltarAoMenu);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
