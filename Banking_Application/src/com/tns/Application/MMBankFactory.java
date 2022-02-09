package com.tns.Application;

import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public abstract class MMBankFactory extends BankFactory
{

	public MMSavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal, float	isSalaried) {
		return null;
	}

	public MMCurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		return null;
	}
	
}
