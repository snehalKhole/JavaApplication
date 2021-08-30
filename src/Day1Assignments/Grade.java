package Day1Assignments;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,n4,n5,sum,per;
		//float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		
		sum=n1+n2+n3+n4+n5;
		System.out.println("Sum is:"+sum);
		
		per=sum/500*100;
		System.out.println("Percentage:"+per);
		
		if(per<=40)
		System.out.println("fail");
		else if(per>=40)
			System.out.println("Pass");
		else if(per<60)
			System.out.println("Pass with first class");
		else if(per>=60)
			System.out.println("Pass with disctinction");


	}

}
