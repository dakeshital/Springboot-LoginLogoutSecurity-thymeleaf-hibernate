package test.springboot.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import test.springboot.security.model.User;
import test.springboot.security.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto dto);
}
