package com.moran.search.engine.repository;

import org.springframework.data.repository.CrudRepository;

import com.moran.search.engine.models.user.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
