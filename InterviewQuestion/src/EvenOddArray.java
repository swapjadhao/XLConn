
public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Even Number");
		
		for(int i=0;i<a.length;i++)
		if(a[i] % 2==0)
		{
			System.out.print(a[i]);
		}
		
		System.out.println();
		System.out.println("Odd Number");
		for(int k=0;k<a.length;k++)
			if(a[k] % 2 !=0)
			{
				System.out.print(a[k]);
			}
		
	}
}


