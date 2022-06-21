package aula64;

public class Externa2 {
	public void metodoQualquer() {

		class ClasseLocal {
			private String texto = "texto classe local";
			private String texto2 = "e se tiver dois textos";

			public void imprimeTexto() {
				System.out.println(texto);
			}
			public void imprimeTexto2() {
				System.out.println(texto2);
			}
		}
		ClasseLocal local = new ClasseLocal();
		local.imprimeTexto();
		local.imprimeTexto2();
	}
	public static void main(String[] args) {
		Externa2 externa = new Externa2();
		externa.metodoQualquer();
	}

}
