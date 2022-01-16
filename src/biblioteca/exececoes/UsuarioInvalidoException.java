package biblioteca.exececoes;

public class UsuarioInvalidoException extends Exception {
	

		private boolean nomeVazio;
		private boolean cpfVazio;
		private boolean cpfInvalido;
		private boolean dataNascimentoVazia;
		private boolean dataNascimentoInvalida;

		private boolean contatoInvalido;
		private boolean contatoVazia;
		
		public UsuarioInvalidoException() {
			
			
			
		}

		public boolean isNomeVazio() {
			return nomeVazio;
		}

		public void setNomeVazio(boolean nomeVazio) {
			this.nomeVazio = nomeVazio;
		}

		public boolean isCpfVazio() {
			return cpfVazio;
		}

		public void setCpfVazio(boolean cpfVazio) {
			this.cpfVazio = cpfVazio;
		}

		public boolean isCpfInvalido() {
			return cpfInvalido;
		}

		public void setCpfInvalido(boolean cpfInvalido) {
			this.cpfInvalido = cpfInvalido;
		}

		public boolean isDataNascimentoVazia() {
			return dataNascimentoVazia;
		}

		public void setDataNascimentoVazia(boolean dataNascimentoVazia) {
			this.dataNascimentoVazia = dataNascimentoVazia;
		}

		public boolean isDataNascimentoInvalida() {
			return dataNascimentoInvalida;
		}

		public void setDataNascimentoInvalida(boolean dataNascimentoInvalida) {
			this.dataNascimentoInvalida = dataNascimentoInvalida;
		}

		public boolean isContatoInvalido() {
			return contatoInvalido;
		}

		public void setContatoInvalido(boolean contatoInvalido) {
			this.contatoInvalido = contatoInvalido;
		}

		public boolean isContatoVazia() {
			return contatoVazia;
		}

		public void setContatoVazia(boolean contatoVazia) {
			this.contatoVazia = contatoVazia;
		}


		
	}


