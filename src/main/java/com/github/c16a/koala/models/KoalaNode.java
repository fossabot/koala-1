package com.github.c16a.koala.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Version;

public class KoalaNode {
    @Id
    @GeneratedValue
    public Long id;

    @Version
    Long version;
}
