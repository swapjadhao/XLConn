package CollectionsProg;

import java.util.ArrayList;

import Cursors.Iterator;

public class TraverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>AL= new ArrayList<>();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(4);
		AL.add(5);
		
		System.out.println(AL);
		for(int num:AL)
		{
			System.out.println(num);
		}
	
		Object[]D= AL.toArray();
		for(int i=0;i<AL.size();i++)
		{
			System.out.println(D[i]);
		}
		
	}

}
