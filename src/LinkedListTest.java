import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[]  arg){
		/*LinkedList<String> list =  new LinkedList<>();
		list.add("Sady");
		list.add("Abrar");
		list.add("Taran");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
		LinkedList<Book> list = new LinkedList<>();
		Book b1 = new Book("1","Introduction to java", "Sady", "ABdul", 5);
		Book b2 = new Book("2","Introduction to C", "Abrar", "ABdul", 5);
		Book b3 = new Book("3","Introduction to C++", "Sady", "ABdul", 5);
		list.add(b1);
		list.add(b2);
		list.add(b3);
	/*	for (Book book : list) {
			System.out.println("Book Id : "+book.id);
			System.out.println("Book Name : "+book.name);
			System.out.println("Book Author : "+book.author);
			System.out.println("Book Publisher : "+book.publisher);
			System.out.println("Book Quantity : "+book.quantity);
			
			System.out.println();
			
			
		}*/
		Iterator<Book> iterator = list.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println("Book Id : "+book.id);
			System.out.println("Book Name : "+book.name);
			System.out.println("Book Author : "+book.author);
			System.out.println("Book Publisher : "+book.publisher);
			System.out.println("Book Quantity : "+book.quantity);
			
			System.out.println();
		}
	}
}
