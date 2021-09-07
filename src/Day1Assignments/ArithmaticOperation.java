package Day1Assignments;
import java.util.Scanner;
public class ArithmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("Addition is:"+c);
		
		c=a-b;
		System.out.println("Subtraction is:"+c);
		
		c=a*b;
		System.out.println("Multiplication is:"+c);
		
		c=a/b;
		System.out.println("Division is:"+c);
		
		c=a%b;
		System.out.println("MOdulus is:"+c);
		

	}

}
