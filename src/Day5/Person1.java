package Day5;

public class Person1 {
	String pname;
	String gender;
	int age;
	Address a;
	

	public Person1(String pname, String gender, int age, Address a) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.age = age;
		this.a = a;
	}


	@Override
	public String toString() {
		return "Person1 [pname=" + pname + ", gender=" + gender + ", age=" + age + ", a=" + a + "]";
	}


	public static void main(String[] args) {
	Person1 p1=new Person1("Snehal","female",22,new Address("Ahmednagar","Maharashtra","India"));
	System.out.println(p1);

	}

}
class Address
{
	String city;
	String state;
	String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	}