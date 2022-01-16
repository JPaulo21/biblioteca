package biblioteca.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	

	
		static Connection con;
		
		protected static String user = "JP";
		protected static String password = "123";
		protected static String url = "jdbc:oracle:thin:@localhost:1521/xe";
		
		public static Connection getConnection() {
			
			try {
				
				con = DriverManager.getConnection(url, user, password);
				System.out.println("Conectado com sucesso!");
				
						
				
			} catch (SQLException e) {
				System.out.println("Não Conectado");
				
				e.printStackTrace();
			}
			return con;
			
			
		
		
	}

}
