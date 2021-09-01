package ExceptionPrac;

public class ArithMaticExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("*********");
			e.toString();
			System.out.println("*********");
			System.out.println(e);
			System.out.println("*********");
			System.out.println(e.getMessage());
		}		
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}

}
