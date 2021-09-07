package Day1Assignments;
import java.util.Scanner;
public class DivisibleByThreeNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int m;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				m=sc.nextInt();
				if(m%3==0)
					System.out.println(m+":Number is divisible by 3 ");
				else if(m%9==0)
					System.out.println(m+":Number is divisible by 9 ");
				else
					System.out.println(m+":Number is not divisible by 3 & 9");
			

		


	}

}
