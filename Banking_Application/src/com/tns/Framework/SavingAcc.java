package com.tns.Framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	
	
	
	public SavingAcc(int AccNo,String accNm,float accBal,float creditLimit) {
		super(AccNo, accNm, creditLimit);
		this.isSalary = isSalary;
	}

	public void withdraw(float isSalary)
	{
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
}

	




