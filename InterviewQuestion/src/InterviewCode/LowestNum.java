package InterviewCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LowestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LowestNum LN= new LowestNum();
		LN.Method1();
		LN.Method2();
		LN.Method3();

	}
	
	public void Method1()
	{
		int[] Nums= {1,2,3,4,5,6,7,8,9};
		
		Arrays.sort(Nums);
		System.out.println(Nums[0]);
	}
	
	public void Method2()
	{
		int[] Nums= {9,5,6,3,1,4,7,8,2};
		
		int Max=Nums[0];
		
		for(int a=1;a<Nums.length;a++)
		{
			if(Nums[a]<Max)
			{
				Max=Nums[a];
			}
		}
		System.out.println(Max);
		
	}
	
	public void Method3()
	{
	Integer[] Nums= {9,5,6,3,1,4,7,8,2};
		
		List<Integer> L=Arrays.asList(Nums);
		
		Collections.sort(L);
		System.out.println(L.get(0));
		
	}

}
 