package Day2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println("Enter your choice 1 or 2:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:if(num%2==0)
			System.out.println("Even no");
		break;
		case 2:if(num%2!=0)
			System.out.println("Odd no");
		break;
		default:System.out.println("Enter valid input");
		}

	}

}
