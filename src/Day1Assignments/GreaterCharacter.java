package Day1Assignments;
import java.util.Scanner;
public class GreaterCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter charater:");
		a=sc.next().charAt(0);
		b=sc.next().charAt(0);
		if(a>b )
			System.out.println(a+":is greater");
		else if(b>a)
		System.out.println(b+":is greater");

	}

}
