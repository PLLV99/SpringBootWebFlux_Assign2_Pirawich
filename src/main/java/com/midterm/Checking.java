package com.midterm;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Checking extends Account {
	
	private double insufficientFundFee;
	
    public Checking(String id, String accountHolder, double balance, double insufficientFundFee) {
		super(id, accountHolder, balance);
		this.insufficientFundFee = insufficientFundFee;
	
	}

}
