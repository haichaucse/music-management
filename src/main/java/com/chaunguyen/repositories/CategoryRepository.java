package com.chaunguyen.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chaunguyen.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
