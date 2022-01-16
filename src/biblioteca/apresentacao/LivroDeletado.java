package biblioteca.apresentacao;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LivroDeletado extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LivroDeletado frame = new LivroDeletado();
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
	public LivroDeletado() {
		setBounds(100, 100, 260, 185);
		getContentPane().setLayout(null);
		
		JLabel lblLivroDeletado = new JLabel("Livro Deletado!");
		lblLivroDeletado.setHorizontalAlignment(SwingConstants.CENTER);
		lblLivroDeletado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLivroDeletado.setBounds(53, 46, 138, 25);
		getContentPane().add(lblLivroDeletado);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(10, 99, 89, 23);
		getContentPane().add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(145, 99, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
