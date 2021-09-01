package SQLConnection;

public class LengthOfStringWithoutLengthM {

	public static void main(String[] args) {
		String Data="I am Swapnil.";
		System.out.println(Data.length());
		int l=0;
		char[] A= Data.toCharArray();
		
		for(char C:A)
		{
			l++;
		}
		
		int i=0;
		System.out.println(l);
		try {
		for(i=0;;i++)
		{
		Data.charAt(i);
		}
		}
		catch(Exception e)
		{
			
		}
		System.out.println(i);
				
		System.out.println(Data.substring(6,Data.length()-1));// e can use with one or two parameter
		System.out.println(Data.subSequence(6,Data.length()-1));//e can used with mandatory two parameter
	}
}
