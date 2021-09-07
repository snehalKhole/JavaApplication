package Day2;

public class OneTo10UsingWhile {

	public static void main(String[] args) {
//		int i=1;
//		
//		while(i<=10)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		//reverse
//		int i=10;
//		while(i>0)
//		{
//			System.out.println(i);
//			i--;
//		}
		
		//divisible by 2 and 3
		int i=1;
		while(i<=30)
		{
			if(i%2==0 || i%3==0)
				System.out.println(i);
			i++;
		}
	}

}
