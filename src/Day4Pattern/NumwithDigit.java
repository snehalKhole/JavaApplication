package Day4Pattern;

public class NumwithDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=i;j++)
					{
						if(i%2==0)
						{
						System.out.print(j);
					}
						else
						{
							System.out.print((char)(j+64));
						}
					}
					System.out.println();
				}

			

		


	}

}
