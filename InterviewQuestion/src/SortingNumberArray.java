import java.util.Arrays;
import java.util.Collections;

public class SortingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Integer [] Arr= {5,9,8,6,5,3,2,1,0};
	
	Arrays.sort(Arr,Collections.reverseOrder());
	System.out.println(Arrays.toString(Arr));
	
	Arrays.sort(Arr);
	System.out.println(Arrays.toString(Arr));
		
	}

}
