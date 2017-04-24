package HasMapExamples;

import java.util.HashMap;

/*
 *  find out the number of key-value mappings present in a HashMap
 *  
 *  using size() method
 */
public class HashMapExampleSix {
	
	public static void main(String[] arg){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 23000);
		map.put("B", 36000);
		map.put("C", 56000);
		
		System.out.println(map.size());
	
	}

}
