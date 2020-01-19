package com.github.c16a.koala.repositories;

import com.github.c16a.koala.models.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends Neo4jRepository<User, Long> {
}
