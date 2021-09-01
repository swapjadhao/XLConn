import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	
	    public static void main(String[] args) {      
	          
	    	int [] arr ={1, 2, 3, 4, 2, 7, 8, 8,8,8,8, 3};   
	    	
	    	
	    	for(int i=0;i<arr.length-1;i++)
	    	{
	    		for(int k=i+2;k<arr.length;k++)
	    		{
	    			if(arr[i]==arr[k] && i!=k)
	    			{
	    				System.out.println(arr[i]);
	    			}
	    		}
	    	}
	          
	    	System.out.println("*********************");
	    	int [] Data = {9,8,5,8,5,9,6,4,7,5,8,9,6,3,2};
	    	
	    	Set<Integer> S= new HashSet<>();
	    	
	    	for(int no:Data)
	    	{
	    		if(S.add(no)==false)
	    		{
	    			System.out.println(no);
	    		}
	    	}
	    	
	    	  
	    	System.out.println("*********************");
	    	
	    	
	    	int [] B= {1,5,2,4,1,25,5,4,7,8,2,1};
	    	
	    	
	    	Set<Integer> S1= new HashSet<>();
	    	
	    	for(int G:B)
	    	{
	    		if(S1.add(G)==false)
	    		{
	    		System.out.println(G);	
	    		}
	    	}
	    	
	    	int [] arr1 ={1, 2, 3, 4, 2, 7, 8, 8,8,8,8, 3};
	    	for(int i=0;i<arr1.length;i++)
	    	{
	    	for(int k=i+2;i<arr1.length;i++)	
	    	{
	    		if(arr1[i]==arr1[k] && i!=k)
	    		{
	    			
	    		}
	    	}
	    	}
	    	
	    	
	    	
	    	
	    }
}