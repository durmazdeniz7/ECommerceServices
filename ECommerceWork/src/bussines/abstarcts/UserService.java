package bussines.abstarcts;

import entities.concretes.User;

public interface UserService {
	void add(User user );
	void delete(User user);
	void update(User user);
	void login(User user);

}
