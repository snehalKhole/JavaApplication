package Day1;

import java.util.Scanner;

public class WeekMenuDriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Sunday"+"\n"+"2:monday"+"\n"+"3:tuesday"+"\n"+"4:wednesday"+"\n"+"5:thursday"+"\n"+"6:friday"+"\n"+"7:saturday");
		System.out.println("Enter your choice");
		int day=sc.nextInt();
		switch(day)
		{
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		default:System.out.println("day does not exist!!");
		}
		
	}

}
