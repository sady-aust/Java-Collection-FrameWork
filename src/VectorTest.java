import java.util.Vector;

public class VectorTest {

	public static void main(String[]  arg){
		Vector<Integer> vector = new Vector<>(3);
		//printing the vector capacity before crossing its capacity
		System.out.println(vector.capacity());
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		//printing the vector capacity after adding more than its capacity
		System.out.println(vector.capacity());
	}
}
