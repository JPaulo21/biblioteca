package biblioteca.apresentacao;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import biblioteca.entidades.Livro;
import biblioteca.entidades.Usuario;
import biblioteca.exececoes.LivroException;
import biblioteca.exececoes.UsuarioInvalidoException;
import biblioteca.negocio.Controlador;
import biblioteca.negocio.ControladorLivro;

public class Frame extends JFrame {

	private static JFrame contentPane;




	public Frame() 
	{
		
		contentPane = new JFrame();
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBounds(100, 100, 600, 500);
		contentPane.setTitle("Biblioteca");
		contentPane.setLocationRelativeTo(null);
		contentPane.setContentPane(new MenuInicial());
		
	}
	
	
			 
	public static JFrame getFrame() {
		return contentPane;
	}


	public static void setContentPane(JFrame contentPane) {
		Frame.contentPane = contentPane;
	}

}
