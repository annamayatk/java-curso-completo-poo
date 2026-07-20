package entities;

public class Account {
	
	 private int number;
	 private String holder;
	 private double balance;
	 private static final double WITHDRAW_FEE = 5.00;
	 
	 public Account() {
	 }
	 
	 public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	 }
	 
	 public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	 }

	 public int getNumber() {
		 return number;
	 }
	 
	 public String getHolder() {
		 return holder;
	 }

	 public void setHolder(String accountHolder) {
		 this.holder = accountHolder;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
	 public void deposit(double amount) {
		 balance = balance + amount;
	 }
	 
	 public void withdraw(double amount) {
		 balance = balance - amount - WITHDRAW_FEE;
	 }
	 
	 public String toString() {
		 return "Account "
			+ getNumber()
			+ ", Holder: "
			+ getHolder()
			+ String.format(", Balance: $ %.2f", getBalance()); 
	 }



}
