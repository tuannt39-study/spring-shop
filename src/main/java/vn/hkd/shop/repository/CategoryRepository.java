package vn.hkd.shop.repository;

import org.springframework.data.repository.CrudRepository;

import vn.hkd.shop.domain.web.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
