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

public class PesquisaUsuarioConsulta extends JPanel {

	private JPanel contentPane;
	private JTextField txtNomeDoUsurio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisaUsuarioConsulta frame = new PesquisaUsuarioConsulta();
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
	public PesquisaUsuarioConsulta() {
		setBounds(100, 100, 733, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 734, 617);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 68, 30, 172, 89, 194, 161, 0};
		gbl_panel.rowHeights = new int[]{23, 0, 23, 23, 147, 317, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPesquisarUsurio = new JLabel("Pesquisar Usu\u00E1rio");
		lblPesquisarUsurio.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblPesquisarUsurio = new GridBagConstraints();
		gbc_lblPesquisarUsurio.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPesquisarUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPesquisarUsurio.gridwidth = 3;
		gbc_lblPesquisarUsurio.gridx = 1;
		gbc_lblPesquisarUsurio.gridy = 1;
		panel.add(lblPesquisarUsurio, gbc_lblPesquisarUsurio);
		
		JRadioButton rdbtnNome = new JRadioButton("Nome");
		GridBagConstraints gbc_rdbtnNome = new GridBagConstraints();
		gbc_rdbtnNome.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnNome.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNome.gridx = 1;
		gbc_rdbtnNome.gridy = 2;
		panel.add(rdbtnNome, gbc_rdbtnNome);
		
		JRadioButton rdbtnCdigoDoUsurio = new JRadioButton("C\u00F3digo do usu\u00E1rio");
		GridBagConstraints gbc_rdbtnCdigoDoUsurio = new GridBagConstraints();
		gbc_rdbtnCdigoDoUsurio.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnCdigoDoUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCdigoDoUsurio.gridx = 3;
		gbc_rdbtnCdigoDoUsurio.gridy = 2;
		panel.add(rdbtnCdigoDoUsurio, gbc_rdbtnCdigoDoUsurio);
		
		txtNomeDoUsurio = new JTextField();
		txtNomeDoUsurio.setText("Nome do Usu\u00E1rio");
		txtNomeDoUsurio.setColumns(10);
		GridBagConstraints gbc_txtNomeDoUsurio = new GridBagConstraints();
		gbc_txtNomeDoUsurio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomeDoUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_txtNomeDoUsurio.gridwidth = 3;
		gbc_txtNomeDoUsurio.gridx = 1;
		gbc_txtNomeDoUsurio.gridy = 3;
		panel.add(txtNomeDoUsurio, gbc_txtNomeDoUsurio);
		
		JButton button = new JButton("Pesquisar");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 3;
		panel.add(button, gbc_button);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridwidth = 6;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 4;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{20, 120, 90, 376, 89, 0};
		gbl_panel_1.rowHeights = new int[]{23, 14, 14, 14, 14, 23, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		panel_1.add(lblNome, gbc_lblNome);
		
		JLabel lblNomeDoUsurio = new JLabel("Nome do Usu\u00E1rio");
		GridBagConstraints gbc_lblNomeDoUsurio = new GridBagConstraints();
		gbc_lblNomeDoUsurio.anchor = GridBagConstraints.NORTH;
		gbc_lblNomeDoUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoUsurio.gridwidth = 2;
		gbc_lblNomeDoUsurio.gridx = 1;
		gbc_lblNomeDoUsurio.gridy = 1;
		panel_1.add(lblNomeDoUsurio, gbc_lblNomeDoUsurio);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDataDeNascimento = new GridBagConstraints();
		gbc_lblDataDeNascimento.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDataDeNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento.gridwidth = 2;
		gbc_lblDataDeNascimento.gridx = 1;
		gbc_lblDataDeNascimento.gridy = 2;
		panel_1.add(lblDataDeNascimento, gbc_lblDataDeNascimento);
		
		JLabel label_7 = new JLabel("XX/XX/XXXX");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.NORTH;
		gbc_label_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 2;
		gbc_label_7.gridy = 2;
		panel_1.add(label_7, gbc_label_7);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 3;
		panel_1.add(lblCpf, gbc_lblCpf);
		
		JLabel lblXxxxxxxxxxx = new JLabel("XXX.XXX.XXX-XX");
		GridBagConstraints gbc_lblXxxxxxxxxxx = new GridBagConstraints();
		gbc_lblXxxxxxxxxxx.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblXxxxxxxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxxxxxx.gridx = 1;
		gbc_lblXxxxxxxxxxx.gridy = 3;
		panel_1.add(lblXxxxxxxxxxx, gbc_lblXxxxxxxxxxx);
		
		JLabel label_4 = new JLabel("XXXXXX");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.NORTH;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 4;
		panel_1.add(label_4, gbc_label_4);
		
		JLabel label_2 = new JLabel("C\u00F3digo:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 4;
		panel_1.add(label_2, gbc_label_2);
		
		JButton button_2 = new JButton("Acessar");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.NORTH;
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.gridx = 4;
		gbc_button_2.gridy = 5;
		panel_1.add(button_2, gbc_button_2);
		
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
