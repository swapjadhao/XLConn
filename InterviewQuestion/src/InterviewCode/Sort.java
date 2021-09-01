package InterviewCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] Data = { 32, 23, 45, 87, 92, 31, 19 };
		Sort D= new Sort();
		D.AscendingOrder(Data);
		D.DescendingOrder(Data);
	
		

	}

	private void DescendingOrder(Integer[] data) {
		// TODO Auto-generated method stub
		
		Arrays.sort(data,Collections.reverseOrder());
		System.out.println(Arrays.toString(data));
		
	}

	private void AscendingOrder(Integer[] data) {
		// TODO Auto-generated method stub
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
	}
	
	

}