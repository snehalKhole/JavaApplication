package Day1;

import java.util.Scanner;

public class MaxBet3 {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1>=num2 && num1>=num3)
		System.out.println(num1+":is maximum number");
		
		else if(num2>=num1 && num2>=num3)
		System.out.println(num2+":is maximum number");
		
		else
		System.out.println(num3+":is maximum number");
	
	}

}
