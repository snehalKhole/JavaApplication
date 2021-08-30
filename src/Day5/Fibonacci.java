package Day5;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		 
		System.out.println(a+""+b);
		for(int i=3;i<=10;i++)
			{
			int term=a+b;
			
		System.out.println(""+term);
		a=b;
		b=term;
			}
	}

}
