package Day1;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet:");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='o' || ch=='u' || ch=='i' ||ch=='e')
			System.out.println(ch+":is vowels");
		else
			System.out.println(ch+":is consonant");
	
	}

}
