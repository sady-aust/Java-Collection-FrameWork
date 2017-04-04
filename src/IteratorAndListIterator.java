/*
 * Difference between Iterator and  list Iterator
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class IteratorAndListIterator {

	public static void main(String[] arg){
		List<Object> listObject = new ArrayList<Object>();
		listObject.add("One");
		listObject.add("two");
		listObject.add("Three");
		
		Iterator iterator = listObject.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	     Queue queue = new PriorityQueue<>(listObject);
	    
	     
	     Iterator iterator2 = queue.iterator();
	     while(iterator2.hasNext()){
	    	 System.out.println(iterator2.next());
	     }
	     
	     Set set = new HashSet(listObject);
	     
	     Iterator iterator3 = set.iterator();
	     
	     while(iterator3.hasNext()){
	    	 System.out.println(iterator3.next());
	     }
	     
	     ListIterator listIterator = listObject.listIterator();
	     while (listIterator.hasNext()){
	    	 System.out.println(listIterator.next());
	     }
	     
	     /*
	      * we can use Iterator in list,queue,set 
	      * but we can use ListIterator in only List .Not in queue or set interface 
	      */
	    
	}
	
}
