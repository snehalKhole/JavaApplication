package Day1Assignments;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				float amt,time,rate,SI; 
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter amount:");
				amt=sc.nextFloat();
				
				System.out.println("Enter time:");
				time=sc.nextFloat();
				
				System.out.println("Enter rate:");
				rate=sc.nextInt();
				SI=(amt*time*rate)/100;
				
				System.out.println("Simple interest:"+SI);
			

		


	}

}
