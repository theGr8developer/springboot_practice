package com.blogpost.blogpostapp.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogpost.blogpostapp.model.User;



@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

   @Query(value="select * from User user where user.email=:email",nativeQuery = true)
    User getUser(@Param("email") String email);
    
}
