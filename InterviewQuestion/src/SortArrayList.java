import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> IntList= new ArrayList<Integer>(Arrays.asList(1,5,9,8,6,5,6,9,5,8,7,4,5,8,4,3,4,7,5));
Collections.sort(IntList);


System.out.println(IntList);
IntList.removeAll(Collections.singleton('5'));
System.out.println(IntList);
ArrayList<Integer>NewList= new ArrayList<Integer>(Arrays.asList(1,2,5,4,7,8));
Collections.sort(NewList);
System.out.println(NewList);
	}

}


