import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * With Default comparetor
 * elements will in ascending order
 */
public class PriorityQueueExample1 {
	public static void main(String[] arg){
		//creating priority queue with default Comparetor
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		//Inserting Elements in pqueue
		pqueue.add(5);
		pqueue.add(4);
		pqueue.add(10);
		pqueue.add(8);
		pqueue.add(7);
		pqueue.add(7);
		pqueue.add(25);
		pqueue.add(20);
		pqueue.add(21);
		//Removing Elements from pqueue
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		
		
	}

}
