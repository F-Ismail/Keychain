package serverInterface;

public interface IAuthentication {

	String AdminUser = "Admin";
	String AdminPass = "ChangeMe";
	
	public String encrypt(String pass);
	
	public String decrypt(String pass);
	
	public void requestAuthentication();
	
}
