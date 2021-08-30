package Day1Assignments;
import java.util.Scanner;
public class StudentPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

					int m1,m2,m3,m4,m5,sum,avg;
					int perc;
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter marks of 5 subjects: ");
					m1=sc.nextInt();
					m2=sc.nextInt();
					m3=sc.nextInt();
					m4=sc.nextInt();
					m5=sc.nextInt();

					sum=m1+m2+m3+m4+m5;
					System.out.println("Total of marks is:"+sum);
					
					
					avg=(sum/5);
					System.out.println("Average is:"+avg);
					
					perc=(sum/500)*100;
					System.out.println("Percentage is:"+perc);
					
					
			

		


	}

}
