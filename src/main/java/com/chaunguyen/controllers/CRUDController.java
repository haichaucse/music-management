package com.chaunguyen.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Transactional
public class CRUDController<T> {
	
	protected CrudRepository<T, Integer> repository;
	
	@RequestMapping(value = {"/"}, method=RequestMethod.POST)
	public void create(@RequestBody T object) {
		this.repository.save(object);
	}
	
	@RequestMapping(value = {"/{id}"}, method=RequestMethod.GET)
	public String get() {
		return "Hello there";
	}

	public void setRepository(CrudRepository<T, Integer> repository) {
		this.repository = repository;
	}
}
