package biblioteca.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import biblioteca.dados.Repositorio;

public class Usuario {

	private String nome;
	private String dataNascimento;
	private String cpf;
	private Set<Livro> pegos;
	private Set<Livro> atrasados;
	private Contato contato;
	private int codigo;

	// ======

	public Usuario() {
		this.pegos = new HashSet<Livro>();
	}

	public Usuario(String nome, String dataNascimento, String cpf, Set<Livro> pegos, Contato contato) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.contato = contato;
	}

	// =======

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Set<Livro> getPegos() {
		return pegos;
	}

	public void setPegos(Set<Livro> pegos) {
		this.pegos = pegos;
	}

	public Set<Livro> getAtrasados() {
		return atrasados;
	}

	public void setAtrasados(Set<Livro> atrasados) {
		this.atrasados = atrasados;
	}

	public String toString() {
		return this.nome;
	}

}
