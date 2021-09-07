package Day2Assignments;

import java.util.Scanner;

public class SunOfFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre no:");
		num=sc.nextInt();
		int sum=0;
		int fd=0,ld;
		
		ld=num%10;
		System.out.println("ld  "+ld);
		while(num>0)
		{
			fd=num%10;
			
			num=num/10;
		}
		sum=fd+ld;
		System.out.println(sum);
	}

}
