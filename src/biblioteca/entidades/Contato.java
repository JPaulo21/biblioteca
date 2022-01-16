package biblioteca.entidades;

public class Contato {

	private String email;
	private String numCelular;
	
	//=======
	
	public Contato(String email, String numCelular) {;
	
	this.email = email;
	this.numCelular = numCelular;	
	}
	
	//=====
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNumCelular() {
		return numCelular;
	}



	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}


	
}
