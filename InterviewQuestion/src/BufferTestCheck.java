

public class BufferTestCheck {

	
	
	public void StringTest(String value)
	{
		
		String Str = value;
		long time3= System.currentTimeMillis();
		for(int i=0;i<=100000;i++)
		{
			String T=Str+" String Test";
		}
		System.out.println("Time taken by String ="+(System.currentTimeMillis()-time3+"ms"));
		
	}

	public void StringBufferTest(String value)
	{
		//String Str = value;
		StringBuffer sb= new StringBuffer(value);
		long time2= System.currentTimeMillis();
		for(int i=0;i<=100000;i++)
		{
			StringBuffer T=sb.append(value);
		}
		System.out.println("Time taken by String Buffer ="+(System.currentTimeMillis()-time2+"ms"));
		
		
	}	
	
	public void StringBuilderTest(String value)
	{
		
		//String Str = value;
				StringBuilder sb= new StringBuilder(value);
				long time1= System.currentTimeMillis();
				for(int i=0;i<=100000;i++)
				{
					//String T=sb+" String Test";
					sb.append(value);
				}
				System.out.println("Time taken by String Builder ="+(System.currentTimeMillis()-time1+"ms"));
				
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferTestCheck M= new BufferTestCheck();
		M.StringTest("Hello");
		M.StringBufferTest("Hello");
		M.StringBuilderTest("Hello");

	}

}
