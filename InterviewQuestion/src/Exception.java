
public class Exception {
	
	
	void m1()
	{
		m2();
	}
	
	void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= new int[10];
		System.out.println(a[0]);
		System.out.println(a[9]);
		//System.out.println(a[-1]);//It gives Array Index Out of bound exception
		//System.out.println(a[10]);
		
		//String Str= null;
		//System.out.println(Str.length());// it gives Null pointer exception
		// if u perform any action with null value,it  shows null pointer exception 
		
		Exception E= new Exception();// It gives StackOverFlow Exception
		E.m1();// If there any recursive opeation it gives above error
		
		
	}

}
