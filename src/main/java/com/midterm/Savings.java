package com.midterm;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Savings extends Account{
	
	private double interestRate;
	
	public Savings(String id, String accountHolder, double balance, double interestRate) {
        super(id, accountHolder, balance);
        this.interestRate = interestRate;
    }
}
