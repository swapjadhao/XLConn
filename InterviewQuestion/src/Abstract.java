abstract class vehicle {
	int wheel;
	abstract void Start();
}

class Car extends vehicle
{
	void Start()
	{
		wheel=4;
		System.out.println("Starts with Key");
	}
}

class Bike extends vehicle
{
	void Start()
	{
		//wheel=2;
		System.out.println("Starts with Kick");
		System.out.println(wheel);
		e.printStackTrace();
	}
}
public class Abstract extends Bike{

	public static void main(String[] args) {
		
		//vehicle V= new vehicle();// We can not create object for Abstract class
		
	
		Abstract A = new Abstract();
		A.wheel=5;
		System.out.println(A.wheel);
		A.Start();
		
		
		

	}

}
