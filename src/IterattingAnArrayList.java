import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterattingAnArrayList {
	public static void main(String[] arg){
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		
		//Iterating using for loop
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
		//Iterating using Iterator
	/*	  Iterator<String> iterator = arrayList.iterator();
		  
		 while(iterator.hasNext()){
			  System.out.println(iterator.next());
			  //Removing an Element from arraylist
			  
			  iterator.remove();
		  }
		  
		  //Using ListIterator
		   ListIterator<String> iterator2 = arrayList.listIterator();
		   while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}*/
		   
		   //Using for-Each loop
		   for (String element : arrayList) {
			System.out.println(element);
		}
	}

}
