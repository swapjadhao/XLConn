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
	
	I1 p = null;
	p.show();
	}

	@Override
	public Abstract show() {
		// TODO Auto-generated method stub
		System.out.println("I am from Abstract");
		return null;
	}
	
	
	
}
