package Day2;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		int num = 0;

		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		int sum = 0;
//		int rem = 0;
		for (int i = num; i>0; i=i/10) {
//			rem = num % 10;
//			sum = sum + rem;
//			num = num / 10;
			sum=sum+i%10;
		}
		System.out.println(sum);

	}

}
