package Day1Assignments;
import java.util.Scanner;
public class ConversionOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				int week,day,yr;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter days:");
				day=sc.nextInt();
				
				yr=(day/365);
				System.out.println("Years:"+yr);
				
				week=(day%365)/7;
				System.out.println("Weeks:"+week);
				
				day=day-((yr*365)+(week*7));
				System.out.println("Days:"+day);
				
				
			

		

	}

}
