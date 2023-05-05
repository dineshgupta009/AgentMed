package com.AgentMed.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tags")
    private Set< Post > posts = new HashSet< >();
}
