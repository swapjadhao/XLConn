import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet T= new TreeSet();
		//T.add("a"); //it will print at last as per the sorting order
		//T.add("B");
		//T.add("D");
		//T.add("V");
		//T.add("A");
	//	T.add(null);//null pointer execption
		//T.add(0); class cast exception
		T.clear();
		
		//T.add(null);
		//T.add("a");
		
		System.out.println(T);
		
		for(int a=1;a<=5;a++)
		{
			for(int k=1;k<=a;k++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
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
			 
			System.out.println();
		}
		
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
		
		}

	}


