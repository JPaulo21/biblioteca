package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

public class AcervoLivros extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcervoLivros frame = new AcervoLivros();
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
	public AcervoLivros() {
		
		
		
		JLabel lblAcervoDeLivros = new JLabel("Acervo de Livros");
		lblAcervoDeLivros.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAcervoDeLivros = new GridBagConstraints();
		gbc_lblAcervoDeLivros.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAcervoDeLivros.insets = new Insets(0, 0, 5, 5);
		gbc_lblAcervoDeLivros.gridwidth = 2;
		gbc_lblAcervoDeLivros.gridx = 2;
		gbc_lblAcervoDeLivros.gridy = 1;
		add(lblAcervoDeLivros, gbc_lblAcervoDeLivros);
		
		JLabel lblNmeroDeLivros = new JLabel("N\u00FAmero de livros:");
		lblNmeroDeLivros.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNmeroDeLivros = new GridBagConstraints();
		gbc_lblNmeroDeLivros.fill = GridBagConstraints.BOTH;
		gbc_lblNmeroDeLivros.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDeLivros.gridx = 2;
		gbc_lblNmeroDeLivros.gridy = 2;
		add(lblNmeroDeLivros, gbc_lblNmeroDeLivros);
		
		JLabel lblXxxx = new JLabel("XXXX");
		lblXxxx.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblXxxx = new GridBagConstraints();
		gbc_lblXxxx.fill = GridBagConstraints.BOTH;
		gbc_lblXxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxx.gridx = 3;
		gbc_lblXxxx.gridy = 2;
		add(lblXxxx, gbc_lblXxxx);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblCdigo = new GridBagConstraints();
		gbc_lblCdigo.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblCdigo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigo.gridx = 2;
		gbc_lblCdigo.gridy = 4;
		add(lblCdigo, gbc_lblCdigo);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		lblTtulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTtulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblTtulo = new GridBagConstraints();
		gbc_lblTtulo.anchor = GridBagConstraints.NORTH;
		gbc_lblTtulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTtulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTtulo.gridx = 5;
		gbc_lblTtulo.gridy = 4;
		add(lblTtulo, gbc_lblTtulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 7;
		gbc_lblAutor.gridy = 4;
		add(lblAutor, gbc_lblAutor);
		
		JLabel lblGnero = new JLabel("G\u00EAnero");
		lblGnero.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.anchor = GridBagConstraints.NORTH;
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 9;
		gbc_lblGnero.gridy = 4;
		add(lblGnero, gbc_lblGnero);
		
		JLabel lblEdio = new JLabel("Edi\u00E7\u00E3o");
		lblEdio.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblEdio = new GridBagConstraints();
		gbc_lblEdio.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblEdio.insets = new Insets(0, 0, 5, 0);
		gbc_lblEdio.gridx = 11;
		gbc_lblEdio.gridy = 4;
		add(lblEdio, gbc_lblEdio);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 10;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{72, 49, 76, 49, 84, 40, 80, 50, 80, 49, 0};
		gbl_panel.rowHeights = new int[]{29, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label_1 = new JLabel("C\u00F3digo");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		panel.add(label_1, gbc_label_1);
		
		JLabel label_4 = new JLabel("T\u00EDtulo");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 3;
		gbc_label_4.gridy = 0;
		panel.add(label_4, gbc_label_4);
		
		JLabel label_3 = new JLabel("Autor");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 5;
		gbc_label_3.gridy = 0;
		panel.add(label_3, gbc_label_3);
		
		JLabel label_2 = new JLabel("G\u00EAnero");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 7;
		gbc_label_2.gridy = 0;
		panel.add(label_2, gbc_label_2);
		
		JLabel label = new JLabel("Edi\u00E7\u00E3o");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.gridx = 9;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridwidth = 10;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 6;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{72, 49, 76, 49, 84, 40, 80, 50, 80, 49, 0};
		gbl_panel_1.rowHeights = new int[]{31, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label_6 = new JLabel("C\u00F3digo");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_6.insets = new Insets(0, 0, 0, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 0;
		panel_1.add(label_6, gbc_label_6);
		
		JLabel label_9 = new JLabel("T\u00EDtulo");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_9.insets = new Insets(0, 0, 0, 5);
		gbc_label_9.gridx = 3;
		gbc_label_9.gridy = 0;
		panel_1.add(label_9, gbc_label_9);
		
		JLabel label_8 = new JLabel("Autor");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_8.insets = new Insets(0, 0, 0, 5);
		gbc_label_8.gridx = 5;
		gbc_label_8.gridy = 0;
		panel_1.add(label_8, gbc_label_8);
		
		JLabel label_7 = new JLabel("G\u00EAnero");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.gridx = 7;
		gbc_label_7.gridy = 0;
		panel_1.add(label_7, gbc_label_7);
		
		JLabel label_5 = new JLabel("Edi\u00E7\u00E3o");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_5.gridx = 9;
		gbc_label_5.gridy = 0;
		panel_1.add(label_5, gbc_label_5);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridwidth = 10;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 7;
		add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{72, 49, 76, 49, 84, 40, 80, 50, 80, 49, 0};
		gbl_panel_3.rowHeights = new int[]{30, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel label_16 = new JLabel("C\u00F3digo");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_16.insets = new Insets(0, 0, 0, 5);
		gbc_label_16.gridx = 1;
		gbc_label_16.gridy = 0;
		panel_3.add(label_16, gbc_label_16);
		
		JLabel label_19 = new JLabel("T\u00EDtulo");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_19.insets = new Insets(0, 0, 0, 5);
		gbc_label_19.gridx = 3;
		gbc_label_19.gridy = 0;
		panel_3.add(label_19, gbc_label_19);
		
		JLabel label_18 = new JLabel("Autor");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_18.insets = new Insets(0, 0, 0, 5);
		gbc_label_18.gridx = 5;
		gbc_label_18.gridy = 0;
		panel_3.add(label_18, gbc_label_18);
		
		JLabel label_17 = new JLabel("G\u00EAnero");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_17.insets = new Insets(0, 0, 0, 5);
		gbc_label_17.gridx = 7;
		gbc_label_17.gridy = 0;
		panel_3.add(label_17, gbc_label_17);
		
		JLabel label_15 = new JLabel("Edi\u00E7\u00E3o");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_15.gridx = 9;
		gbc_label_15.gridy = 0;
		panel_3.add(label_15, gbc_label_15);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridwidth = 10;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 8;
		add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{72, 49, 76, 49, 84, 40, 80, 50, 80, 49, 0};
		gbl_panel_2.rowHeights = new int[]{32, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel label_11 = new JLabel("C\u00F3digo");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_11.insets = new Insets(0, 0, 0, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 0;
		panel_2.add(label_11, gbc_label_11);
		
		JLabel label_14 = new JLabel("T\u00EDtulo");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_14.insets = new Insets(0, 0, 0, 5);
		gbc_label_14.gridx = 3;
		gbc_label_14.gridy = 0;
		panel_2.add(label_14, gbc_label_14);
		
		JLabel label_13 = new JLabel("Autor");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_13.insets = new Insets(0, 0, 0, 5);
		gbc_label_13.gridx = 5;
		gbc_label_13.gridy = 0;
		panel_2.add(label_13, gbc_label_13);
		
		JLabel label_12 = new JLabel("G\u00EAnero");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_12.insets = new Insets(0, 0, 0, 5);
		gbc_label_12.gridx = 7;
		gbc_label_12.gridy = 0;
		panel_2.add(label_12, gbc_label_12);
		
		JLabel label_10 = new JLabel("Edi\u00E7\u00E3o");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_10.gridx = 9;
		gbc_label_10.gridy = 0;
		panel_2.add(label_10, gbc_label_10);
		
		JButton btnNewButton = new JButton("Cadastrar Livro");
		btnNewButton.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 9;
		gbc_btnNewButton.gridy = 10;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton button = new JButton("Voltar ao Menu Inicial");
		button.setBackground(Color.WHITE);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.gridx = 11;
		gbc_button.gridy = 10;
		add(button, gbc_button);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
