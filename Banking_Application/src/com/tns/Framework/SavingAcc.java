package com.tns.Framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried ;
	
	
	
	public SavingAcc(int AccNo,String accNm,float accBal,float creditLimit) {
		super(AccNo, accNm, creditLimit);
		this.isSalaried = isSalaried;
	}

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaray) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public void withdraw(float withdrawal) {

		super.withdraw(withdrawal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}

	




