package com.github.c16a.koala.models;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;

@NodeEntity
public class IssueComment extends KoalaNode {
    @Relationship(type = "HAS_COMMENT", direction = Relationship.INCOMING)
    public Issue issue;

    public String body;

    @Relationship(type = "COMMENTED", direction = Relationship.INCOMING)
    public User commentor;

    public Date commentedDate = new Date();
}
