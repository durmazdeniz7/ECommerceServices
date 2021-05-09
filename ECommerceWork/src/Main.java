import bussines.concretes.UserManager;
import bussines.concretes.ValidatorManager;
import core.concretes.MyLoginServices;
import dataAcces.concretes.HibernateUser;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User deniz=new User(1,"Deniz","Durmaz","durmazdeniz7@gmail.com","Sw3ja124");
		
		
		UserManager manager=new UserManager(new HibernateUser()	, new ValidatorManager(),new MyLoginServices());
		manager.add(deniz);
		manager.login(deniz);
		
	}

}
