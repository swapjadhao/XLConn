import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Print1to100withotnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int one='A'/'A'; String Hun= ".........."; for(int
		 * i=one;i<=Hun.length()*Hun.length();i++) { System.out.println(i); }
		 */
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,5,6,4,7,8,5,4,6,5,4,7,8,9,6));
		LinkedHashSet nonDuplicate= new LinkedHashSet(numbers);
		
		System.out.println(nonDuplicate);
		
		//ASCII
		//a-97,b-98,c-99,d-100
		
		/*
		 * for(int j = one;j<='d';j++) { System.out.println(j); }
		 */
		
		ArrayList<Integer> A= new ArrayList<>(Arrays.asList(1,2,5,2,5,2,6,3,5,4,7,8,9,6));
		
		LinkedHashSet<Integer> L= new LinkedHashSet(A);
		System.out.println(L);
	}

}
