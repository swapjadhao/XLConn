final class Demo{	
	final void Test(int A)
	{
		System.out.println("Demo");
	}
	
	void Test(int A,String G)
	{
		
	}
}




public class finalKeyword extends Demo {
	void Test()
	{
		System.out.println("Demo1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A=10;
	final int B=5;//
		 B= A+20;
		System.out.println(B);
		Demo D= new Demo();
		
		try
		{
			
		}
		
		finally
		{
			System.out.println("Finally");
		}
		

	}

}
