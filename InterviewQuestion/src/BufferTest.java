
public class BufferTest {

	
	
	public void Stringcheck(String string)
	{
		String sb="Hello";//  literal
		
		Long StartTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{			
			String T= sb+" StringBufferTest";
		}
		System.out.println("Time required by String  = "+(System.currentTimeMillis()-StartTime)+"ms");
		
		
	
		
	}
	
	
	public void BufferString(String string)
	{
		StringBuffer sb=new StringBuffer("Hello");
		
		Long StartTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{			
			sb.append("StringBufferTest");
		}
		System.out.println("Time required by BufferString  = "+(System.currentTimeMillis()-StartTime)+"ms");
		
	
	}
	
	public void BuilderString(String string)
	{
		StringBuilder sb=new StringBuilder("Hello");
		
		Long StartTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{			
			sb.append("StringBufferTest");
		}
		System.out.println("Time required by BuilderString = "+(System.currentTimeMillis()-StartTime)+"ms");
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferTest BT= new BufferTest();
		BT.BufferString("NewKeyWord");
		BT.BuilderString("NewWord");
		BT.Stringcheck("Swap");
		

	}

}
