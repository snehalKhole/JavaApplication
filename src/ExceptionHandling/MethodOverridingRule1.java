package ExceptionHandling;

//rule 1:if parent does not declare any exception then child either does not declare 
//any exception or declare only unchacked type exception
class Parent
{
	//rule 1
	void show()
	{
		
	}

}




public class MethodOverridingRule1 extends Parent{
	
	//rule 1:
	void show()throws IOException //error for checked exception allowed only unchecked
	{
		
	}
	
	
	public static void main(String[] args) {

	}

}
