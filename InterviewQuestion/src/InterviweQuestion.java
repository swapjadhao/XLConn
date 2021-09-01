import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class InterviweQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write Get Window Handles Code
		/*
		 * WebDriver driver= null; String Parent= driver.getWindowHandle(); Set<String>
		 * AllWindows=driver.getWindowHandles();
		 * 
		 * for(String Child:AllWindows) { if(!Parent.equalsIgnoreCase(Child)) {
		 * driver.switchTo().window(Child); }
		 * 
		 * }
		 */

		// Sorting on number
		Integer[] Arr = { 5, 6, 9, 8, 2, 3, 7, 1, 5 };
		Arrays.sort(Arr);
		System.out.println(Arrays.toString(Arr));

		Arrays.sort(Arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(Arr));

		// Duplicate Char from String

		String Data = "Todays is Tuesday";
		char[] Char = Data.toCharArray();

		Set<Character> Word = new HashSet<>();

		for (char S : Char) {
			//String H = Character.toString(S);

			if (Word.add(S) == false) {
				System.out.print(" "+S+" ");
			}
		}
		System.out.println();
		
		
		
		String Data1 = "Todays is Tuesday";
		char[] C= Data1.toCharArray();
		Set<Character> S= new HashSet();
		
		
		for(char d:C)
		{
			if(S.add(d)==false)
			{
				System.out.println(d);
			}
		}
		
		
		/*
		 * //Duplicate from Numbers
		 * 
		 * int[] NumArr= {9,5,4,6,4,7,8,9,1,2,3};
		 * 
		 * Set<Integer> S= new HashSet<>();
		 * 
		 * for(int m:NumArr) { if(S.add(m)==false) { System.out.print(" "+m+" "); } }
		 * 
		 * Map<Integer,Integer> M= new HashMap<Integer,Integer>(); for(int no:NumArr) {
		 * Integer Count= M.get(no); if(Count==null) { M.put(no, 1); } else { Count =
		 * Count+1; M.put(no, Count); } System.out.println(M); }
		 * 
		 * int Num= 738463946; int[]no=Num.
		 */
		
		
		
	}

}
