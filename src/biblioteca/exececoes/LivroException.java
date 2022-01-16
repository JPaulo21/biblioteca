package biblioteca.exececoes;

public class LivroException extends Exception {
	
	
	private boolean AutorVazio;
	
	
	
	public LivroException(){
	}



	public boolean isAutorVazio() {
		return AutorVazio;
	}



	public void setAutorVazio(boolean autorVazio) {
		AutorVazio = autorVazio;
	}
	
	

}
