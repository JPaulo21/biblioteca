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

public class AreaCadastroUsuario extends JPanel {

	public AreaCadastroUsuario() {
	
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 663, 618);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{120, 155, 131, 96, 30, 40, 0};
		gbl_panel.rowHeights = new int[]{51, 15, 20, 15, 14, 15, 14, 15, 14, 0, 20, 128, 0, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("Cadastrar Usu\u00E1rio");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("Nome: ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 2;
		panel.add(label_1, gbc_label_1);
		
		JLabel lblNomeUsurio = new JLabel("Nome Usu\u00E1rio");
		GridBagConstraints gbc_lblNomeUsurio = new GridBagConstraints();
		gbc_lblNomeUsurio.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNomeUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeUsurio.gridx = 2;
		gbc_lblNomeUsurio.gridy = 2;
		panel.add(lblNomeUsurio, gbc_lblNomeUsurio);
		
		JLabel label_2 = new JLabel("Data de Nascimento: ");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 4;
		panel.add(label_2, gbc_label_2);
		
		JLabel lblXxxxxxxx = new JLabel("XX/XX/XXXX");
		GridBagConstraints gbc_lblXxxxxxxx = new GridBagConstraints();
		gbc_lblXxxxxxxx.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblXxxxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxxx.gridx = 2;
		gbc_lblXxxxxxxx.gridy = 4;
		panel.add(lblXxxxxxxx, gbc_lblXxxxxxxx);
		
		JLabel label_3 = new JLabel("CPF: ");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 6;
		panel.add(label_3, gbc_label_3);
		
		JLabel lblXxxxxxxxxxx = new JLabel("XXX.XXX.XXX-XX");
		GridBagConstraints gbc_lblXxxxxxxxxxx = new GridBagConstraints();
		gbc_lblXxxxxxxxxxx.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblXxxxxxxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxxxxxx.gridx = 2;
		gbc_lblXxxxxxxxxxx.gridy = 6;
		panel.add(lblXxxxxxxxxxx, gbc_lblXxxxxxxxxxx);
		
		JLabel lblContato = new JLabel("Contato: ");
		lblContato.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblContato = new GridBagConstraints();
		gbc_lblContato.anchor = GridBagConstraints.WEST;
		gbc_lblContato.insets = new Insets(0, 0, 5, 5);
		gbc_lblContato.gridx = 1;
		gbc_lblContato.gridy = 8;
		panel.add(lblContato, gbc_lblContato);
		
		JLabel lblXxxxxxx = new JLabel("XXXXX-XXXX");
		GridBagConstraints gbc_lblXxxxxxx = new GridBagConstraints();
		gbc_lblXxxxxxx.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblXxxxxxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxx.gridx = 2;
		gbc_lblXxxxxxx.gridy = 8;
		panel.add(lblXxxxxxx, gbc_lblXxxxxxx);
		
		JLabel lblCdigoDeUsurio = new JLabel("C\u00F3digo de Usu\u00E1rio: ");
		lblCdigoDeUsurio.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCdigoDeUsurio = new GridBagConstraints();
		gbc_lblCdigoDeUsurio.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCdigoDeUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigoDeUsurio.gridx = 1;
		gbc_lblCdigoDeUsurio.gridy = 10;
		panel.add(lblCdigoDeUsurio, gbc_lblCdigoDeUsurio);
		
		JLabel lblXxxxxxx_1 = new JLabel("XXXXXXX");
		GridBagConstraints gbc_lblXxxxxxx_1 = new GridBagConstraints();
		gbc_lblXxxxxxx_1.anchor = GridBagConstraints.WEST;
		gbc_lblXxxxxxx_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxxxxxx_1.gridx = 2;
		gbc_lblXxxxxxx_1.gridy = 10;
		panel.add(lblXxxxxxx_1, gbc_lblXxxxxxx_1);
		
		JButton btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.anchor = GridBagConstraints.NORTH;
		gbc_btnEditar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 2;
		gbc_btnEditar.gridy = 12;
		panel.add(btnEditar, gbc_btnEditar);
		
		JButton btnFinalizarSesso = new JButton("Finalizar Sess\u00E3o");
		GridBagConstraints gbc_btnFinalizarSesso = new GridBagConstraints();
		gbc_btnFinalizarSesso.insets = new Insets(0, 0, 5, 5);
		gbc_btnFinalizarSesso.anchor = GridBagConstraints.NORTH;
		gbc_btnFinalizarSesso.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFinalizarSesso.gridx = 3;
		gbc_btnFinalizarSesso.gridy = 12;
		panel.add(btnFinalizarSesso, gbc_btnFinalizarSesso);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 12;
		panel.add(btnCancelar, gbc_btnCancelar);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
}
