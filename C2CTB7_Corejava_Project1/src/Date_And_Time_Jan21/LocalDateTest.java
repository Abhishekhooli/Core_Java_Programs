package Date_And_Time_Jan21;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest {

	public static void main(String[] args) {
		
		LocalDate localDate =  LocalDate.now();
		System.out.println(localDate);
		 
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate1 = LocalDate.now(clock);
		System.out.println(localDate1);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		LocalDate localDate2 = LocalDate.now(zoneId);
		System.out.println(localDate2);
		
		System.out.println("---------------");
		
		LocalDate localDate3 = LocalDate.of(2022, 01, 28);
		System.out.println(localDate3);
		
		LocalDate localDate4 = LocalDate.parse("2022-05-06");
		System.out.println(localDate4);
		
		LocalDate localDate5 = localDate4.plusDays(2);
		System.out.println(localDate5);
	}

}
