public class ConstructorEmp {
	
	String Name;
	int age;
	public ConstructorEmp(String N,int A)
	{
		this.Name=N;
		this.age=A;
	}

	public ConstructorEmp()
	{
		System.out.println("Blank");
	}
	
	public static void main(String []args)
	{
		ConstructorEmp A= new ConstructorEmp("Swapnil",25);
		ConstructorEmp A1= new ConstructorEmp("Swap",23);
		ConstructorEmp A2= new ConstructorEmp();
		
		System.out.println(A.Name);
		System.out.println(A1.age);
		
		
		
		
	}
}
