package datos;

public class Usuario{
	
	private String user;
	private String pass;
	private Boolean admin;
	
	public Usuario()
	{
		this.user = null;
		this.pass = null;
		this.admin = false;
	}
	
	public Usuario(String user, String pass, Boolean admin) {
		super();
		this.user = user;
		this.pass = pass;
		this.admin = admin;
	}




	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public Boolean getAdmin() {
		return admin;
	}


	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	

}
