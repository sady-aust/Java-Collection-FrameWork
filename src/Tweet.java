import java.time.LocalDateTime;

public class Tweet {
	private String name;
	private String text;
	private LocalDateTime localDateTime;
	
	
	public Tweet(String name, String tweet) {
		this.name = name;
		this.text = tweet;
		this.localDateTime = localDateTime.now();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTweet() {
		return text;
	}


	public void setTweet(String tweet) {
		this.text = tweet;
	}


	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}


	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return text+" "+"by "+ name+" on "+localDateTime.toString();
	}
	
	
	
	
	

}
