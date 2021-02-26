package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Orphelin;
import com.example.demo.model.Personne;
import com.example.demo.model.Veuve;


@RepositoryRestResource(collectionResourceRel="veuve",path="veuve")
@Transactional
public interface OrphelinRepositary extends PersonneBaseRepositary<Orphelin> { 

}