package biblioteca.apresentacao;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InserirData extends JInternalFrame {
	private JTextField txtXxxxxxxx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirData frame = new InserirData();
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
	public InserirData() {
		setBounds(100, 100, 415, 249);
		getContentPane().setLayout(null);
		
		JLabel lblInserirData = new JLabel("Inserir Data");
		lblInserirData.setBounds(-67, 11, 434, 20);
		lblInserirData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInserirData.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblInserirData);
		
		txtXxxxxxxx = new JTextField();
		txtXxxxxxxx.setHorizontalAlignment(SwingConstants.CENTER);
		txtXxxxxxxx.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtXxxxxxxx.setText("XX/XX/XXXX");
		txtXxxxxxxx.setBounds(67, 51, 164, 20);
		getContentPane().add(txtXxxxxxxx);
		txtXxxxxxxx.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOk.setBounds(35, 98, 89, 23);
		getContentPane().add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelar.setBounds(174, 98, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
