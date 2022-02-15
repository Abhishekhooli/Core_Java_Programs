package com.tns.Application;

import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public  class MMBankFactory extends BankFactory
{
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalaried) {

		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit) {

		return null;
	
	
	}
	
}
