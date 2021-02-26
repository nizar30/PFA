package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Personne;

@Transactional
@RepositoryRestResource(collectionResourceRel="personne",path="personne")

public interface PersonneRepository extends PersonneBaseRepositary<Personne> { 

}


