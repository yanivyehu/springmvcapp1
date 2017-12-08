package yanivapp.controllers;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yanivapp.model.User;

@Controller
public class FormSubmitProcessing {

	@RequestMapping(value = "/submitFormController/modelAttribute")
	public @ResponseBody String handleModelAttributeSubmit(@ModelAttribute("user") User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "error";
		}
		System.out.println("[FormSubmitProcessing]: handle modelAttributeSubmit:" + user);
		return "handleModelAttributeSubmit OK!";
	}
	
	
	@RequestMapping(value ="/submitFormController/getFormParams")
	public @ResponseBody String handleFormParams(@PathParam("id") int id) {
		System.out.println("[FormSubmitProcessing]: handle regular form submission:" + id);
		return "handleFormParams OK";
	}

}
