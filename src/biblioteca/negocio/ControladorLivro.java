package biblioteca.negocio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import biblioteca.dados.Repositorio;
import biblioteca.entidades.Livro;
import biblioteca.entidades.Livro;
import biblioteca.entidades.Usuario;
import biblioteca.exececoes.LivroException;

	

public class ControladorLivro {

	public void cadastrarLivro (Livro exemplar) throws LivroException {
		
		LivroException livroException = validarLivro(exemplar);
		
		if(livroException != null){
			throw livroException;
		} else {
			Repositorio.getInstancia().adicionarLivro(exemplar);
		}
	}
	
	public void adicionarLivroPego (Livro livro) throws LivroException{
		
		
		Repositorio.getInstancia().adicionarLivro(livro);
		
	}
	
	public void atualizarLivro(Livro livro) throws LivroException  {
		
		Repositorio.getInstancia().atualizarLivro(livro);
	}

//	public Livro retornarLivro(){
//		Livro livro = Repositorio.getInstancia().retornarLivros();
//		return livro;
//	}

	public  Set<Livro> buscarLivrosPorTitulo(String string) {
		Set<Livro> livrosEncontrados = new HashSet<Livro>();
		
		Set<Livro> todosLivros = Repositorio.getInstancia().obterTodosLivros();
		for (Livro exemplar : todosLivros) {
			
			if (exemplar.getTitulo().toUpperCase().contains(string.toUpperCase())) {
				livrosEncontrados.add(exemplar);
			}
		}
		
		return livrosEncontrados;
	}
	
	public  Set<Livro> verificarLivros(Set<Livro> pegos ){
		Set <String> Atrasados = Repositorio.getInstancia().ObterTodosOsLivrosAtrasados();
		Set <Livro> AllBooks = Repositorio.getInstancia().obterTodosLivros();
		Set <Livro> dAtrasados = new HashSet();
		
		for(Livro livro : AllBooks ){
			for (String atrasados : Atrasados){
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Calendar now = Calendar.getInstance();
				Calendar cal = Calendar.getInstance();		
				try {
					cal.setTime(sdf.parse(atrasados));
					
					if(now.getTime().after(cal.getTime()) ){
					
					dAtrasados.add(livro);
						
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		
		return dAtrasados;
		
	}
	
	public void gerarMulta(Usuario usuario, Livro livro) {
		
		File diretorio = new File("c:\\Biblioteca");
		if (!diretorio.exists()) {
			diretorio.mkdir();
		}
	
	//public void Gravar(String nome, String cpf, String dataNascimento, String email, String telefone) {

		try {
			OutputStream is = new FileOutputStream("C:\\Biblioteca\\cadastroClientes.txt", true); // Seta o caminho do arquivo *sempre usar
																			// True que � pra n�o substituir o arquivo
			OutputStreamWriter osw = new OutputStreamWriter(is);
			BufferedWriter bw = new BufferedWriter(osw);

	//		String dados =   usuario.getNome()+" está em divida com a Biblioteca! O valor da divida é de "+ livro.getD_atrasados() +"\n";

		//	bw.write(dados);
		//	bw.close();

		} catch (IOException e) {
			//JOptionPane.showMessageDialog(null, e.getStackTrace());
		}

	}
	
	public void ctrlData(Livro exemplar){
		Repositorio.getInstancia().salvarData(exemplar);
	}
	
	
//	public void deletarLivro(Livro exemplar){
//		Repositorio.getInstancia().deletarLivro(exemplar);
//	}
	
//======================	
	
	private Set<Livro> obterTodosLivros(){
		return Repositorio.getInstancia().obterTodosLivros();
	}
	
	/*private ArrayList<Livro> pegos(){	
		return Repositorio.getInstancia().livrosPegos();
	}*/
	
	private LivroException validarLivro(Livro exemplar){
		LivroException livroException = null;
		
		if (exemplar.getAutor() == null || exemplar.getAutor().trim().isEmpty()){
			if(livroException == null){
				livroException = new LivroException();
			}
			
			livroException.setAutorVazio(true);
		}
		
		return livroException;
		
	}


}




