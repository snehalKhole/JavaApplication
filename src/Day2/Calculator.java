package Day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int add, sub, mult;
		float div;

		Scanner sc = new Scanner(System.in);

		System.out.println("1:Addition" + "\n" + " 2:Subtraction" + "\n" + " 3:Multiplication" + "\n" + "  4:Division");
		System.out.println("Enter your choice:");
		int p = sc.nextInt();

		System.out.println("Enter the number:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		switch (p) {
		case 1:
			add = a + b;
			System.out.println("Addition is:" + add);
			break;

		case 2:
			sub = a - b;
			System.out.println("Subtraction is:" + sub);
			break;

		case 3:
			mult = a * b;
			System.out.println("Multiplication is:" + mult);
			break;

		case 4:
			div = (float) a / b;
			System.out.println("Division is:" + div);
			break;

		default:
			System.out.println("invalid number");

		}

	}

}
