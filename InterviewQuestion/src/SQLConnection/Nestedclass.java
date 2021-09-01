package SQLConnection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Nestedclass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeSet T= new TreeSet();
		//T.add(null);
		/*
		 * T.add("A"); T.add("B"); T.add("a"); T.add("z"); T.add("T"); T.add(10);
		 */
			//System.out.println(T);
			
			ArrayList A= new ArrayList();
			A.add(12);
			A.add(12);
			A.add(13);
			A.add(17);
			A.add(16);
			A.add(16);
			A.add(16);
			A.add(16);
			
			Iterator i= A.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			Collections.reverse(A);
			System.out.println(A);
			Collections.sort(A);
			System.out.println(A);
		/*
		 * LinkedHashSet S= new LinkedHashSet(A); System.out.println("***"+S);
		 * //System.out.println(Collections.reverse(A); A.clear(); ArrayList F= new
		 * ArrayList(S); System.out.println("***"+F);
		 * 
		 * Object [] B= A.toArray();
		 * 
		 * for(Object J:B) {
		 * 
		 * System.out.println(J); }
		 * 
		 * System.out.println(Arrays.asList(B));
		 */
			
		
			
			
			

	}

}
