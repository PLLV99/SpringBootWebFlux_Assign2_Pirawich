package com.midterm;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingRepo extends ReactiveMongoRepository<Checking, String> { 
}