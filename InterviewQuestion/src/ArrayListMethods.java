import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> List1= new ArrayList<String>(Arrays.asList("Java","C#","PHP","Java"));
		//ArrayList<String> List2= new ArrayList<String>();
		//List2.add("Dev");
	//	List2.add("QA");
		
		/*
		 * List1.addAll(List2); System.out.println(List1); List2.addAll(List1);
		 * System.out.println(List2);
		 */
//System.out.println(List1.remove("C#"));
//System.out.println(List1.remove("PHP"));
//System.out.println(List1);

ArrayList<Integer> Num= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,9,8,5,6,5,4,1,2,3,6,4,4,5,1,2,5,6,3,2,1,4,5,2,2));
Num.retainAll(Collections.singleton(1));
List1.retainAll(Collections.singleton("Java"));
System.out.println("***"+List1);
System.out.println("***"+Num.size());



Num.retainAll(Collections.singleton(2));

////////////////////////////

		/*
		 * ArrayList A= new ArrayList(); A.add("S"); A.add("22"); A.add("S");
		 * A.add(null); System.out.println(A); A.remove(2); System.out.println(A);
		 * A.add(2, "J"); System.out.println(A);
		 * 
		 * 
		 * 
		 * 
		 * ArrayList L= new ArrayList(Arrays.asList(25,25,36,5,5,7)); ArrayList<String>
		 * List1= new ArrayList<String>(Arrays.asList("Java","C#","PHP","Java"));
		 * L.add(11); for(int i=0;i<L.size();i++) { System.out.println(L.get(i)); }
		 */

	}

}
