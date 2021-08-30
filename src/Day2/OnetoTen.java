package Day2;

public class OnetoTen {

	public static void main(String[] args) {
		//one to 10 no
//		for(int i=1;i<=10;i++)
//			System.out.println(i);
//		System.out.println("loop end");
		
		//reverse
//		for(int i=10;i>0;i--)
//			System.out.println(i);
		
		//divisible by 2 and 3
//		for(int i=1;i<=30;i++)
//		{
//			if(i%2==0 || i%3==0)
//			{
//				System.out.println(i);
//			}
//		}
		//sum and avg
		int sum=0,avg=0;
		for(int i=2;i<10;i=i+2)
		{
			if(i%2==0)
			{
				sum +=i;
				avg=sum/10;
			}
		}
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
	}

}
