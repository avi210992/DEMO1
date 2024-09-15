package package3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date1 {
	
	public static void main(String[] args) {

		  LocalDateTime localDate = LocalDateTime.now();
	      DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("MM_dd_YYYY_hh:mm:ss");
	      String time = dateformatter.format(localDate);
		  
		 System.out.println(time);
	}

}
