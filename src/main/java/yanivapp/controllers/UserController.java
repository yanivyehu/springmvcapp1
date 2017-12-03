package yanivapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import yanivapp.beans.User;
import yanivapp.services.UserService;


@RestController
@RequestMapping("/userController")
public class UserController {
	
	@Autowired
	UserService userService;

	
	@RequestMapping(value = "/addUser", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addUserByJson(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value = "/updateUser/{id}", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void modifyUserByJson(@RequestBody User user, @PathVariable int id) {
		userService.updateUser(id, user);
	}
	
	@RequestMapping(value = "/removeUser/{id}", method=RequestMethod.DELETE)
	public void removeUser(@PathVariable int id) {
		userService.removeUser(id);
	}
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public void getAllUsers() {
		userService.getAllUsers();
	}
	
}
