package vn.hkd.shop.service;

import java.util.List;

import vn.hkd.shop.domain.web.User;

public interface UserService {

	List<User> findAll();
	
	User findOne(Integer id);
	
	long countAll();
	
	void delete(Integer id);
	
	vn.hkd.shop.domain.api.User checkLogin(vn.hkd.shop.domain.api.User user);
	
	boolean register(User user);
	
}
