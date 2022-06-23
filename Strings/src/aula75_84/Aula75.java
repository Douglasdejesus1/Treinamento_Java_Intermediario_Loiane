package aula75_84;

public class Aula75 {

	public static void main(String[] args) {

		/*String vazia = new String(); //""
		System.out.println(vazia);
		
		String java = new String("Java");
		System.out.println(java);
		
		String java1 = new String(java);
		System.out.println(java1);
		
		char[] charsJava= {'J','a','v','a'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		char[] abcdef = {'A','B','C','D','E','F'};
		String abc = new String(abcdef,0,2);
		System.out.println(abc);
		
		byte[] ascii = {12,66,67,68,69};
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		String bcd = new String(ascii,0,2);
		System.out.println(bcd);
		String java3= "JAVA";
		String java4= "JAVgA";
		System.out.println(java3);
		System.out.println(java4);*/
		
		String curso = "Curso ";
		String java = "Java";
		String cursoJava = curso+java;
		System.out.println(cursoJava);
		
		String resultado2Com2 = "Resultado 2+2 = "+(2+2);
		System.out.println(resultado2Com2);
		
		String resultado2Com_2 = +2+2+"Resultado 2+2 = ";
		System.out.println(resultado2Com_2);
		
		String um = String.valueOf(1);
		System.out.println(um);
		String contatenacao = "It is a long established fact that a reader will be distracted by "
		+"the readable content of a page when looking at its layout. The point of using Lorem Ipsum "
		+"is that it has a more-or-less normal distribution of letters, as opposed to using "
		+"'Content here, content here', making it look like readable English. Many desktop publishing "
		+"packages and web page editors now use Lorem Ipsum as their default model text, and a "
		+"search for 'lorem ipsum' will uncover many web sites still in their infancy. "
		+"Various versions have evolved over the years, sometimes by accident, sometimes on purpose "
		+"(injected humour and the like)";
		String concatenacao2 ="It is a long established fact that a reader will be distracted by ";
		concatenacao2+="the readable content of a page when looking at its layout. The point of using Lorem Ipsum ";
		System.out.println(concatenacao2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
