package com.github.c16a.koala.repositories;

import com.github.c16a.koala.models.Project;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "projects", path = "projects")
public interface ProjectRepository extends Neo4jRepository<Project, Long> {
}
