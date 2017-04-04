import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 
 */
public class PriorityQueueExample2 {
 
	public static void main(String[] arg){
		Comparator<String> comparator = new StringLengthComperator();
		
		PriorityQueue<String> queue = new PriorityQueue<>(10,comparator);
		
		queue.add("Sady");
		queue.add("Abrar");
		queue.add("Taranfdf");
		
		while (queue.size()!=0) {
			System.out.println(queue.poll());
		}
		
	}
	
   
}
