package core.concretes;

import GoogleLogin.GoogleLogin;
import core.abstracts.LoginServices;
import entities.concretes.User;

public class LoginManager implements LoginServices{

	@Override
	public void login(User user) {
		GoogleLogin googleLogin=new GoogleLogin();
		googleLogin.login(user.getEmail());
		
	}
	
	
	

}
