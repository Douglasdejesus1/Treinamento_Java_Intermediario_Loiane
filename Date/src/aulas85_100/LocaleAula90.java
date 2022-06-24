package aulas85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleAula90 {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();
		System.out.println(locale);
		Locale[]locales=Locale.getAvailableLocales();
		
		
		System.out.println(locale);
		System.out.println(locales);
		for(Locale loc: locales) {
			System.out.println("Nome: "+loc.getDisplayName());
			System.out.println("Código: "+loc.getLanguage());
			System.out.println("*********");
		}
		Locale br = new Locale("pt","Brazil");
		System.out.println(br);
		Locale.setDefault(br);
		System.out.println(Locale.getDefault());
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(500000000000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(500000000000000d));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(500000000000000d));
	}

}
