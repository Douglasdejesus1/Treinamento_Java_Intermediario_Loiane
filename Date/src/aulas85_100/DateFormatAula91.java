package aulas85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatAula91 {

	public static void main(String[] args) {

		Date hoje = new Date();
		
		System.out.println(hoje);
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		//Locale.setDefault(new Locale("en","US"));
		
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		
		System.out.println(hojeFormatado);
		
		hojeFormatado =DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado =DateFormat.getDateTimeInstance(
				DateFormat.SHORT,DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		String data = "12/06/2020 18:00";
		try {
			Date dataDate =DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);
			System.out.println(calendario);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
