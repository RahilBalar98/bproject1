package in.rahilbalar98.springbootbackend.bproject1.dao;

import java.util.List;

import in.rahilbalar98.springbootbackend.bproject1.modal.User;

public interface UserDAO {
	 
	 List<User> get();
	 
	 User get(int id);
	 
	 void save(User user);
	 
	 void delete(int id);}
