package HasMapExamples;

import java.util.HashMap;

/*
 * Check Whether a perticular value/key exist in the map
 * 
 */
public class HashMapExampleFive {

	public static void main(String[] arg){
		HashMap<String, Integer> map = new  HashMap<>();
		map.put("Sady", 52000);
		map.put("Shuvo", 54000);
		map.put("Karim", 56000);
		
		System.out.println(map.containsKey("Shuvo")); //true
		System.out.println(map.containsValue(56000)); //true
		
		
	}
}
