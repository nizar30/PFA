package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.demo.model.Personne;

//@RepositoryRestResource(collectionResourceRel="person",path="personne")
@NoRepositoryBean
public interface PersonneBaseRepositary<T extends Personne> extends JpaRepository<Integer,Personne> {

}
