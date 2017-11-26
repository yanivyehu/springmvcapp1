package yanivapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import yanivapp.beans.User;
import yanivapp.services.UserService;

@RestController
@RequestMapping("/userController")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addUser(@RequestBody User user) {
		userService.addUser();
	}
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public void getAllUsers() {
		userService.getAllUsers();
	}
	
}
