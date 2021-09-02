package ExceptionHandling;

import java.io.IOException;

class Parent2
{
	//rule2:2 declare parent exception
	void print() throws IOException
	{
		
	}
}

public class MethodOverridingRule2p2 extends Parent2 {
	
	
		//rule2:2 child either does not declare exception or declare same exception or declare child exception of parent exception
		void print()throws IOException
		{
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
