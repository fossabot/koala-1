package com.github.c16a.koala.models;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Project extends KoalaNode {
    public String key;
    public String description;

    @Relationship(type = "BELONGS_TO", direction = Relationship.INCOMING)
    public List<Issue> issues;
}
