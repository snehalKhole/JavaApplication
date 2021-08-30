package Day3;

import java.util.Scanner;


public class Bank {
	int userId;
	String userName;
	int  balance;
	int total;
	public void insert(int i,String n,int b)
	{
		userId=i;
		userName=n;
		balance=b;
	}
	public void display()
	{
		System.out.println("User Id:"+userId);
		System.out.println("User name:"+userName);
		System.out.println("Balance:"+balance);

	}
	public void deposite( int amt)
	{
	
		
	       balance=balance+amt;
		System.out.println("After withdrow Balance is:"+balance);
		
	}
	public void withdraw(int amts)
	{
		balance=balance-amts;
		
		System.out.println("After credit Balance is:"+balance);

	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id:");
		int i=sc.nextInt();
		System.out.println("Enter user name:");
		String n=sc.next();
		System.out.println("Enter balance:");
		int b=sc.nextInt();
		Bank ba=new Bank();
		ba.insert(i, n, b);
		ba.display();
		ba.withdraw(b);
		ba.deposite(b);
	}

}
