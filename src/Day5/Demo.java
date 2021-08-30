package Day5;

abstract class Teacher
{
	int tid;
	String tname;
	long mono;
	public Teacher(int tid, String tname, long mono) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.mono = mono;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", mono=" + mono + "]";
	}


	abstract void salary();
	
}

class Hourlybased extends Teacher
{
	int rate_per_hr;
	int hrs;
	public Hourlybased(int tid, String tname, long mono, int rate_per_hr, int hrs) {
		super(tid, tname, mono);
		this.rate_per_hr = rate_per_hr;
		this.hrs = hrs;
	}
	@Override
	void salary() {
		System.out.println("in Hourlybased salary method");
		
	}
	
	
}
class SalaryBased extends Teacher
{
	int salary;

	public SalaryBased(int tid, String tname, long mono, int salary) {
		super(tid, tname, mono);
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "SalaryBased [salary=" + salary + "]";
	}


	void salary() {
		
		System.out.println("In salarybased salary method");
	}

}

public class Demo {

	public static void main(String[] args) {
		
		Teacher hb=new Hourlybased(11,"Prof.Shinde",7648787454l,8,6);
		System.out.println(hb);
		hb.salary();
		System.out.println("___________________________________________________________");
		Teacher sb=new SalaryBased(101,"prof.Deshmukh",7856839825l,90000);
		System.out.println(sb);
		sb.salary();
	}

}
