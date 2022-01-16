package biblioteca.apresentacao;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UsuarioDeletado extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioDeletado frame = new UsuarioDeletado();
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
	public UsuarioDeletado() {
		setBounds(100, 100, 288, 194);
		getContentPane().setLayout(null);
		
		JLabel lblUsurioDeletado = new JLabel("Usu\u00E1rio Deletado!");
		lblUsurioDeletado.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsurioDeletado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsurioDeletado.setBounds(58, 43, 155, 25);
		getContentPane().add(lblUsurioDeletado);
		
		JButton button = new JButton("OK");
		button.setBounds(24, 96, 89, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(159, 96, 89, 23);
		getContentPane().add(button_1);

	}

}
