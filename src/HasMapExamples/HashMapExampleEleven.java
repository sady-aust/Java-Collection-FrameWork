package HasMapExamples;
/*
 * HashMap,
 * How to delete a Key froma  Hashmap
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExampleEleven {
	
	public static void main(String[] arg){
		HashMap<String, String> map  = new HashMap<>();
		
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");

		map.put("THREE","CCC");
		map.put("FOUR", "DDD");
		
		map.put("FIVE", "EEE");
		map.put("SIX", "FFF");
		
		System.out.println("-------Before Removing----------------");
		for(Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		map.remove("TWO");
		map.remove("FIVE");
		
		System.out.println("------After Deleting-------");
		for(Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
