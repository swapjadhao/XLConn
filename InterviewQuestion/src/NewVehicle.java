abstract class NewVehicle {

	abstract void Start();
}


class NewCar extends NewVehicle
{

	@Override
	void Start() {
		System.out.println("NewCar start with key");
		
	}
	
}

class Scooter extends NewVehicle
{

	@Override
	void Start() {
		System.out.println("Scooter start with Kick");
		
	}
	public static void main(String [] args)
	{
		NewCar A= new NewCar();
		Scooter S= new Scooter();
		A.Start();
		S.Start();		
	}
	
}