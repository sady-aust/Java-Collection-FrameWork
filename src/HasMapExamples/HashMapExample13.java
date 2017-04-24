package HasMapExamples;
/*
 * How do you replace a value associated with a given key in the HashMap?
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapExample13 {
	public static void main(String[] arg){
		HashMap<String, String> map = new HashMap<>();
		
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");

		map.put("THREE","CCC");
		map.put("FOUR", "DDD");
		
		map.put("FIVE", "EEE");
		map.put("SIX", "FFF");
		
		System.out.println("-----Before Replacing----------");
		
		for(Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		map.replace("THREE", "SADY");
		
		System.out.println("----------After Replacing----------");
		
		for(Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
		

}
