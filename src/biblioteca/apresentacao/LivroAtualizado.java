package biblioteca.apresentacao;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LivroAtualizado extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LivroAtualizado frame = new LivroAtualizado();
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
	public LivroAtualizado() {
		setBounds(100, 100, 260, 185);
		getContentPane().setLayout(null);
		
		JLabel lblLivroAtualizado = new JLabel("Livro Atualizado!");
		lblLivroAtualizado.setHorizontalAlignment(SwingConstants.CENTER);
		lblLivroAtualizado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLivroAtualizado.setBounds(53, 51, 138, 25);
		getContentPane().add(lblLivroAtualizado);
		
		JButton button = new JButton("OK");
		button.setBounds(10, 109, 89, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(145, 109, 89, 23);
		getContentPane().add(button_1);

	}

}
