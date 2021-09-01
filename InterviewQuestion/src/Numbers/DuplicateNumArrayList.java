package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> List= new ArrayList<Integer>(Arrays.asList(1,2,5,2,5,3,2,5,4,1,5,9,8,5,6));
		
	LinkedHashSet<Integer> Num= new LinkedHashSet<Integer>(List);
	ArrayList<Integer> A= new ArrayList<Integer>(Num);
	
	//A.removeAll(A);
	System.out.println(A);
	
	
	//ArrayList<String> List1= new ArrayList<String>(Arrays.asList("1","2","5","2","3","2",5,4,1,5,9,8,5,6));
	//System.out.print(Collections.sort(List));
	Integer [] Arr={9,6,5,7,8,4,2,3,6,5,1,2};
	
	Arrays.sort(Arr);
		System.out.println(Arrays.toString(Arr));
		
		Arrays.sort(Arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(Arr));
		
		
		String Data="My name is Swapnil";
		
		char[]Ch=Data.toCharArray();
		
		Set<Character> S= new HashSet<Character>();
		
		for(char c:Ch)
		{	
			if(S.add(c)==false)
			{
				System.out.println(c);
			}
		}
		
		
		
		int Num1=738546395;
		int rev=0;
		while(Num1!=0)
		{
			int no=Num1%10;
			rev=rev*10+no;
			Num1=Num1/10;
		}

	}

}
