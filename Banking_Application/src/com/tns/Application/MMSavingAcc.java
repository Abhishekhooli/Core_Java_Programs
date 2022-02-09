package com.tns.Application;

import com.tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	
	public MMSavingAcc(int AccNo,String accNm,float accBal,float isSalaried)
	{
		super(AccNo, accNm, accBal, isSalaried);
		
	}
	

	private static final float MINBAL=500;
	
	public void withdraw(float  isSalary)
	{
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
