package firstproject1;

public class Bankingapplication {

	static int currentBalance =1000;
	public static void greetCustomer() {
		System.out.println("Hello, welcome to the bank application ");

	}	
	public void deposit(int amount ){
		currentBalance= currentBalance + amount ;
		System.out.println("Amount is deposited successfully");
	}
	public static void withdrawl(int amount){
		currentBalance= currentBalance - amount ;
		System.out.println("Amount is withdrawn successfully");;
	}

	public int getCurrentBalance()	{
		return currentBalance;

	}
	public static void main(String[] args) {
		Bankingapplication bank = new Bankingapplication();
		greetCustomer();
		System.out.println("current balance is : " +bank.getCurrentBalance());
		bank.deposit(500);		
		System.out.println("current balance is : " +bank.getCurrentBalance());
		withdrawl(300);
		System.out.println("current balance is : " +bank.getCurrentBalance());
		{


		}
	}
}