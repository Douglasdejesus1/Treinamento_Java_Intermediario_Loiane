package aulas85_100;

import java.util.Calendar;

public class Calendaer_87 {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); //singleton
		
		//System.out.println(hoje);
		int ano =hoje.get(Calendar.YEAR);
		int mes =hoje.get(Calendar.MONTH)+1;
		//System.out.println(hoje.get(Calendar.FEBRUARY));
		int dia =hoje.get(Calendar.DAY_OF_MONTH);
		//System.out.println(hoje.get(Calendar.HOUR));
		//System.out.println(hoje.get(Calendar.SECOND));
		System.out.printf("Hoje é %02d/%02d/%d", dia,mes,ano);
		
		//somar datas
		hoje.add(Calendar.DAY_OF_MONTH, -7);
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		System.out.println();
	}

}
