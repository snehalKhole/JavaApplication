package Day5;

public class Institute {
	int id;
	String name;
	Branch b;
	

	public Institute(int id, String name, Branch b) {
		super();
		this.id = id;
		this.name = name;
		this.b = b;
	}
	
	
	public Institute() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", b=" + b + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Branch getB() {
		return b;
	}


	public void setB(Branch b) {
		this.b = b;
	}


	public static void main(String[] args) {
		//Using Constructor
		Institute ii=new Institute(1,"ThinkQuotient",new Branch(11,"Management",new Subject(101,"Computer Science",new Topic(1010,"Artificial Intelligence",new SubTopic(10,"Machine Learning",new Question(20,"What is machine learning"))))));
		System.out.println(ii);
		
		//Using getter setter
		Institute in=new Institute();
		in.setId(21);
		in.setName("DY Patil College Akurdi");
		in.setB(new Branch());
		in.getB().setId(45);
		in.getB().setName("Computer Science");
		in.getB().setS(new Subject());
		in.getB().getS().setId(67);
		in.getB().getS().setName("Andriod");
		in.getB().getS().setT(new Topic());
		in.getB().getS().getT().setId(78);
		in.getB().getS().getT().setName("Mobile Phone");
		in.getB().getS().getT().setSt(new SubTopic());
		in.getB().getS().getT().getSt().setId(44);
		in.getB().getS().getT().getSt().setName("Working");
		in.getB().getS().getT().getSt().setQ(new Question());
		in.getB().getS().getT().getSt().getQ().setId(70);
		in.getB().getS().getT().getSt().getQ().setName("programming");
		System.out.println("Institite id:"+in.getId()+"\n"+" Institute name:"+in.getName());
		System.out.println("Branch id:"+in.getB().getId()+"\n"+"Branch name:"+in.getB().getName());
		System.out.println("Subject id:"+in.getB().getS().getId()+"\n"+"Subject name:"+in.getB().getS().getName());
		System.out.println("Topic id:"+in.getB().getS().getT().getId()+"\n"+"Topic name:"+in.getB().getS().getT().getName());
		System.out.println("SubTopic id:"+in.getB().getS().getT().getSt().getId()+"\n"+"SubTopic name:"+in.getB().getS().getT().getSt().getName());
		System.out.println("Question id:"+in.getB().getS().getT().getSt().getQ().getId()+"\n"+"Question name:"+in.getB().getS().getT().getSt().getQ().getName());
	}

}
class Branch
{
	int id;
	String name;
	Subject s;
	public Branch(int id, String name, Subject s) {
		super();
		this.id = id;
		this.name = name;
		this.s = s;
	}
	public Branch() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", s=" + s + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getS() {
		return s;
	}
	public void setS(Subject s) {
		this.s = s;
	}
	
	
}
class Subject
{
	int id;
	String name;
	Topic t;
	public Subject(int id, String name, Topic t) {
		super();
		this.id = id;
		this.name = name;
		this.t = t;
	}
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", t=" + t + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic getT() {
		return t;
	}
	public void setT(Topic t) {
		this.t = t;
	}
	
	
}
class Topic
{
	int id;
	String name;
	SubTopic st;
	public Topic(int id, String name, SubTopic st) {
		super();
		this.id = id;
		this.name = name;
		this.st = st;
	}
	public Topic() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", st=" + st + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SubTopic getSt() {
		return st;
	}
	public void setSt(SubTopic st) {
		this.st = st;
	}
	
	
}
class SubTopic
{
	int id;
	String name;
	Question q;
	public SubTopic(int id, String name, Question q) {
		super();
		this.id = id;
		this.name = name;
		this.q = q;
	}
	public SubTopic() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SubTopic [id=" + id + ", name=" + name + ", q=" + q + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	
}
class Question
{
	int id;
	String name;
	public Question(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}