package Day4;

public class Cycle {
	int cid;
	int noOfWheels;
	
	public Cycle() {
	System.out.println("I am in default constructor");
	}
	
	public Cycle(int cid, int noOfWheels) {
		this();
		System.out.println("I am another constructor");
	}

	public static void main(String[] args) {
		Cycle c=new Cycle();
		
		Cycle c1=new Cycle(11,2);
		
	}

}
