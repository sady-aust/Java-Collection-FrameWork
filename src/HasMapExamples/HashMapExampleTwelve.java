package HasMapExamples;
/*
 * How do you remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value?
 */
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExampleTwelve {

	public static void main(String[] arg){
		HashMap<String, String> map = new HashMap<>();
		
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");

		map.put("THREE","CCC");
		map.put("FOUR", "DDD");
		
		map.put("FIVE", "EEE");
		map.put("SIX", "FFF");
		
		System.out.println("------Before Removing---------------");
		for(Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		map.remove("TWO", "BBB");
		map.remove("FOUR", "DDD");
		
		System.out.println("-------After Removing--------------");
		for(Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
	}
}
