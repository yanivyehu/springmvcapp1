package yanivapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yanivapp.dao.userDao;
//import yanivapp.dao.userDaoImp;
import yanivapp.model.User;

/**
 * service annotation makes this class a singleton.
 * @author yaniv
 * class that is annotated with service should handle the business logic.
 */
@Service
public class UserService {

	
	/* PLACE HOLDER For Data Access Object (DAO) which responsible for access the DB */
	//@Autowired
	//private userDaoImp userDaoImp;
	
	private static String debug_prefix = "[UserService]:";
	
	@Transactional
	public void addUser(User user) {
		//userDaoImp.addUser(user);
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
