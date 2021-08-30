package Day3;

public class Stud {
	int rollNo;
	int addmissionNo;
	int age;
	int courseId;
	public void doPublic()
	{
System.out.println("Public");
	}
	void doDefault()
	{
		System.out.println("Default");
		
	}
	protected void doProtected()
	{
		System.out.println("Protected");
	}
	private void doPrivate()
	{
		System.out.println("Private");
	}


}
