package Date_And_Time_Jan21;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime currentTime1 = LocalTime.parse("08:36");
		System.out.println(currentTime1);

		LocalTime currentTime2 = LocalTime.of(9,45);
		System.out.println(currentTime2);
		
		boolean before = LocalTime.parse("09:20").isBefore(LocalTime.parse("09:45")); 
				System.out.println(before);
	}
}
				