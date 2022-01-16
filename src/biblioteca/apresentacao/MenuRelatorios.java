package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuRelatorios extends JPanel {

	private JPanel contentPane;


	 
	public MenuRelatorios() {
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 717, 617);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{50, 186, 146, 140, 50, 0};
		gbl_panel.rowHeights = new int[]{67, 52, 140, 30, 31, 30, 55, 30, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblRelatrios = new JLabel("Relat\u00F3rios");
		lblRelatrios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelatrios.setFont(new Font("Tahoma", Font.BOLD, 27));
		GridBagConstraints gbc_lblRelatrios = new GridBagConstraints();
		gbc_lblRelatrios.fill = GridBagConstraints.VERTICAL;
		gbc_lblRelatrios.insets = new Insets(0, 0, 5, 5);
		gbc_lblRelatrios.gridwidth = 2;
		gbc_lblRelatrios.gridx = 1;
		gbc_lblRelatrios.gridy = 1;
		panel.add(lblRelatrios, gbc_lblRelatrios);
		
		JButton btnLivrosMaisPopulares = new JButton("Livros mais Populares");
		btnLivrosMaisPopulares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new LivrosPopulares());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		btnLivrosMaisPopulares.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnLivrosMaisPopulares = new GridBagConstraints();
		gbc_btnLivrosMaisPopulares.fill = GridBagConstraints.VERTICAL;
		gbc_btnLivrosMaisPopulares.insets = new Insets(0, 0, 5, 5);
		gbc_btnLivrosMaisPopulares.gridx = 1;
		gbc_btnLivrosMaisPopulares.gridy = 3;
		panel.add(btnLivrosMaisPopulares, gbc_btnLivrosMaisPopulares);
		
		JButton btnAtrasosDaSemana = new JButton("Atrasos da Semana");
		btnAtrasosDaSemana.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnAtrasosDaSemana = new GridBagConstraints();
		gbc_btnAtrasosDaSemana.anchor = GridBagConstraints.WEST;
		gbc_btnAtrasosDaSemana.fill = GridBagConstraints.VERTICAL;
		gbc_btnAtrasosDaSemana.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtrasosDaSemana.gridx = 2;
		gbc_btnAtrasosDaSemana.gridy = 3;
		panel.add(btnAtrasosDaSemana, gbc_btnAtrasosDaSemana);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.getFrame().setContentPane(new MenuInicial());
				Frame.getFrame().getContentPane().revalidate();
			}
		});
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 3;
		gbc_btnVoltar.gridy = 7;
		panel.add(btnVoltar, gbc_btnVoltar);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
