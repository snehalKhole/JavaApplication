package Day1;

import java.util.Scanner;

public class Divisible5And11 {

	public static void main(String[] args) {
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		m=sc.nextInt();
		if(m%5==0 && m%11==0)
			System.out.println(m+":Number is divisible by 5 and 11 ");
		else 
			System.out.println(m+":Number is not divisible by 5 and 11  ");
	}

}
