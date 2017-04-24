package HasMapExamples;
/*
 * By using put() and putAll() methods. put() method adds key-value pair one by one where as putAll() method 
 * copies all key-value pairs from one HashMap to another HashMap.
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapExampleTwo {
	
	public static void main(String[] arg){
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
		
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		System.out.println("---------------------------");
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("Six", 6);
		map1.put("Seven", 7);
		map1.putAll(map);
		
		for(Map.Entry<String, Integer> entry: map1.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
	

}
