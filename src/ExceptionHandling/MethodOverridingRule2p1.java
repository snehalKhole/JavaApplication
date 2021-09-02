package ExceptionHandling;

class Parent1
{
	//rule 2:1:if parent declare any exception 
	void print()throws ArithmeticException
	{
		
	}
	
}




public class MethodOverridingRule2p1 extends Parent1 {
	
	//rule 2:1:child either does not declare exception or declare same exception
	void print()throws ArithmeticException
	{
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
