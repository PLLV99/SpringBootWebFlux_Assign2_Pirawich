package com.midterm;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsRepo extends ReactiveMongoRepository<Savings, String> { 
}