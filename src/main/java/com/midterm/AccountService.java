package com.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;

    //  create / update
    public Mono<Account> saveAccount(Account account) {
        return accountRepo.save(account);
    }

    //  read all
    public Flux<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    //  read by id
    public Mono<Account> getAccountById(final String id) {
        return accountRepo.findById(id);
    }

    //  delete
    public Mono<Void> deleteAccount(final String id) {
        return accountRepo.deleteById(id);
    }
}
