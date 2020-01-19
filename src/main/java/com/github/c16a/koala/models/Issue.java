package com.github.c16a.koala.models;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;
import java.util.List;

@NodeEntity
public class Issue extends KoalaNode {
    public String description;
    public Date reported = new Date();
    public IssueStatus issueStatus = IssueStatus.OPEN;

    @Relationship(type = "BELONGS_TO", direction = Relationship.OUTGOING)
    public Project project;

    @Relationship(type = "REPORTED_BY", direction = Relationship.OUTGOING)
    public User reporter;

    @Relationship(type = "ASSIGNED_TO", direction = Relationship.OUTGOING)
    public List<User> assignees;

    @Relationship(type = "HAS_COMMENT", direction = Relationship.OUTGOING)
    public List<IssueComment> comments;
}
