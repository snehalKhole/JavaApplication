package ExceptionHandling;

public class HandleArrayIndexOfBoundException {

	public static void main(String[] args) {
		int a[]= {1,8,5,3,0,7,4};
		try {
			System.out.println(a[11]);
		} catch (Exception e) {
		System.out.println("in catch block");
		}
		
	}

}
