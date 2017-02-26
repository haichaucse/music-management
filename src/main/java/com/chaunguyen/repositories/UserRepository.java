package com.chaunguyen.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chaunguyen.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
