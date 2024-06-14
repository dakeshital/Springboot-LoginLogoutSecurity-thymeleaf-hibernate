package test.springboot.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import test.springboot.security.service.UserService;
import test.springboot.security.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService service;

	public UserRegistrationController(UserService service) {
		super();
		this.service = service;
	}

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}

	@GetMapping()
	public String showRegistrationForm() {
		//model.addAttribute("user", new UserRegistrationDto());
		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto dto) {
		service.save(dto);
		return "redirect:/registration?success";
	}
}
