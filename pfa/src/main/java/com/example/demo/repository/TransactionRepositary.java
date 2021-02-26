package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Transaction;

@RepositoryRestResource(collectionResourceRel="transaction",path="transaction")
public interface TransactionRepositary extends JpaRepository<Integer,Transaction> {

}
