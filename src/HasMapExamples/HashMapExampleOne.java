package HasMapExamples;
import java.util.HashMap;
/*
 * Insert into HashMap
 */
public class HashMapExampleOne {
	public static void main(String[] arg){
		//Creating hashMap with default Initial Capacity and load factor
		HashMap<String, Integer> map1 = new HashMap<>();
		
		//Creating Hashmap With 30 initial Capacity and Default load Factor
		HashMap<String, Integer> map2 = new HashMap<>(30);
		
		//Creating HashMap With 30 Initial Capacity and 0.5f Load factor
		HashMap<String, Integer> map3 = new HashMap<>(30,0.5f);
		
		//Creating HashMap by Copying another map
		HashMap<String, Integer> map4 = new HashMap<>(map1);
		
	}

}
