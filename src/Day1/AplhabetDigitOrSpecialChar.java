package Day1;

import java.util.Scanner;

public class AplhabetDigitOrSpecialChar {

	public static void main(String[] args) {
		char ch;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet or digit:");
		ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z')
			System.out.println(ch+":is alphabet");
		else if(ch>='0'&& ch<='9')
			System.out.println(ch+":is digit");
		else
			System.out.println(ch+"is special symbol");

	}

}
