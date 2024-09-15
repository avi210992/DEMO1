package package3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatePrac1 {

	public static void main(String[] args) {
		
		
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ltd = LocalDateTime.now();
		
		System.out.println(ld);System.out.println(lt);System.out.println(ltd);
		
	}
}
