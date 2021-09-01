package CollectionsProg;

import org.apache.commons.collections4.map.HashedMap;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap HM= new HashMap();
	
		 // Declaring a HashMap of String keys and String values
	    HashedMap<String, String> hashmap = new HashedMap<String, String>();
	    // Adding key-value pairs to HashMap
	    hashmap.put("1", "Value1");
	    hashmap.put("2", "Value2");
	    hashmap.put("3", "Value3");
	    hashmap.put("4", "Value4");
	    hashmap.put("5", "Value5");
	    System.out.println(hashmap);
	   

	}

}
