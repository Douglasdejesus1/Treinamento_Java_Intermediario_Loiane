package aula75_84;

public class Aula80 {

	public static void main(String[] args) {

		String teste = "Isso � um teste.";
		System.out.println(teste);
		System.out.println(teste.substring(10, 15));
		
		String ola = "ol� ";
		String mundo = "mundo";
		String olaMundo = ola.concat(teste);
		System.out.println(ola);
		System.out.println(olaMundo);
		
		String espacos = "i s p a � o";
		System.out.println(espacos);
		String semEspacos = espacos.replace('i', 'e');
		semEspacos = semEspacos.replaceAll(" ", "");
		//regex
		System.out.println(semEspacos);
	
		String nome = " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim());
		
		//web services
		//XML
	}
	

}
