import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Integer> Numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,5,4,5,4,6,3,6,5,4,7,8,9,9,8,7));
	LinkedHashSet<Integer> NonDuplicate= new LinkedHashSet(Numbers);
	System.out.println(NonDuplicate);
	
	List<Integer> Num= Numbers.stream().distinct().collect(Collectors.toList());
System.out.println(Num);
		
	}

}

