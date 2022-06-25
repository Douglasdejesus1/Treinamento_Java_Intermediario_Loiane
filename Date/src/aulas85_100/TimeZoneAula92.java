package aulas85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneAula92 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		
		TimeZone tz=calendar.getTimeZone();
		
		System.out.println(tz);
	
		/*String [] fusos = TimeZone.getAvailableIDs();		
		for(String fuso:fusos) {
			System.out.println(fuso);
		}*/
		TimeZone tzSP = TimeZone.getTimeZone("America/New_York");
		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());
		
		Calendar agora =Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		System.out.println();
		
		Calendar agoraNY =Calendar.getInstance(tzSP);
		System.out.println(agoraNY.getTimeZone());
		System.out.println(sdf.format(agoraNY.getTime()));
		agoraNY.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(
				(System.currentTimeMillis()))/1000/60/60);
		System.out.println(sdf.format(agoraNY.getTime()));
		
	}

}
