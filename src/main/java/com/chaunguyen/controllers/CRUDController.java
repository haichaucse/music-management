package com.chaunguyen.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chaunguyen.domain.BaseEntity;

@Transactional
public class CRUDController<T extends BaseEntity> {
	
	protected CrudRepository<T, Integer> repository;
	
	@RequestMapping(value = {"/"}, method=RequestMethod.POST)
	public void create(@RequestBody T object) {
		this.repository.save(object);
	}
	
	@RequestMapping(value = {"/{id}"}, method=RequestMethod.PUT)
	public void update(@PathVariable Integer id, @RequestBody T object) {
		if (!id.equals(object.getId())) {
			throw new IllegalArgumentException("ID does not match");
		}
		this.repository.save(object);
	}
	
	@RequestMapping(value = {"/{id}"}, method=RequestMethod.GET)
	public T get(@PathVariable Integer id) {
		return this.repository.findOne(id);
	}

	public void setRepository(CrudRepository<T, Integer> repository) {
		this.repository = repository;
	}
}
