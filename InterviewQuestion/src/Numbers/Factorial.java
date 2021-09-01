package Numbers;

public class Factorial {

	int Fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num=5,result;
		
		Factorial F= new Factorial();
		result=F.CalFac(Num);
		System.out.println("Factorial of "+Num+" is "+result);
	}
	
	public int CalFac(int No)
	{
		if(No>1)
		{
			Fact=Fact*No;
			CalFac(No-1);
		}
		return Fact;
		
		
	}

}
