package aulas85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormatAula89 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");
		
		Calendar data =new GregorianCalendar(2010,2,20,14,32,25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		
		System.out.println(sdf.format(hoje));
		
		String minhaData ="20/02/2000";
		try {
			Date minhaDataEmDate =sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
