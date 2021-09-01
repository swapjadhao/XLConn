import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Data= "Today is Thursaaaaday";
		
		char[] CharArr=Data.toCharArray();
		
		Map<Character,Integer>CharMap= new HashMap<Character, Integer>();
		for(Character Ch:CharArr)
		{
			if(CharMap.containsKey(Ch))
			{
				CharMap.put(Ch, CharMap.get(Ch));
				System.out.println(Ch);
			}
			else
			{
				CharMap.put(Ch, 1);
			//	System.out.println("***********");
				//System.out.println(Ch);
			}
		}
	

	}

}
