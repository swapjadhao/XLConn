class A
{
	void showA()
	{
		System.out.println("Method A");
		
	}
}

class Inheritance extends A {
	
	void showA()
	{
		System.out.println("Method B");
	}
	
	public static void main(String[] args) 
	{
		//Inheritance objA= new Inheritance();
	//	objA.showA();
		//A a= new A();
		//a.showA();
		
		A j= new Inheritance();
		j.showA();
		Inheritance kJ= (Inheritance)j;
		kJ.showA();
		
		
		
				

	}

}


