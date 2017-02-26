package com.chaunguyen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaunguyen.domain.Category;

@RequestMapping("/category")
@RestController
public class CategoryController extends CRUDController<Category> {
	@Override
	@Autowired
	public void setRepository(CrudRepository<Category, Integer> repository) {
		super.setRepository(repository);
	}
}
