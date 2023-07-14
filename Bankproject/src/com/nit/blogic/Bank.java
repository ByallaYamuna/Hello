package com.nit.blogic;

import com.nit.by.InSufficientFundsException;
import com.nit.by.InvalidAmountException;

public interface Bank {
	public void deposite(double amt)throws InvalidAmountException;
	public double withdraw(double amt)throws InSufficientFundsException;
	public void balanceEnquiry();
	

}
