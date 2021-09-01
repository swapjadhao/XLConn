public class JavaExceptionExample{  
  public static void main(String args[]){  
	  try
	  {
		  int m=10/0;
	  }
		catch(Exception e)
		{
			System.out.println(e);
		}  catch(Exception e)
	  {
		  System.out.println(e);
	  }
   
  }
}  