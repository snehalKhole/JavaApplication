package Day1Assignments;
import java.util.Scanner;
public class EletricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float unit,bill=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter electricity unit:");
		unit=sc.nextInt();
		
		if(unit<=50)
		{
			bill=unit*0.50f;
			//System.out.println("Electricity bill is:"+bill);
			
		}
		else if(unit>=50 && unit<=150)
		{
			bill=(100*0.50f)+(unit-50)*0.75f;
			//System.out.println("Electricity bill is:"+bill);
		}
		else if(unit>=150 && unit<=250)
		{
			bill=(100+0.50f)+(100+0.75f)+(unit-150)*1.20f;
			
		}
		System.out.println("bill:"+bill);
	}
	

}
