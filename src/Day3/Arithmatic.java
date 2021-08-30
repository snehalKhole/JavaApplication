package Day3;


public class Arithmatic {
	public int add(int x,int y)
	{
		int sum=x+y;
		return sum;
		
		
	}
	public int sub(int a,int b)
	{
		int s=a-b;
		return s;
	}	
	public int mult(int s,int j)
	{
		int m=s*j;
		return m;
	}
	public float div(float d,float u)
	{
		float dx=d/u;
		return d;
	}
	public static void main(String[] args) {
		Arithmatic a=new Arithmatic();
		System.out.println("Addition:"+a.add(56, 5));
		System.out.println("Subtraction:"+a.sub(45, 23));
		System.out.println("Multiplication:"+a.mult(34, 6));
		System.out.println("Division:"+a.div(5.6f, 4.2f));
	
	}

}
