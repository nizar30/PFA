package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Parrain;

@RepositoryRestResource(collectionResourceRel="parrain", path="parrain")
public interface ParrainRepositary extends JpaRepository<Integer,Parrain> {

}
