package org.bank;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("The Savings amount is 10");	
	}

	public static void main(String[] args) 
	{
	AxisBank AB =new AxisBank();
	AB.deposit();
	}

}
