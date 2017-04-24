package HasMapExamples;

import java.util.HashMap;
import java.util.Set;

/*
 * retrieve all keys present in a HashMap
 * keySet() method
 */
public class HashMapExampleEight {

	public static void main(String[] arg){
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EE");
		
		
        Set<Integer> keys =map.keySet();
        for(Integer i : keys){
        	System.out.println(i);
        }
	}
	
}
