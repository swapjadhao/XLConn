package PatternPrac;

import java.util.Scanner;

public class StarTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******Trangle*******");
		for(int i=1;i<6;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			
			for(int n=1;n<=i;n++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("******Right Traingle Star Pattern*******");
		
		for(int m=1;m<6;m++)
		{
			for(int k=1;k<=m;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("******Left Traingle Star Pattern*******");
		
		for(int j=1;j<6;j++)
		{
			for(int o=5;o>j;o--)
			{
				System.out.print(" ");
			}
			for(int p=1;p<=j;p++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("******Diamond Traingle Star Pattern*******");
		
		for(int i= 1;i<7;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print(" *");	
			}
			System.out.println();
		}
			
		for(int i=1;i<7;i++)
		{
			for(int f=1;f<=i;f++)
			{
				System.out.print(" ");
			}
			
			for(int a=6;a>i;a--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("*******Right Pascal Traingle");
		
		for(int i=1;i<7;i++)
		{
			for(int m=1;m<=i;m++)
			{
				System.out.print("*");
			}					
			System.out.println();
		}
		
		
		for(int i=7;i>1;i--)
		{
			for(int m=1;m<=i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		int v=1;
	for(int m=1;m<6;m++)
	{
		for(int k=1;k<=m;k++)
		{
			System.out.print(" "+v++);
		}
		System.out.println();
	}
	
	Scanner SC= new Scanner(System.in);
	
	
		
		
	}
}


