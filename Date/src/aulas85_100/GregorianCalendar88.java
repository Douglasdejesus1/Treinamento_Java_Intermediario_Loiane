package aulas85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendar88 {

	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		//System.out.println(hoje1);
		imprimirData(hoje);
	}
	private static void imprimirData(GregorianCalendar hoje) {
		int ano =hoje.get(Calendar.YEAR);
		int mes =hoje.get(Calendar.MONTH)+1;
		//System.out.println(hoje.get(Calendar.FEBRUARY));
		int dia =hoje.get(Calendar.DAY_OF_MONTH);
		//System.out.println(hoje.get(Calendar.HOUR));
		//System.out.println(hoje.get(Calendar.SECOND));
		System.out.printf("Hoje é %02d/%02d/%d", dia,mes,ano);
	}
}
