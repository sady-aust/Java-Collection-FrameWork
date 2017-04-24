package HasMapExamples;
import java.util.HashMap;
import java.util.Map;

/*
 * Using putIfAbsentmethod();
 */
public class HashMapExampleThree {
	public static void main(String[] arg){
		HashMap< String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		//Adds key-value pair 'ONE-111' only if it is not present in map
		map.putIfAbsent("One", 111);
		 //Adds key-value pair 'Four-4' only if it is not present in map
		map.putIfAbsent("Four", 4);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
