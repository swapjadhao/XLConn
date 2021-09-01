
public class largestMobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a[]= {11,178,25,6,0,5,4}; int max = a[0];
		 * 
		 * for(int k=0;k<a.length;k++) { if(a[k]> max) { max= a[k]; }
		 * 
		 * } System.out.println(max);
		 */
		
		int b[]= {11,178,255,6,0,5,4};
		int max1=b[0];
		
		for(int j=0;j<b.length;j++)
		{
			if(b[j]>max1)
			{
				max1=b[j];
			}
		}
		System.out.println(max1);
		
	}

}
