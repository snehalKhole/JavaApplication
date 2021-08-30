package Day4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int count=0;
		int num=n;
		for(int i=0;i<=9;i++)
		{
		
	while(num>0)
	{
		int	res=num%10;
		if(res==i)
		
				count++;
		
		num=num/10;
		}
	
		if(count>0)
		{
			System.out.println(i+"="+count);
		}
	
	}
	}
}

