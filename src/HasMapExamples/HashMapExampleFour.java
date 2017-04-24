package HasMapExamples;
import java.util.HashMap;

/*
 * How do you retrieve a value associated with a given key from the HashMap?
 * Using get() method.
 */
public class HashMapExampleFour {
	
	public static void main(String[] arg){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three",3);
		//Retrieving a value associated with key 'Three'
		System.out.println(map.get("Three"));
		
	}

}
