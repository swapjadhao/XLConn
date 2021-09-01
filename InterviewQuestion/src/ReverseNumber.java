
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num=123456789,rev=0;
		
		
		while(Num !=0)
		{
			int A=Num%10;
			rev=rev*10+A;
			Num=Num/10;
			
		}
		System.out.println(rev);

	}

}
