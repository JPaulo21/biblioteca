package biblioteca.negocio;

import java.util.HashSet;

import java.util.Set;

import biblioteca.entidades.Livro;
import biblioteca.entidades.Usuario;
import biblioteca.exececoes.LivroException;
import biblioteca.exececoes.UsuarioInvalidoException;
import biblioteca.dados.Repositorio;


public class Controlador {
	
	public void cadastrarUsuario(Usuario usuario) throws UsuarioInvalidoException {
		
		UsuarioInvalidoException usuarioInvalidoException = validarUsuario(usuario);
		
		if (usuarioInvalidoException != null) {
			
			throw usuarioInvalidoException;
		} else {
			
			Repositorio.getInstancia().adicionarUsuario(usuario);
		}
	}

	public void acessarUsuario(Usuario usuario) throws UsuarioInvalidoException {
		
		UsuarioInvalidoException usuarioInvalidoException = validarUsuario(usuario);
		
		if (usuarioInvalidoException != null) {
			
			throw usuarioInvalidoException;
		} else {
			
			Repositorio.getInstancia().acessarUsuario(usuario);
		}
	}
	
	public Set<Usuario> buscarUsuarioPorNome(String nome) {
		Set<Usuario> usuariosEncontrados = new HashSet<Usuario>();
		
		Set<Usuario> todosUsuarios = Repositorio.getInstancia().obterTodosUsuarios();
		for (Usuario usuario : todosUsuarios) {
			if (usuario.getNome().toUpperCase().contains(nome.toUpperCase())) {
				usuariosEncontrados.add(usuario);
			}
		}
	
	
		return usuariosEncontrados;
	}
	
	
	
	public Set<Usuario> obterTodosUsuarios() {
		return Repositorio.getInstancia().obterTodosUsuarios();
	}
	
	public void atualizarUsuario(Usuario usuario) throws UsuarioInvalidoException  {
		
		UsuarioInvalidoException usuarioInvalidoException = validarUsuario(usuario);
		
		if (usuarioInvalidoException != null) {
			
			throw usuarioInvalidoException;
		} else {
			
			Repositorio.getInstancia().atualizarUsuario(usuario);
		}
	}
	
	
	//public void adicionarLivroPego(Exemplar exemplar) { 
		//Repositorio.getInstancia().AdicionarLivrosPegos(exemplar);
		
		//Set<Exemplar> pegos = (Set<Exemplar>) exemplar;
	
	
	/*public Set<Exemplar> livrosPegos(){
		
		//return.this.pegos;
	}*/

	public void deletarUsuario(Usuario usuario) {
		Repositorio.getInstancia().deletarUsuario(usuario);
	}
	
	
	private UsuarioInvalidoException validarUsuario(Usuario usuario){
		UsuarioInvalidoException usuarioinvalidoexception = null;
		
		if (usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
			if (usuarioinvalidoexception == null) {
				usuarioinvalidoexception = new UsuarioInvalidoException();
			}
			
			usuarioinvalidoexception.setNomeVazio(true);
			
		}
		
		return usuarioinvalidoexception;
	
		}

	}
	

