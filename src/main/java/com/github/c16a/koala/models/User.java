package com.github.c16a.koala.models;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class User extends KoalaNode {
    public String name;
    public String emailAddress;
}
