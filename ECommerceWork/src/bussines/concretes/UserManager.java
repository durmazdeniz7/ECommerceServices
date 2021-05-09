package bussines.concretes;

import bussines.abstarcts.UserService;
import bussines.abstarcts.ValidatorService;
import core.abstracts.LoginServices;
import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	private ValidatorService service;
	private UserDao userDao;
	private LoginServices loginServices;

	public UserManager(UserDao userDao, ValidatorService service,LoginServices loginServices) {
		this.userDao = userDao;
		this.service = service;
		this.loginServices=loginServices;
	}

	@Override
	public void add(User user) {
		if (!service.validatePassword(user.getPassword()) && !service.validateMailAddress(user.getEmail())
				&& !service.validateName(user.getName()) && !service.validateSurname(user.getLastName())) {
			System.out.println("Bilgileriniz de hata var lütfen kurallara göre kayýt olunuz");

			return;
		}
		this.userDao.add(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login(User user) {
		if (!service.validateMailAddress(user.getEmail()) && !service.validatePassword(user.getPassword())) {
			System.out.println("Email veya parola hatalý");
			return;
		}
		loginServices.login(user);
		System.out.println("Baþarýlý bir þekilde giriþ yapýldý hoþgeldiniz : ");

	}

}
