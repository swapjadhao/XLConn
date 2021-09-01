package SQLConnection;

class Demo 
{
	
	private Demo()
	{
		System.out.println("Inside Demo");
	}
	
}

public class CostructorPrivate extends Demo{
	
		public static void main(String[] args) {
			Demo D= new Demo();
		}
}
