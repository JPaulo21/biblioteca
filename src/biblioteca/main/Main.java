package biblioteca.main;

import java.awt.EventQueue;

import biblioteca.apresentacao.Frame;
import biblioteca.persistencia.Conexao;

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					initialize();
					
					Frame frame = new Frame();
					frame.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void initialize() {
		
		//Verificar conexão com o Banco de Dados
		Conexao.getConnection();
		
	}
	
}

