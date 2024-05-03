package com.chainys.day7;

public class Bank {
	public long bankAccntNo;
	public String holderName;
	public String ifscCode;
	public long phoneNo;
	public String branchLocation;
	
	public Bank(int bankAccntNo, String holderName, String ifscCode, long phoneNo, String branchLocation) {
		
		this.bankAccntNo = bankAccntNo;
		this.holderName = holderName;
		this.ifscCode = ifscCode;
		this.phoneNo = phoneNo;
		this.branchLocation = branchLocation;
	}
	
	public Bank() {
		
	}

	public long getBankAccntNo() {
		return bankAccntNo;
	}
	public void setBankAccntNo(long bankAccntNo) {
		this.bankAccntNo = bankAccntNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	@Override
	public String toString() {
		return "Welcome to ABC Bank"+"\n"+"Account Details"+"\n"+"Bank [bankAccntNo=" + bankAccntNo + ", holderName=" + holderName + ", ifscCode=" + ifscCode
				+ ", phoneNo=" + phoneNo + ", branchLocation=" + branchLocation + "]";
	}
	public boolean isEmpty() {
        return bankAccntNo == 0 && holderName == null;
    }
	
}
