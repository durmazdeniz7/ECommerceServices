package bussines.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bussines.abstarcts.ValidatorService;

public class ValidatorManager implements ValidatorService{

	@Override
	public boolean validateName(String name) {
		
		if (name.length()<2) {
			System.out.println("Adýnýz 2 karakterden küçük olamaaz");
			return false;
		}
		else {
			return true;

		}
	}

	@Override
	public boolean validateSurname(String firstName) {
		if (firstName.length()<2) {
			System.out.println("Soyadýnýz 2 karakterden küçük olamaaz");
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean validateMailAddress(String mailAddress) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPath = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPath.matcher(mailAddress);
		return matcher.find();
	}

	@Override
	public boolean validatePassword(String password) {
		if (password.length()<6) {
			return false;

		} else {
			return true;

		}
	}

	@Override
	public boolean validateIsClicked(boolean isClicked) {
		// TODO Auto-generated method stub
		return isClicked;
	}

}
