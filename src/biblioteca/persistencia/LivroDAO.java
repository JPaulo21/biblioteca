package biblioteca.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import biblioteca.entidades.Livro;

public class LivroDAO {
	
	Connection c = Conexao.getConnection();
	
	public void cadastrar(Livro l){
		
		String sql = "Insert into tlivro (titulo, autor, genero, dataLancamento, quantidade, edicao, cod ) values "
				+ "(?, ?, ?, ?, ?, ?, SEQ_ID.NEXTVAL)";
		
		try {
			PreparedStatement p = c.prepareStatement(sql);
			
			p.setString(1, l.getTitulo());
			p.setString(2, l.getAutor());
			p.setString(3, l.getGenero());
			p.setString(4, l.getDataLancamento());
			p.setInt(5, l.getQuantidade());
			p.setString(6, l.getEdicao());
				
			p.execute();
			p.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
