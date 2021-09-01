
public class lowestMobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]= {5,6,7,10,5,6};
		int low =n[0];
		
		for(int j=0;j<n.length;j++)
		{
			if(n[j]<low)
			{
				low=n[j];
			}
		}
		System.out.println(low);

	}

}
