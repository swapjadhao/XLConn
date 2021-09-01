package PatternPrac;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String Data="Swapnil Jadhao mm j l j";
		char[]ch=Data.toCharArray();
		Set<Character> ch1= new HashSet<>();
		
		for(char F:ch)
		{
			if(ch1.add(F)==false)
			{
				System.out.println(F);
			}
		}
	}

}
