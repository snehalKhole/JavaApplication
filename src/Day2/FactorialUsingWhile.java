package Day2;

public class FactorialUsingWhile {

	public static void main(String[] args) {
		int i=1,fact=1;
		int n=5;
		while(i<=n)
		{
			fact=fact*i;
//			System.out.println(fact);
			i++;
		}
		System.out.println(fact);
	}

}
