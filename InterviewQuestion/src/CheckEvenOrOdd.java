import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int i= reader.nextInt();
		if(i % 2 ==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		String S= "Swapnil Jadhao";
		StringBuilder SB= new StringBuilder();
		SB.append(S);
		System.out.println(SB.reverse());
		
		


	}

}
