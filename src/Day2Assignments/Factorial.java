package Day2Assignments;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int i,fact=1;
				int n;
				Scanner sc=new Scanner(System.in);
				//i=sc.nextInt();
				
				System.out.println("Enter the number:");
				n=sc.nextInt();
				for(i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				
					System.out.println("factorial of number  "+n+" is "+fact);
			
			}
}

		


	


