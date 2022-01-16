package biblioteca.dados;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import biblioteca.entidades.Livro;
import biblioteca.entidades.Usuario;



public class Repositorio {

	
	
	private static Repositorio instancia;
	
	
	private Set<Usuario> usuarios;
	
	private HashSet<Usuario> usuario;
	
	private Usuario usuarioAceso;
	
//=============================	
	
	private Set<Livro> livros;
	
	private HashSet<Livro> livro;
	
	
	private ArrayList<Livro> pegos;

	private Set <String> datasPrazo ;
	
	private Livro livro1;
	
	/*==============*/

	
	private Repositorio() {
		this.usuarios = new HashSet<Usuario>();
		this.livros= new HashSet<Livro>();
		this.pegos = new ArrayList<Livro>();
		this.datasPrazo = new HashSet<String>();
	}
	

	
	public static Repositorio getInstancia() {
		
		if (instancia == null) {
			instancia = new Repositorio();
		}
		
		return instancia;
	}
	
	
	//Metodos
	
	
	public Set<Livro> obterTodosLivros (){
		return this.livros;
	}
	
	
	public void adicionarLivro(Livro livro){
		this.livros.add(livro);
		
	}
	
//====================
	
	public void adicionarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
		
		
	}
	
	public void acessarUsuario(Usuario usuario) {
		this.usuarioAceso = usuario;	
	}
	
	
	public Set<Usuario> obterTodosUsuarios() {
		return this.usuarios;
	}
	
	public Set<String> ObterTodosOsLivrosAtrasados (){
		return this.datasPrazo;
	}

//============================
	
	public void salvarData(Livro livro){
	
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar dataEmprestimo = Calendar.getInstance();
		
		dataEmprestimo.add(Calendar.MINUTE, 1);
		
		String prazo = (sd.format(dataEmprestimo.getTime())).toString();
		//datasPrazo = livro.getD_atrasados();
		datasPrazo.add(prazo);
	
	}
	
	// ======== 
	
	public void atualizarUsuario(Usuario usuarioAtualizado) {
		for (Usuario usuarioCadastrado : this.usuarios) {
			if (usuarioCadastrado.getCpf() == usuarioAtualizado.getCpf()) {
				usuarioCadastrado.setNome(usuarioAtualizado.getNome());
				usuarioCadastrado.setDataNascimento(usuarioAtualizado.getDataNascimento());
				usuarioCadastrado.setContato(usuarioAtualizado.getContato());
			}
		}
	}
	
	public void atualizarLivro(Livro livroAtualizado) {
		for (Livro livroCadastrado : this.livros) {
			if (livroCadastrado.getTitulo() == livroAtualizado.getTitulo()) {
				livroCadastrado.setAutor(livroAtualizado.getAutor());
				livroCadastrado.setDataLancamento(livroAtualizado.getDataLancamento());
			}
		}
	}
	
//=========
	
	public void deletarUsuario(Usuario usuario) {
		for (Usuario id : usuarios ){
			if (id == usuario){
		this.usuarios.remove(usuario);
		}
	}
}
	
//==========

	
}
