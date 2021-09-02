package ExceptionHandling;

public class RethrowException {
	public static void test1() throws Exception {
		System.out.println("exception in test1 method");
		throw new Exception("thrown from test1 method");
	}

	public static void test2() throws Throwable {
		try {
			test1();

		} catch (Exception e) {
			System.out.println("In test 2 method");
			throw e;
		}

	}

	public static void main(String[] args) throws Throwable {
		try {
			test2();
		} catch (Exception e) {
			System.out.println("Caugth in main method");
		}

	}

}
