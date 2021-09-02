package ExceptionHandling;

class Parent4
{
	
	//rule 2:3 if declare child exception
	void print()throws ArrayIndexOutOfBoundsException
	{
		
	}


}
public class MethodOverridingRule2p3 extends Parent4 {
	//rule 2:3 child not allowed to declare parent exception this rule is only applicable for checked type exception

	void print()throws IndexOutOfBoundsException
	{
		
	}
	public static void main(String[] args) {

	}

}
