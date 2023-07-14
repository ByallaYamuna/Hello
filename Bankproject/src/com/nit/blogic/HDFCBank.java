package com.nit.blogic;

import com.nit.by.InSufficientFundsException;
import com.nit.by.InvalidAmountException;

public class HDFCBank implements Bank{
	private double balance;
	public void deposite(double amt)throws InvalidAmountException{
		if(amt<=0) {
			throw new InvalidAmountException(amt+"is invalid amount");
		}
		balance=balance+amt;
	}
	public double withdraw(double amt)throws InSufficientFundsException{
		if(balance<amt) {
			throw new InSufficientFundsException("InSufficient Funds");
			
		}
		balance=balance-amt;
		return amt;
	}
	public void balanceEnquiry() {
		System.out.println("Current Balance:+balance");
	}
}

	