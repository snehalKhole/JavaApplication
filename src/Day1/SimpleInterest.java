package Day1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p:");
		float p=sc.nextFloat();
		System.out.println("Enter r:");
		float r=sc.nextFloat();
		System.out.println("Enter t:");
		float t=sc.nextFloat();
		
		float result=(p*r*t)/100;
		System.out.println("Simple interest:"+result);
	}

}
