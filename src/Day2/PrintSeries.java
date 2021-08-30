package Day2;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int num=sc.nextInt();
		int pr=0;
		for(int i=1;i<=num;i++)
		{
		 pr=(pr*2)+1;
		System.out.println(pr);
	}

}
}