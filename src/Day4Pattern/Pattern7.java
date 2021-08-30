package Day4Pattern;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(i>=1 && i<=2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
