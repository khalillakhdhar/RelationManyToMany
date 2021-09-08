package com.http.tp.entities;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tags")
public class Tag {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long id;
@NaturalId
private String name;

@ManyToMany(fetch = FetchType.EAGER,
cascade = {CascadeType.PERSIST,
		CascadeType.MERGE},
mappedBy = "tags")
private Set<Post> posts=new HashSet<>();



}
