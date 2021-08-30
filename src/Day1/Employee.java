package Day1;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary:");
		int basicSal=sc.nextInt();
				

		if(basicSal<=10000)
		{
			int da=80*basicSal/100;
			int hra=20*basicSal/100;
			int grossSal=basicSal+da+hra;
			System.out.println("Gross salary is:"+grossSal);
			
			
		}
		else if(basicSal<=20000)
		{
			int da=90*basicSal/100;
			int hra=25*basicSal/100;
			int grossSal=basicSal+da+hra;
			System.out.println("gross salary is:"+grossSal);
		}
		else if(basicSal>20000)
		{
			int da=95*basicSal/100;
			int hra=30*basicSal/100;
			int grossSal=basicSal+hra+da;
			System.out.println("gross saalry is:"+grossSal);
		}

	}

}
