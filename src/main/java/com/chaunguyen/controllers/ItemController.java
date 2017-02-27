package com.chaunguyen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaunguyen.domain.Item;

@RestController
@RequestMapping("/items")
public class ItemController extends CRUDController<Item> {
	@Autowired
	@Override
	public void setRepository(CrudRepository<Item, Integer> repository) {
		super.setRepository(repository);
	}
}
