package HasMapExamples;
/*
 * How do you replace a value associated with the given key if and only if it is currently mapped to given value?
 */
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample14 {
	
	public static void main(String[] arg){
		HashMap<String, String> map = new HashMap<>();
		
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");

		map.put("THREE","CCC");
		map.put("FOUR", "DDD");
		
		map.put("FIVE", "EEE");
		map.put("SIX", "FFF");
		
		System.out.println("-------BEfore Replacing----------------");
		for(Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	 //  Replacing "FOUR","DDD" to "FOUR","444"
		
		map.replace("FOUR", "DDD", "444");
		
		System.out.println("-----------After Replacing----------------");
		
		for(Entry<String,String> entry : map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
