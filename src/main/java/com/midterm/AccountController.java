package com.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // GET /accounts
    @GetMapping
    public Flux<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    // GET /accounts/{id}
    @GetMapping("{id}")
    public Mono<Account> getAccountById(@PathVariable String id) {
        return accountService.getAccountById(id);
    }

    // POST /accounts
    @PostMapping
    public Mono<Account> saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    // DELETE /accounts/{id}
    @DeleteMapping("{id}")
    public Mono<Void> deleteAccount(@PathVariable String id) {
        return accountService.deleteAccount(id);
    }
}
