package view;

/*Classe che rappresenta la pagina di Login con tutti i textfiled associati a icampi di questa classe. 
 * In questo caso solo username e password. Quindi uguale alla classe UtenteDTO*/
public class UtentePage {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
