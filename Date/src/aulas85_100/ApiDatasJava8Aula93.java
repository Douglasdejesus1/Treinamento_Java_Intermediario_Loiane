package aulas85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ApiDatasJava8Aula93 {

	public static void main(String[] args) {

		// data dd MM yyyy ISO
		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		System.out.println(LocalDate.of(2019, 2, 1));
		System.out.println(LocalDate.parse("2022-06-25"));

		System.out.println(agora.plusDays(-31));
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfYear());
		System.out.println(LocalDate.parse("2024-06-25").isLeapYear());

		// hora formato ISO 06:02:47.104707800
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		System.out.println(LocalTime.of(7, 30));
		System.out.println(LocalTime.parse("20:18"));

		System.out.println(hAgora.plusHours(8));
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));

		System.out.println(hAgora.getHour());

		// Data completa data+hora ISO
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		System.out.println(agoraCompleto.plusYears(20));
		System.out.println(LocalDateTime.of(2009, 2, 16, 20, 25, 10));
		System.out.println("SP: "+LocalDateTime.parse("2017-04-14T20:25:10"));

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);

		/*
		 * Set<String> fusos = ZoneId.getAvailableZoneIds(); for(String f: fusos) {
		 * System.out.println(f);
		 */
		ZoneId ny = ZoneId.of("America/New_York");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2017-04-14T20:25:10"), ny);
		System.out.println("NY: "+zdt);
		//System.out.println(ZonedDateTime.parse("2017-04-14T20:25:10-04:00[America/New_York]"));
		ZoneOffset offset = ZoneOffset.of("+01:00");
		OffsetDateTime offsetdt=OffsetDateTime.of(agoraCompleto, offset);
		System.out.println("NY: "+offsetdt);
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), ny);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), ny));
		
	}

}
