package Day2Assignments;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for(i=1;i<=30;i=i+2)
		{
			if(i%2!=0)
			{
			sum=sum+i;
			}
					
		}
			System.out.println("sum is:"+sum);
			
	}

}
