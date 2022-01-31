package Date_And_Time_Jan21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeandDate {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.println(localDateTime1);
		
		LocalDateTime localDateTime2 = LocalDateTime.parse("2022-01-02T21:42:51" );
		System.out.println(localDateTime2);
	}

}
