
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=8,c=7;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else
		{System.out.println("B is greater");}
		
		int no=10;
		
		if(no%2==0)
		{
		System.out.println("number is Even");	
		}
		else
		{
			System.out.println("number is odd number");
		}
		
		
		int year=2016;
		
		if(year%400 ==0 || (year%4==0 && year%100!=0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}

}
