package InterviewCode;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber R= new ReverseNumber();
		R.Method1(123456789);
		
		

	}
	
	public void Method1(int no)
	{
		//int no=123456789;
		int rev=0;
		while(no!=0)
		{
			int Num=no%10;
			rev=rev*10+Num;
			Num=Num/10;
		}
		System.out.println(rev);
		
		
	}

}
