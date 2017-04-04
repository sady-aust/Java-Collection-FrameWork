import java.rmi.StubNotFoundException;
import java.util.Stack;

public class StackTest {
	
	public static void  main(String arg[]){
		Stack st = new Stack();
		
		st.push(5);
		st.push(6);
		st.push(4);
		st.push(9);
		st.push(10);
		
		/*try{
			st.pop();
		}catch(StackOverflowError e){
			System.out.println("no data");
		}
		
		System.out.println("Data "+st);*/
		System.out.println("Is Contain 10 "+st.search(10));
		System.out.println("Is Contain 6 "+st.search(6));
		
		
	}
	
	
}
