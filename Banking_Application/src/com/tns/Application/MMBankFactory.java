package com.tns.Application;

import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public  class MMBankFactory extends BankFactory
{

	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal, boolean	isSalaried) {
		return null;
	}
	
	public CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		return null;
	}
	
}
