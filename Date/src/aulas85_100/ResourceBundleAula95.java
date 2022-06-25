package aulas85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleAula95 {

	public static void main(String[] args) {

		System.out.println("Locale Atual: "+Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Ola "+rb.getString("hello"));
		System.out.println("Ola "+rb.getString("world"));
		Locale.setDefault(new Locale("en_BR", "en_BR"));
		System.out.println("Locale Atual: "+Locale.getDefault());
		ResourceBundle rb2 = ResourceBundle.getBundle("meu-texto_en_BR");
		System.out.println("Ola "+rb2.getString("hello"));
		System.out.println("Ola "+rb2.getString("world"));
	}

}
