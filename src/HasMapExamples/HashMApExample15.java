package HasMapExamples;
/*
 * How do you get synchronized HashMap in java?
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMApExample15 {

	public static void main(String[] arg){
		HashMap<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");

		map.put("THREE","CCC");
		map.put("FOUR", "DDD");
		
		map.put("FIVE", "EEE");
		map.put("SIX", "FFF");
		
		HashMap<String,String> syncHashMAp = (HashMap<String, String>) Collections.synchronizedMap(map);
		
		
	}
}
