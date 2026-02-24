package com.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("savings")
public class SavingsController {

    @Autowired
    private SavingsService savingsService;

    // GET /savings
    @GetMapping
    public Flux<Savings> getAllSavings() {
        return savingsService.getAllSavings();
    }

    // POST /savings
    @PostMapping
    public Mono<Savings> saveSavings(@RequestBody Savings savings) {
        return savingsService.saveSavings(savings);
    }
}
