package com.chainys.day7;

import java.util.ArrayList;
import java.util.List;

public class AbcBankVersion1 {
	public static Bank BankDatabase(long accntNo,String ifsc,long phoneNo) {
		List<Bank> dataBase=new ArrayList<Bank>();
		Bank b1=new Bank();
		b1.setBankAccntNo(174901000028476l);
		b1.setBranchLocation("kovilpatti");
		b1.setHolderName("manikandan");
		b1.setIfscCode("ABCD1");
		b1.setPhoneNo(9360296564l);
		
		Bank b2=new Bank();
		b2.setBankAccntNo(174901000028477l);
		b2.setBranchLocation("kovilpatti");
		b2.setHolderName("rohit");
		b2.setIfscCode("ABCD2");
		b2.setPhoneNo(9940767083l);
		
		Bank b3=new Bank();
		b3.setBankAccntNo(174901000028478l);
		b3.setBranchLocation("kovilpatti");
		b3.setHolderName("Luffy");
		b3.setIfscCode("ABCD3");
		b3.setPhoneNo(9789436788l);
		dataBase.add(b1);
		dataBase.add(b2);
		dataBase.add(b3); 
		
		for(Bank user : dataBase) {
			if(user.getBankAccntNo()==accntNo||user.getIfscCode().equals(ifsc)||user.getPhoneNo()==phoneNo) {
				return user;
			}
		}
		return null;
		
	}
	public void deposit(long accntNo,int depositAmount) {
		Bank bank = BankDatabase(accntNo, null, 0);
		if(!bank.isEmpty()) {
			System.out.println(bank.getHolderName()+" Rs."+depositAmount+" credited to ABC Bank Account Number xxxx"+bank.getBankAccntNo()%1000);
		}
		else {
			System.out.println("Your account Detail is Invalid");
		}
	}
	public void deposit(String Ifsc,int depositAmount) {
		Bank bank = BankDatabase(0, Ifsc, 0);
		if(!bank.isEmpty()) {
			System.out.println(bank.getHolderName()+" Rs."+depositAmount+" credited to ABC Bank Account Number xxxx"+bank.getBankAccntNo()%1000);
		}
		else {
			System.out.println("Your account Detail is Invalid");
		}
	}
	public void deposit(int depositAmount,long phoneNo) {
		Bank bank = BankDatabase(0, null, phoneNo);
		if(!bank.isEmpty()) {
			System.out.println(bank.getHolderName()+" Rs."+depositAmount+" credited to ABC Bank Account Number xxxx"+bank.getBankAccntNo()%1000);
		}
		else {
			System.out.println("Your account Detail is Invalid");
		}
		
	}
}
