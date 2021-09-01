
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int R = 1; R <= 5; R++) {
			for (int C = 1; C <= R; C++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("********************");

		for (int k = 1; k <= 4; k++) {
			for (int j = 4; j >= k; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("********************");

		for (int n = 1; n <= 4; n++) {

			for (int m = 3; m >= n; m--) {
				System.out.print(" ");

			}

			for (int h = 1; h <= n; h++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("********************");

		for (int n = 1; n <= 4; n++) {
			for (int j = 4; j >= n; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print(" *");
			}
			System.out.println();

		}

		System.out.println("********************");

		for (int n = 1; n <= 4; n++) {
			for (int m = 4; m >= 1; m--) {
				if (m > n) {
					System.out.print(" ");
				} else {
					System.out.print(" *");
				}

			}

			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{ 
				System.out.print("*"); 
				}
			 
			
		}
		System.out.println("*******************************");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
				}
			
			System.out.println();
			}
		
		for(int m=1;m<=10;m++)
		{
			for(int l=1;l<=m;l++)
			{
				if(m>=2 && l<=m-1)
				{
					
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		}
	}

