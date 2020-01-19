package com.github.c16a.koala.repositories;

import com.github.c16a.koala.models.IssueComment;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "comments", path = "comments")
public interface IssueCommentRepository extends Neo4jRepository<IssueComment, Long> {
}
