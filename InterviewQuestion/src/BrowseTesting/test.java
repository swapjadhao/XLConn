package BrowseTesting;

public class test {
	
	public static void main(String[] args) {
		
		
		
		int K,S=0, flag=0;
		
		int n=10;
		S=n/2;
		
		if(n==0 ||n==1)
		{
			System.out.println(n+" is not prime number");
		}
		else
		{
			for(K=2;K<=S;K++)
			{
				if(n%K==0)
				{
					System.out.println("Number is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Number is prime number");
			}
		}

		//String str = "Hello World Hello World Hello" - count occurence of word "Hello"

		String str = "Hello World Hello World Hello";
		int count=0;
		String[] Data= str.split(" ");
		//System.out.println(Data.length);
		for(int i=0;i<Data.length;i++)
		{
			if(Data[i].equalsIgnoreCase("Hello"))
			{
				count++;
			}
		}
		System.out.println("Count for Hello ="+count);
		
		
}
}
