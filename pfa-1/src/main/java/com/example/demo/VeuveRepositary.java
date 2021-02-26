package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel="veuve",path="veuve")


@Repository
public interface VeuveRepositary extends PersonneRepository { 

}