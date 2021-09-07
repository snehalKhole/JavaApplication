package Day2Assignments;

import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			if(n%i==0)
				System.out.println("factors are  :   "+i);
		//while(i<=n)
		//{
			//if(n%i==0)
				//System.out.println(i+"\t");
			//i++;
		//}
	}

}
