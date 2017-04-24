package HasMapExamples;

import java.util.HashMap;

/*
 * How to clear a Hash Map for reuse
 * clear() method
 */
public class HashMapExampleSeven {
	public static void main(String[] arg){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Sady", 25);
		map.put("ABul", 30);
		map.put("Karib", 35);
		
		System.out.println(map.size());
        
		map.clear();
		System.out.println(map.size());
	
	}

}
