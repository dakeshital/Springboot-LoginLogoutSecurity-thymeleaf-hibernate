package test.springboot.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.springboot.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	User findByEmail(String email);
}
