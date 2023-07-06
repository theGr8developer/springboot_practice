package com.blogpost.blogpostapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogpost.blogpostapp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
    
}
