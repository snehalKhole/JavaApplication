package Day4Pattern;

public class ZPat {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==4||j==4-i)
				
					System.out.print("*");
				
				else
				
					System.out.print(" ");
				
			
		}
		System.out.println();
		}
	}

}
