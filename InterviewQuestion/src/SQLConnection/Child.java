package SQLConnection;

public class Child extends Parent {
	
int Data=50;
public void Method()
{
	
System.out.println("Inside Child Method");	
}

public void getStringdata()
{
	System.out.println(Data);
	//System.out.println(super.Data);
}
public static void Dummy()
{
	System.out.println(Data);
	//System.out.println(super.Data);
}

public Child()
{
	System.out.println("Inside Child Constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child Ch= new Child();
		System.out.println(Ch.Data);
	
	}

}
