package com.tns.client;

import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class client {

	public static void main(String[] args) {
	BankFactory bf=new MMBankFactory();
	SavingAcc sa=new MMSavingAcc(218052, "Abhishek", 20000, true);
	CurrentAcc ca=new MMCurrentAcc(218053,"Ajay",40000,25000);
	
	sa.deposit(3000);
	sa.withdraw(1000);
	ca.withdraw(15000);
	ca.deposit(40000);
	System.out.println(ca.toString());
	
	
	
	}

}