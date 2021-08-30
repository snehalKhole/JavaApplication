package Day3;

import java.util.Scanner;

public class Account {
		int aid;
		long aNo;
		String custName;
		int balance;

	public Account(int aid, long aNo, String custName,int balance) {
			super();
			this.aid = aid;
			this.aNo = aNo;
			this.custName = custName;
			this.balance=balance;
		}


	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aNo=" + aNo + ", custName=" + custName + ", balance=" + balance + "]";
	}


	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ammount:");
		int amts=sc.nextInt();
		if(amts>balance)
		{
			System.out.println("insufficient balance");
		}
		else
		{
		balance=balance-amts;
		
		System.out.println("After withdraw Balance is:"+balance);
		}
	}
	public void deposite( int amt)
	{
	
	       balance=balance+amt;
		System.out.println("After deposite Balance is:"+balance);
		
	}
	void check_balance()
	{
		System.out.println("balance:"+balance);
	}
	public static void main(String[] args) {
		Account a=new Account(1,6553546789l,"Snehal",1000);
		a.withdraw();
		a.deposite(900);
	}

}
