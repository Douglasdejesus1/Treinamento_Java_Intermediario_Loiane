package aula75_84;

public class Aula82 {

	public static void main(String[] args) {

		/*String alfabeto = String.join(", ", "A","B","C","D");
		
		System.out.println(alfabeto);  
		
		String[] letras = alfabeto.split(", ");
		
		for(String letra: letras) {
			System.out.print(letra+" ");
		}*/
		
		
		
		String doArquivo ="1;Antônio;30;";
		
		String[] infos = doArquivo.split(";");
		for(String info: infos) {
			System.out.println(info);
		}
		Pessoa pessoa = new Pessoa(Integer.valueOf(infos[0]),infos[1],Integer.parseInt(infos[2]));
		System.out.println(pessoa);
	}

}
