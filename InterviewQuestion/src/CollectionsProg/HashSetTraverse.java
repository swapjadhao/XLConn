package CollectionsProg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> HS= new HashSet<Object>();
		HS.add(2);
		HS.add("Test1");
		HS.add(null);
		HS.add("Test1");
		System.out.println(HS);
		
		for(Object A:HS)
		{
			System.out.println(A);
		}
		
		HashSet<String> HSS= new HashSet<String>();
		HSS.add("Test1");
		HSS.add("Test2");
		HSS.add("Test3");
		HSS.add("Test4");
		System.out.println(HSS);
		Iterator I=HSS.iterator();
		
		while(I.hasNext())
		{
			System.out.println(I.next());
		}

	}

}
