package InterviewCode;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer no[]= {40,5,6,4,11,3,9,8,7};
		LargestNumber LN= new LargestNumber();
		LN.Method1();
		LN.Method2();
		LN.Method3();
		

		int min = no[0];
		
		Arrays.sort(no);
		System.out.println(no[0]);
		
		for(int a=0;a<no.length;a++)
		{
			if(no[a]<min)
			{
				min=no[a];
			}
			
		}
		System.out.println(min);
		
		List<Integer>L= Arrays.asList(no);
		Collections.sort(L);
		System.out.println(L.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	public void Method1()
	{
		int[] Nums= {1,2,3,4,5,6,7,8,9};
		int L= Nums.length-1;
		
		Arrays.sort(Nums);
		System.out.println(Nums[L]);
	}
	
	public void Method2()
	{
		int[] Nums= {9,5,6,3,1,4,7,8,2};
		
		int Max=Nums[0];
		
		for(int a=1;a<Nums.length;a++)
		{
			if(Nums[a]>Max)
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
		int D= Nums.length-1;
		
		Collections.sort(L);
		System.out.println(L.get(D));
		
	}

}
 
