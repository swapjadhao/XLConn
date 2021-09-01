
public class DefaultConstructor {
	int i;
	String Df;
	DefaultConstructor(String text,int Num)
	{
		System.out.println(text+Num);
	}
	/*
	 * DefaultConstructor() { System.out.println("This is User Created "); } // User created Constructor
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstructor Cons= new DefaultConstructor("Swap",22);
		System.out.println(Cons.i+" "+ Cons.Df);
		// It print zerod using default constructor
		

	}

}
