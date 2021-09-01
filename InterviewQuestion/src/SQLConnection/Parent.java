package SQLConnection;

public class Parent {

String Name;
int age;
static String Department="QA";
	
	public Parent(String Name,int Age)
	{
		System.out.println("Inside Parent Constructor");
		this.Name=Name;
		this.age=Age;
		
		
	}
	public static void Dummy()
	{
		System.out.println(Department);
	}
	
	public void getDetails()
	{
		System.out.println(Name);
		System.out.println(age);
		System.out.println(Parent.Department);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent P= new Parent("Swap",29);
		Parent P1= new Parent("Anunp",25);
		P.getDetails();
		P1.getDetails();
		Parent.Dummy();
		
	}

}
