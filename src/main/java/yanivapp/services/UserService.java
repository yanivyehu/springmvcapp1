package yanivapp.services;

import org.springframework.stereotype.Service;

import yanivapp.beans.User;

@Service
public class UserService {

	private static String debug_prefix = "[UserService]:";
	
	public void addUser(User user) {
		System.out.println(debug_prefix + "Add user -->" + user + " to DB");
	}

	public void updateUser(int id, User user) {
		System.out.println(debug_prefix + "Modify user -->" + id + "to be:" + user + " to DB");
		
	}
	
	public void removeUser(int id) {
		System.out.println(debug_prefix + "Remove user with id" + id);
	}
	
	public void getAllUsers() {
		System.out.println(debug_prefix + "Returns all users!");
	}


}
