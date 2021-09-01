import java.io.PrintWriter;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub --Checked Exception
		//PrintWriter pb= new PrintWriter("abs.txt");// FileNotFOund exception ---checked Application
		//Thread.sleep(10000);//
		
		//.System.out.println(100/0);// ---Unchecked Application
		
		String data= null;
		System.out.println(data+"Data");
		//Example
		
		System.out.println("Statement 1");
		//System.out.println(10/0);
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			//System.out.println("Prog shift bcoz of Exception "+e);
			//System.out.println(10/2);
			//e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("Statement 2");
		

	}

}
