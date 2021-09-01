package Numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{Prime number is a number which is devide by only 1 or itself
		/*
		 * int no=10,temp=0;
		 * 
		 * for(int i=2;i<=no-1;i++) { if(no%i==0) { temp=temp+1; } }
		 * 
		 * if(temp>0){ System.out.println(no +" is not prime number"); } else {
		 * System.out.println(no+" is prime number"); }
		 */
		
		//find 1 to 100 prime number
		int temp1=0;
		for(int i=1;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp1=temp1+1;
				}
				
			}
			if(temp1==0)
				
			{
					System.out.println(i +"is not prime number");				
			}
			else
			{
				temp1=0;
			}
		}
		

	}
}


