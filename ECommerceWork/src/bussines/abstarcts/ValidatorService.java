package bussines.abstarcts;

public interface ValidatorService {

	boolean validateName(String name);
	boolean validateSurname(String firstName);
	boolean validateMailAddress(String mailAddress);
	boolean validatePassword(String password);
	boolean validateIsClicked(boolean isClicked);

}
