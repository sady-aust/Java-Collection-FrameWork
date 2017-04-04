import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {
	
	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> list = new ArrayList<>();
	System.out.println("List size "+list.size());
	
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	list.add("F");
	list.add("G");
	list.add("H");
	list.add("I");
	list.add("J");

	/*System.out.println("List size after adding "+list.size());
	list.remove(9);
	System.out.println("List size after removing "+list.size());		
	
	System.out.println("List contain "+list.contains(9));
	System.out.println(list);*/
	
	Iterator itr = list.iterator();
/*	while(itr.hasNext()){
		if(itr.next() == "B"){
			itr.remove();
		}
	}
	System.out.println(list);*/
	for (String string : list) {
		System.out.println(string);
		

	}

	}
}

