package HasMapExamples;

import java.util.Collection;

import java.util.HashMap;

public class HashMapExampleNine {
	public static void main(String[] arg){
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EE");
		
		Collection<String> values = map.values();
		
		for(String s : values){
			System.out.println(s);
		}
		
	}

}
