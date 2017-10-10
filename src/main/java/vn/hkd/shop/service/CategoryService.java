package vn.hkd.shop.service;

import vn.hkd.shop.domain.web.Category;

public interface CategoryService {

	Iterable<Category> findAll();
	
	Category findOne(Integer id);
	
	long countAll();

	Category save(Category category);
	
	void delete(Integer id);
	
}
