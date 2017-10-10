package vn.hkd.shop.repository;

import org.springframework.data.repository.CrudRepository;

import vn.hkd.shop.domain.web.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	
	Role findByName(String name);

}
