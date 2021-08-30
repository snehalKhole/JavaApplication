package Day3;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int rem=0,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		n=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(n%sum==0)
			System.out.println(n+":is harshad number");
		else
			System.out.println(n+":is not harshad number");
		
	}

}
