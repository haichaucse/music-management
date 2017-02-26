package com.chaunguyen.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chaunguyen.domain.Item;

public interface BookRepository extends CrudRepository<Item, Integer> {

}
