
public class MainOverloading {

	
	public static void main (String args[])
	{
	System.out.println("Dummy");
	MainOverloading M= new MainOverloading();
	M.main(12);
	}

	public static void main (int a)
	{
	System.out.println(a);
	}

	
}
