package core.concretes;

import core.abstracts.LoginServices;
import entities.concretes.User;

public class MyLoginServices implements LoginServices{

	@Override
	public void login(User user) {
System.out.println("Kendi servisimizkle girildi hoþgeldiniz : "+user.getName() );		
	}

}
