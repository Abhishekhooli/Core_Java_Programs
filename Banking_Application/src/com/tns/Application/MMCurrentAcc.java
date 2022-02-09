package com.tns.Application;

import com.tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		
	}


	public void withdraw(float creditLimit)
	{
		
	}
	

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}