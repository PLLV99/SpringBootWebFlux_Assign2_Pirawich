package com.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CheckingService {

    @Autowired
    private CheckingRepo checkingRepository;

    // get all
    public Flux<Checking> getAllChecking() {
        return checkingRepository.findAll();
    }

    // save
    public Mono<Checking> saveChecking(Checking checking) {
        return checkingRepository.save(checking);
    }
}
