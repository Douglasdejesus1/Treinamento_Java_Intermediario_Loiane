package aula75_84;

public class Aula78 {

	public static void main(String[] args) {

		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3= "Olá";
		String ola4= new String("Olá");
		
		System.out.println("ola equals ola2 = "+ola.equals(ola2));
		System.out.println("ola equals ola2 = "+ola.equalsIgnoreCase(ola2));//ignora diferencas de maiusculas e minuscuals
		System.out.println("ola equals ola3 = "+ola.equals(ola3));
		System.out.println("ola equals ola4 = "+ola.equals(ola4));
		System.out.println();
		
		System.out.println("ola == ola2 = "+(ola == ola2));
		System.out.println("ola == ola3 = "+(ola == ola3));
		System.out.println("ola == ola4 = "+(ola == ola4));
		System.out.println();
		
		String   banana = "abanana";
		String ana = "ana";
		String ban = "ban";
		System.out.println(banana.regionMatches(3, ana, 0, 3));
		System.out.println(banana.regionMatches(0, ban, 0, 3));
		//inicia no caracter(3);compara com(ana);comprarda desde com que caracter(0); até qual{tamanho}(3);
		System.out.println(banana.regionMatches(true,0, ban, 0, 3));
		//ignoreCase
		System.out.println();

		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban,1));
		System.out.println();
		
		String a = "a"; 
		String aMaiusculo = "A"; 
		String b = "b"; 
		String z = "z";
		System.out.println(a.compareTo(z));//retorna 0 se forem iguais na tabla assii
		System.out.println(a.compareTo(aMaiusculo));//retorna 0 se forem iguais na tabla assii
		
		
		
	}

}
