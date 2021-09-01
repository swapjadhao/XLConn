class Test
{

	static void show()
	{
		System.out.println("1");
	}
	
}

class xyz extends Test{
	
	void show()
	{
		super.show();
		System.out.println("2");
	}
	
	public static void main(String [] args)
	{
		//Test T= new Test();
		xyz X= new xyz();
		X.show();
		
	}

	
}

