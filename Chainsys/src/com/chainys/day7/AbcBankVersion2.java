package com.chainys.day7;

public class AbcBankVersion2 extends AbcBankVersion1 {
	@Override
	public void deposit(long accntNo,int depositAmount) {
		Bank bank = BankDatabase(accntNo, null, 0);
		if(!bank.isEmpty()) {
			System.out.println(bank.getHolderName()+" Rs."+depositAmount+" credited to ABC Bank Account Number xxxx"+bank.getBankAccntNo()%1000);
			System.out.println(depositAmount*0.05+"Amount is debited to ABC bank for Platform charges");
			System.out.println();
		}
		else {
			System.out.println("Your account Detail is Invalid");
			System.out.println();
		}
	}
	@Override
	public void deposit(String Ifsc,int depositAmount) {
		Bank bank = BankDatabase(0, Ifsc, 0);
		if(!bank.isEmpty()) {
			System.out.println(bank.getHolderName()+" Rs."+depositAmount+" credited to ABC Bank Account Number xxxx"+bank.getBankAccntNo()%1000);
			System.out.println(depositAmount*0.05+"Amount is debited to ABC bank for Platform charges");
		}
		else {
			System.out.println("Your account Detail is Invalid");
			System.out.println();
		}
	}
	@Override
	public void deposit(int depositAmount,long phoneNo) {
		Bank bank = BankDatabase(0, null, phoneNo);
		if(!bank.isEmpty()) {
			System.out.println(bank.getHolderName()+" Rs."+depositAmount+" credited to ABC Bank Account Number xxxx"+bank.getBankAccntNo()%1000);
			System.out.println(depositAmount*0.05+"Amount is debited to ABC bank for Platform charges");
			System.out.println();
		}
		else {
			System.out.println("Your account Detail is Invalid");
		}
		
	}
}
