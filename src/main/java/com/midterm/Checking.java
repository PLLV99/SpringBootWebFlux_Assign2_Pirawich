package com.midterm;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Checking extends Account {

	private double insufficientFundFee;

	public Checking() {
	}

	public double getInsufficientFundFee() {
		return insufficientFundFee;
	}

	public void setInsufficientFundFee(double insufficientFundFee) {
		this.insufficientFundFee = insufficientFundFee;
	}
}
