import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueTest {

	public static void main(String arg[]){
		
		Queue queue = new LinkedList();
		
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		System.out.println(queue);
		
		try{
			queue.remove();
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
		
		System.out.println(queue);
		
		
	}
}
