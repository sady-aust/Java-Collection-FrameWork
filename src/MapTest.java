import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	
	public static void main(String arg[]){
		
	/*	Map<String, String> map = new HashMap<>();
		map.put("Hello", "World");
		map.put("1", "SADY");
		map.put("2", "Taran");
		map.put("3", "abrar");
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		System.out.println(map.get("3"));
		System.out.println(map.remove("Hello"));
		System.out.println(map.values());
		System.out.println(map.size());*/
		
		
	/*	Map<String, String> map = new LinkedHashMap<>();
		map.put("3", "sady");
		map.put("2", "Taran");
		map.put("1", "ABrar");
		
		System.out.println(map.values());*/
		
		Map<String, String> map = new TreeMap<>();
		map.put("3", "sady");
		map.put("2", "Taran");
		map.put("1", "ABrar");
		
		//System.out.println(map.values());
		
		//Iteretor 
		int a[] = new int[5];
	   Set set = map.entrySet();
	   Iterator itr = set.iterator();
	   while(itr.hasNext()){
		   Map.Entry me =(Map.Entry) itr.next();
		   
		   System.out.print(me.getKey()+" : ");
		   System.out.println(me.getValue());
	   }
	   
		
	}
	
}
