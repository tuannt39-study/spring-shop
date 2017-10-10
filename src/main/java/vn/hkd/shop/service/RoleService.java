package vn.hkd.shop.service;

import vn.hkd.shop.domain.web.Role;

public interface RoleService {

	Role findByName(String name);
	
}
