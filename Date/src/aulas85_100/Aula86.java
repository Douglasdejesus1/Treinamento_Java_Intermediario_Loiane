package aulas85_100;

import java.util.Date;

public class Aula86 {

	public static void main(String[] args) {

		Date hoje = new Date();
		//ja esta depreciado, logo perder� o suporte
		System.out.println(hoje);
		System.out.println("Milesegundos desde 1 Jan 1970: "+hoje.getTime());
		System.out.println("Dia do m�s: "+hoje.getDate());
		System.out.println("Dia da semana: "+hoje.getDay());
		System.out.println("Hora do dia: "+hoje.getHours());
		System.out.println("M�s menos 1: "+hoje.getMonth());
		System.out.println("Dia do m�s: "+hoje.getYear());
	}

}
