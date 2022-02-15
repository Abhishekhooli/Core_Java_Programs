package com.tns.Application;

import com.tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	private float  withdrawal;


	public MMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}


	@Override
	public void withdraw(float withdrawal) {

		super.withdraw(withdrawal);
	}
	

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}