package Day4;

public class Account {
	long accNo=875562l;
	String custName="manu";
	
	public Account() {
	System.out.println("I am in default in constructor");
	}
	
	

	public Account(long accNo, String custName) {
		System.out.println("I am in parameterized constructor");
	}



	public static void main(String[] args) {
		Account a=new Account();
		
		Account aa=new Account(7765544l,"snehal");
		
		System.out.println(aa.accNo);
		System.out.println(aa.custName);
	}

}
