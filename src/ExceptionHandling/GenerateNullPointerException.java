package ExceptionHandling;

public class GenerateNullPointerException {

	public static void main(String[] args) {
		
		String str[]=null;
		System.out.println(str[0]);
		
		int a[]= {1,3};
		System.out.println(a[5]);
		
		int[] b=null;
		int len=b.length;
	}

}
