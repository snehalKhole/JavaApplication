package Day1Assignments;
import java.util.Scanner;
public class GreaterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		b=sc.nextInt();
		 
		if(a>b)
	    System.out.println(a+": is greater");
		else
		System.out.println(b+": is greater");

	}

}
