package CollectionsProg;

import java.util.ArrayList;

public class ContainsProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> AL= new ArrayList<Object>();
		AL.add(1);
		AL.add("Test1");
		AL.add(3);
		AL.add(null);
		AL.add(5);
		
		if(AL.contains("Test3"))
		{
			System.out.println("Array List have 3 ");
		}
		else
		{
			System.out.println("Given number not present");
		}

	}

}
