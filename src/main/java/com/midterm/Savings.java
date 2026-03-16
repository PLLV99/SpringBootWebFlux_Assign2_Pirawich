package com.midterm;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Savings extends Account {

	private double interestRate;

	public Savings() {
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
