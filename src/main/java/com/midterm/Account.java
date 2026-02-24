package com.midterm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "accounts")
@Data
@NoArgsConstructor
public class Account {

    @Id
    private String id;
    private String accountHolder;
    private double balance;

    public Account(String id, String accountHolder, double balance) {
        this.id = id;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    
    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    
    private void updateBalance(double newBalance) {
        this.balance = newBalance;
    }
    
    
}
