package Day2Assignments;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
			if(i%2==0)
			{
				int square=i*i;
				System.out.println(square);
			}
			else
			{
				System.out.println("-"+i);
			}

	}

}
