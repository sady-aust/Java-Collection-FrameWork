import java.util.Enumeration;
import java.util.Vector;

public class VectorTest2 {
public static void main(String[] arg){
	//creating vector with default capacity 10
	Vector<Integer> vector = new Vector<>();
	vector.add(5);
	vector.add(6);
	vector.add(7);
	vector.add(8);
	vector.add(9);
	System.out.println(vector.capacity());
	//print the size
	System.out.println(vector.size());
	//setting new size 10
	vector.setSize(10);
	System.out.println(vector.size());
	System.out.println(vector);
	//again change the size in three
	vector.setSize(3);
	System.out.println(vector);
	//getting Enumeration Object
	Enumeration<Integer> en = vector.elements(); //vector.object() returns an Enumeration object consisting of all elements of Vector.
	//Traversing vector using enumaration object
	while(en.hasMoreElements()){
		System.out.println(en.nextElement());
	}
	
	/*
	 * getting first and last element using firstElement() and lastElement() method
	 */
	
	System.out.println("First Element "+vector.firstElement());
	System.out.println("Last Element "+vector.lastElement());
	
}
}
