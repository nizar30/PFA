package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Veuve;


@RepositoryRestResource(collectionResourceRel="veuve",path="veuve")
@Transactional
public interface VeuveRepositary extends PersonneBaseRepositary<Veuve> { 

}