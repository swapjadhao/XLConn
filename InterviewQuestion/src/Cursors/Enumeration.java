package Cursors;
import java.util.*;

public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v= new Vector();
		for(int i=0;i<=10;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		
		java.util.Enumeration E= v.elements();
		while(E.hasMoreElements())
		{
			Integer I= (Integer) E.nextElement();
			if(I%2==0)
			{
				System.out.println(I);
			}
			
		}

	}

	
}
