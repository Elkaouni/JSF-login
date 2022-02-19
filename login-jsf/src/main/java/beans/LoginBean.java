package beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class LoginBean {

	private String login;
	private String passwd;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
	public String login() {
		if (passwd.equals("client")) return "client";
		else if(passwd.equals("manager")) return "manager";
		return "error";
	}
	public String signup() {
		return "signIn";
	}
	

}
