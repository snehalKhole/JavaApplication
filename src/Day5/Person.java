package Day5;

public class Person {
	
		int pid;
		String pname;
		Vehicle v;
		
		public Person(int pid, String pname, Vehicle v) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.v = v;
		}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", v=" + v + "]";
	}

	public static void main(String[] args) {
		Person p=new Person(1,"Snehal",new Vehicle(101,"bullet"));
		System.out.println(p);
		
		System.out.println("__________________________________________");
		Person p1=new Person(11,"manu",new Vehicle(102,"KTM"));
		System.out.println(p1);
		
	}

}
class Vehicle
{
	int vid;
	String vname;
	public Vehicle(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + "]";
	}
	

}
