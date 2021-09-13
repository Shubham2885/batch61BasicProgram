package com.bz.day4;

public class Account {

	//properties
	private String name;
	private String branch;
	private int accountNo;
	private int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void showBalance() {
		int bonus = 1000;
		System.out.println(name+" of Balance = "+(balance+bonus));
	}
}
