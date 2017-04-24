package HasMapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * retrieve all key-value pairs present in a HashMap
 * entrySet() method returns all key-value pairs present in a HashMap in the form of Set.
 */
public class HashMapExampleTen {
	
	public static void main(String[] arg){
		HashMap<String,String> map = new HashMap<>();
		map.put("One", "AAA");
		map.put("Two", "BBB");
		map.put("Three", "CCC");
		map.put("Four", "DDD");
		map.put("Five", "EEE");
		
		
      
		
		for(Map.Entry<String,String> entry : map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
