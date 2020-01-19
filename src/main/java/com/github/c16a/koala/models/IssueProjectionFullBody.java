package com.github.c16a.koala.models;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "full", types = {Issue.class})
public interface IssueProjectionFullBody {
    String getDescription();

    Project getProject();

    List<IssueComment> getComments();
}
