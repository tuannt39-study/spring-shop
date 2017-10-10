package vn.hkd.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import vn.hkd.shop.domain.web.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select u from User u")
	List<User> findAll();
	
	@Query("from User u left join fetch u.roles where u.email = ?1")
	User findByEmail(String email);
	
}
