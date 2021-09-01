
public class PassNullOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(null);

	}
	
	public static void test(Object o)
	{
		System.out.println("Object method");
	}
	public static void test(String o)
	{
		System.out.println("String method");
	}

}
