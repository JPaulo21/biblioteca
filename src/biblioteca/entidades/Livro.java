package biblioteca.entidades;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Livro {
	
	private String titulo;
	private String autor ;
	private String genero ;
	private String dataLancamento;
	private Integer quantidade;
	private String edicao;
	private ImageIcon capa;

	
	//========
	

	
	//=========
	

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public String toString(){
		return this.titulo;
		
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public ImageIcon getCapa() {
		return capa;
	}
	public void setCapa(Icon icon) {
		this.capa = (ImageIcon) icon;
	}
	
}
