package yanivapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import yanivapp.model.User;

@Controller
@RequestMapping(value="/")
public class RootContorller {

	@RequestMapping(method = RequestMethod.GET)
	public String handleFirstRequest(Model model) {
		System.out.println("[RootController]: handle request");
		model.addAttribute("user", new User());
		return "index";
	}
	
}
