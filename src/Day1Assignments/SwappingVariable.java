package Day1Assignments;
import java.util.Scanner;
public class SwappingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int a,b,temp;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Before swapping value of a :");
				a=sc.nextInt();
				System.out.println("Before swapping value of b :");
				//a=sc.nextInt();
				b=sc.nextInt();
				 temp=a;
				 a=b;
				 b=temp;
				 System.out.println("after swapping value of a :"+a);
				 System.out.println("after swapping value of b :"+b);
			

		


	}

}
