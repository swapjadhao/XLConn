
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Data= "Selenium";
		int len= Data.length();
		String rev= "";
		for(int k=len-1;k>=0;k--)
		{
			rev=rev+Data.charAt(k);
		}
		System.out.println(rev);
		
		String Data2="SwapnilJadhao";
		int len2=Data2.length();
		String rev2="";
		for(int m=len2-1;m>1;m--)
		{
			rev2=rev2+Data2.charAt(m);
		}

	}

}
