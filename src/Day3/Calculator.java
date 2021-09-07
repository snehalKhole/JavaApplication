package Day3;

public class Calculator {
	int a,b;
	
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}

	void add()
	{
		int c=a+b;
		System.out.println("Addition:"+c);
		
	}
	int mult()
	{
		return a*b;
	}
	float div()
	{
		return a/b;
	}
	static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial:"+fact);
		return fact;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator(45,67);
		c.add();
		System.out.println("multiplication:"+c.mult());
//		System.out.println("division:"+c.div());
		float f=c.div();
		System.out.println(f);
		fact(5);
		
	}

}
