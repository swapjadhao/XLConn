package Pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> AL= new ArrayList<>();
		AL.add(10);
		AL.add(10);
		AL.add(10);
		AL.add(10);
		AL.add(3);
		AL.add(5);
		Collections.reverse(AL);
		Collections.sort(AL);
		Comparator cmp= Collections.reverseOrder();
		Collections.sort(AL,cmp);
		System.out.println(AL);
		for(int A:AL)
		{
			System.out.println(A);
		}
		
		LinkedHashSet<Integer>LH= new LinkedHashSet<>(AL);
		System.out.println(LH);
		ArrayList <Integer> AL1= new ArrayList<>(LH);
		System.out.println(AL1);
		
		String input = "Geeks for Geeks";
		StringBuilder IP= new StringBuilder();
		IP.append(input);
		IP.reverse();
		System.out.println(IP);
		
		
		
		
		

	}

}
