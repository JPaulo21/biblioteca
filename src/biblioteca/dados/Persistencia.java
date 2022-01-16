package biblioteca.dados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class Persistencia {

	public void criaDiretorio() {
		File diretorio = new File("c:\\Biblioteca");
		if (!diretorio.exists()) {
			diretorio.mkdir();
		}
	}

	public void Gravar(String nome, String cpf, String dataNascimento, String email, String telefone) {

		try {
			OutputStream is = new FileOutputStream("C:\\Biblioteca\\cadastroClientes.txt", true); // Seta o caminho do arquivo *sempre usar
																			// True que � pra n�o substituir o arquivo
			OutputStreamWriter osw = new OutputStreamWriter(is);
			BufferedWriter bw = new BufferedWriter(osw);

			String dados = nome + "|" + cpf + "|" + dataNascimento + "|" + email + "|" + telefone + "\n";

			bw.write(dados);
			bw.close();

		} catch (IOException e) {
			//JOptionPane.showMessageDialog(null, e.getStackTrace());
		}

	}

	

	public void GravarLivro (String titulo, String autor, String genero, String dataLancamento, String Exemplares, String edicao) {
		try {
			OutputStream is = new FileOutputStream("C:\\Biblioteca\\cadastroLivro.txt", true);
			OutputStreamWriter osw =new OutputStreamWriter(is);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String dadosLivros = titulo+"|"+autor+"|"+genero+"|"+dataLancamento+"|"+edicao+ "\n";
			
			bw.write(dadosLivros);
			bw.close();
			
		} catch (Exception e) {
			
			
		}
	}
}
