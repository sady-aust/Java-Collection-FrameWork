import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
public static void main(String[] arg){
	
	HashMap<String, Double> map = new HashMap<>();
	
	//insert to the hash map
	
	map.put("Sady", 20.25);
	map.put("Taran", 22.22);
	map.put("Abrar", 24.26);
	map.put("Sourav", 26.28);
	map.put("Swanan", 28.30);
	map.put("Rupok", 30.32);
	

	/*
	 * Map can have one null key and multiple null value;
	 * 
	 */
	map.put(null, null);
	map.put("shahin", null);
	
	//print sizeof the map
	System.out.println("Size of the map "+map.size());
	
	
	//Displaying the elements of the set
	    Set set = map.keySet();
     System.out.println(set);
     System.out.println();
     //displaying the elements of the set uisng Iterator
     System.out.println("Print the elements using Iterator ");
     
     Iterator it = set.iterator();
     while(it.hasNext()){
    	 Object key = it.next();
    	 System.out.println(key+" "+map.get(key));
     }
     
     //Displaying the elements using forEachLoop
     System.out.println("Print the elements using foreach loop ");
     System.out.println();
     for(Map.Entry<String, Double> entry :map.entrySet()){
    	 System.out.println(entry.getKey()+" "+entry.getValue());
     }
     System.out.println();
     //Checking
     System.out.println("Does map contains Rupok as key ? "+map.containsKey("Rupok"));
     System.out.println("Does map contains 30.32 as value ? "+map.containsValue(30.32));
    System.out.println();
   
    //Removing a elemnts from the Map
    System.out.println("Value removed from the map "+map.remove("Rupok"));
	
}
}
