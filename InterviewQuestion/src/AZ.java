interface I1 {
	
	Abstract show();

}
interface I2 {
	Abstract show();

}

class AZ implements I1,I2
{
	public static void main(String[] arg)
	{
		
		try
		{
			int a=10/0;
		}
		catch(ArithmaticException e)
		{
			System.out.println(e);
		}
		
	
	I2 p=new AZ();
	//p= new AZ();
	p.show();
	
	}

	@Override
	public Abstract show() {
		// TODO Auto-generated method stub
		System.out.println("I am from Abstract");
		return null;
	}
	
}
