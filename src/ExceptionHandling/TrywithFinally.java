package ExceptionHandling;

public class TrywithFinally {

	public static void main(String[] args) {
		try
		{
			int c=12/0;
		}
		finally
		{
			System.out.println("In finally");
		}

	}

}
