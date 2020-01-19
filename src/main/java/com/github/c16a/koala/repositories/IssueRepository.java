package com.github.c16a.koala.repositories;

import com.github.c16a.koala.models.Issue;
import com.github.c16a.koala.models.IssueProjectionFullBody;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "issues", path = "issues", excerptProjection = IssueProjectionFullBody.class)
public interface IssueRepository extends Neo4jRepository<Issue, Long> {
}
