import java.awt.List;
import java.util.ArrayList;

public class TweetImple implements Tweeter {
	
	//private List<Tweet> list = new ArrayList();
	private ArrayList<Tweet> list = new ArrayList<>();

	@Override
	public void addTweet(Tweet tweet) {
		// TODO Auto-generated method stub
		list.add(tweet);
		
		
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
        for (Tweet tweet : list) {
			System.out.println(tweet);
		}
	}
	
	public static void main(String args[]){
		Tweet tweet = new Tweet("SADY", "HELLO This is SADY");
		Tweet tweet1 = new Tweet("Abrar", "HELLO This is ABrar");
		Tweet tweet2 = new Tweet("TAran", "HELLO This is Taran");
		TweetImple ob = new TweetImple();
		ob.addTweet(tweet);
		ob.addTweet(tweet1);
		ob.addTweet(tweet2);
		ob.printAll();
		
		
	}

}
