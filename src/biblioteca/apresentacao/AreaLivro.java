package biblioteca.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AreaLivro extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaLivro frame = new AreaLivro();
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
	public AreaLivro() {
		
		setBounds(100, 100, 733, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 717, 618);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{41, 66, 49, 31, 100, 198, 89, 30, 129, 0};
		gbl_panel.rowHeights = new int[]{0, 20, 31, 14, 59, 14, 58, 14, 56, 14, 52, 14, 56, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("Cadastrar Livro");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTHWEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridwidth = 4;
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("T\u00EDtulo: ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		panel.add(label_1, gbc_label_1);
		
		JLabel lblNomeDoLivr = new JLabel("Nome do Livro");
		GridBagConstraints gbc_lblNomeDoLivr = new GridBagConstraints();
		gbc_lblNomeDoLivr.anchor = GridBagConstraints.NORTH;
		gbc_lblNomeDoLivr.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNomeDoLivr.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoLivr.gridwidth = 5;
		gbc_lblNomeDoLivr.gridx = 2;
		gbc_lblNomeDoLivr.gridy = 3;
		panel.add(lblNomeDoLivr, gbc_lblNomeDoLivr);
		
		JLabel label_2 = new JLabel("Autor: ");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 5;
		panel.add(label_2, gbc_label_2);
		
		JLabel lblNomeDoAutor = new JLabel("Nome do Autor");
		GridBagConstraints gbc_lblNomeDoAutor = new GridBagConstraints();
		gbc_lblNomeDoAutor.anchor = GridBagConstraints.NORTH;
		gbc_lblNomeDoAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNomeDoAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoAutor.gridwidth = 5;
		gbc_lblNomeDoAutor.gridx = 2;
		gbc_lblNomeDoAutor.gridy = 5;
		panel.add(lblNomeDoAutor, gbc_lblNomeDoAutor);
		
		JLabel label_3 = new JLabel("Data de lan\u00E7amento: ");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridwidth = 3;
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 7;
		panel.add(label_3, gbc_label_3);
		
		JLabel lblXxxxxxxx = new JLabel("XX/XX/XXXX");
		GridBagConstraints gbc_lblXxxxxxxx = new GridBagConstraints();
		gbc_lblXxxxxxxx.anchor = GridBagConstraints.NORTH;
		gbc_lblXxxxxxxx.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblXxxxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxxx.gridx = 4;
		gbc_lblXxxxxxxx.gridy = 7;
		panel.add(lblXxxxxxxx, gbc_lblXxxxxxxx);
		
		JLabel lblEdio = new JLabel("Edi\u00E7\u00E3o");
		GridBagConstraints gbc_lblEdio = new GridBagConstraints();
		gbc_lblEdio.anchor = GridBagConstraints.NORTH;
		gbc_lblEdio.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEdio.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdio.gridwidth = 5;
		gbc_lblEdio.gridx = 2;
		gbc_lblEdio.gridy = 9;
		panel.add(lblEdio, gbc_lblEdio);
		
		JLabel label_4 = new JLabel("Edi\u00E7\u00E3o: ");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 9;
		panel.add(label_4, gbc_label_4);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo do Livro: ");
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCdigo = new GridBagConstraints();
		gbc_lblCdigo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCdigo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigo.gridwidth = 3;
		gbc_lblCdigo.gridx = 1;
		gbc_lblCdigo.gridy = 11;
		panel.add(lblCdigo, gbc_lblCdigo);
		
		JLabel lblXxxxxx = new JLabel("XXXXXX");
		GridBagConstraints gbc_lblXxxxxx = new GridBagConstraints();
		gbc_lblXxxxxx.anchor = GridBagConstraints.NORTH;
		gbc_lblXxxxxx.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblXxxxxx.insets = new Insets(0, 0, 5, 0);
		gbc_lblXxxxxx.gridwidth = 6;
		gbc_lblXxxxxx.gridx = 3;
		gbc_lblXxxxxx.gridy = 11;
		panel.add(lblXxxxxx, gbc_lblXxxxxx);
		
		JButton btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.anchor = GridBagConstraints.NORTH;
		gbc_btnEditar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditar.gridx = 6;
		gbc_btnEditar.gridy = 13;
		panel.add(btnEditar, gbc_btnEditar);
		
		JButton btnFinalizarSesso = new JButton("Finalizar Sess\u00E3o");
		GridBagConstraints gbc_btnFinalizarSesso = new GridBagConstraints();
		gbc_btnFinalizarSesso.anchor = GridBagConstraints.NORTH;
		gbc_btnFinalizarSesso.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFinalizarSesso.gridx = 8;
		gbc_btnFinalizarSesso.gridy = 13;
		panel.add(btnFinalizarSesso, gbc_btnFinalizarSesso);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

}
