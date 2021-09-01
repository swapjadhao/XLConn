package Cursors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList Arr= new ArrayList();
		for(int i=0;i<=10;i++)
		{
			Arr.add(i);
		}
		
		java.util.Iterator I= Arr.iterator();
		
		while(I.hasNext())
		{
		
			int evenNum= (int) I.next();
			if(evenNum%2==0)
			{
				System.out.println(evenNum);
			}
			else
			{
				I.remove();
			}
			
		}
		System.out.println(Arr);
		
		
		
		LinkedList L= new LinkedList();
		for(int i=0;i<=15;i++)
		{
			L.add("Swap "+i);
		}
		System.out.println(L);
		
		ListIterator LI= L.listIterator();
		while(LI.hasNext())
		{
			String NLI= (String) LI.next();
						
			if(NLI.equalsIgnoreCase("Swap 5"))
			{
				LI.remove();
			}
			
			else if(NLI.equalsIgnoreCase("Swap 1"))
			{
				LI.set("Update");
			}
		}
		System.out.println(L);
		
		
	}

}
