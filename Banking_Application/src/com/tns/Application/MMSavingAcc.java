package com.tns.Application;

import com.tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	
	public MMSavingAcc(int AccNo,String accNm,float accBal,boolean isSalaried)
	{
		super(AccNo, accNm, accBal, isSalaried);
		
	}
	


	@Override
	public void withdraw(float withdrawal) {

		super.withdraw(withdrawal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
