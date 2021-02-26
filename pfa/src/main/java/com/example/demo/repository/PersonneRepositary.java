package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Personne;

@RepositoryRestResource(collectionResourceRel="person",path="personne")
public interface PersonneRepositary extends JpaRepository<Integer,Personne> {

}
