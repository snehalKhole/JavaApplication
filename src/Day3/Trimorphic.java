package Day3;

import java.util.Scanner;

public class Trimorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,product,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
			product=num*num*num;
			s=product/10;
			
			if(num==product)
			{
				System.out.println("Number is tromorphic");
			}
			else
				System.out.println("Number is not triomorphic");
		

	}

}
