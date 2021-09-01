package CollectionsProg;

import java.util.ArrayList;

public class ArrayListToArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList AL= new ArrayList();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(4);
		AL.add(5);
		
		System.out.println(AL);
		
		int [] arr= new int[AL.size()];
		
		for(int i=0;i<AL.size();i++)
		{
			arr[i]=(int) AL.get(i);
		}
		System.out.println(arr);
for(int f:arr)
{
	System.out.println(f);
}

System.out.println("/////////////////////////////////////////////////");

ArrayList<String> ALS= new ArrayList<String>();
ALS.add("Test1");
ALS.add("Test2");
ALS.add("Test3");
ALS.add("Test4");
ALS.add("Test5");
System.out.println(ALS);

		for(String S:ALS)
		{
			System.out.println(S);
		}
		
	//	String []ALSarr=(String[]) ALS.toArray();
		
		String []ALSarr=ALS.toArray(new String[ALS.size()]);
		for(String N:ALSarr)
		{
			System.out.println(N);
		}

	}

}
