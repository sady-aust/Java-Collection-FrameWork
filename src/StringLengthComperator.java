import java.util.Comparator;

public class StringLengthComperator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length()>o2.length()){
			return 1;
		}
		if(o1.length()<o2.length()){
			return -1;
		}
		return 0;
	}

}
