import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException; import java.text.SimpleDateFormat; import java.util.*;

public class JavaDateAndTime {
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int month = sc.nextInt();
	      int day = sc.nextInt();
	       int year = sc.nextInt();
	      //  String dateString = year+"-"+month+"-"+day;
	        
	   //     String dateString = String.format("%d-%d-%d",year,month,day);
	      LocalDate date = LocalDate.of(year, month, day);
	        System.out.println(date.getDayOfWeek());
		
		
		//area(a, b);
	    
     
	}
}
