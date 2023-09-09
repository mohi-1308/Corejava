package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Date
		LocalDate Today = LocalDate.now();
		System.out.println("Current Date="+Today);
		
		LocalDate firstDate_2023 = LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDate_2023);
		
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);
		
		//Time
		LocalTime time = LocalTime.now();
		System.out.println("Current time="+time);
		
		LocalTime SpecificTime= LocalTime.of(12,20,25,40);
		System.out.println("Specific time of Day="+SpecificTime);
		
		
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST="+timeKolkata);
		
		//DateTime
		LocalDateTime Today1 = LocalDateTime.now();
		System.out.println("Current DateTime="+Today1);
		
		LocalDateTime specificDate = LocalDateTime.of(2023, Month.JANUARY, 1, 10, 10);
		System.out.println("Specific Date="+specificDate);
		
		LocalDateTime todayKolkata1 = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata1);
		
		
		
		
	}

}
