package com.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingsService {

    @Autowired
    private SavingsRepo savingsRepository;

    // get all
    public Flux<Savings> getAllSavings() {
        return savingsRepository.findAll();
    }

    // save
    public Mono<Savings> saveSavings(Savings savings) {
        return savingsRepository.save(savings);
    }
}
