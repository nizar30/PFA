package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Veuve;


@RepositoryRestResource(collectionResourceRel="veuve",path="veuve")
public interface OrphelinRepositary extends JpaRepository<Integer,Veuve> {

}