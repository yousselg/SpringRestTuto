package com.example.Rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.Rest.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
