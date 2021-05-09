package dataAcces.concretes;

import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUser implements UserDao{

	@Override
	public void add(User user) {
	System.out.println("Kullanýcý Eklendi : "+user.getName() );
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
