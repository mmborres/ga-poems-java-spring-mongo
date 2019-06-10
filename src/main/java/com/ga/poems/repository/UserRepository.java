package com.ga.poems.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ga.poems.domain.Users;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<Users, String> {
	
	Users findFirstByName(@Param("name") String name);
	
    @Query("{address:'?0'}")
    List<Users> findCustomByAddress(String address);

    @Query("{address : { $regex: ?0 } }")
    List<Users> findCustomByRegExAddress(String domain);

}
