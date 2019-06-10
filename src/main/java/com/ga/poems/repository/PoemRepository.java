package com.ga.poems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ga.poems.domain.Poems;

@RepositoryRestResource(collectionResourceRel = "poem", path = "poem")
public interface PoemRepository extends MongoRepository<Poems, String> {
	
	Poems findFirstByMood(@Param("mood") String mood);

}
