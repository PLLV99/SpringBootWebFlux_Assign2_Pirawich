package com.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("checking")
public class CheckingController {

    @Autowired
    private CheckingService checkingService;

    // GET /checking
    @GetMapping
    public Flux<Checking> getAllChecking() {
        return checkingService.getAllChecking();
    }

    // POST /checking
    @PostMapping
    public Mono<Checking> saveChecking(@RequestBody Checking checking) {
        return checkingService.saveChecking(checking);
    }
}
