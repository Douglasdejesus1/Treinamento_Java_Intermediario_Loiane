package aula65;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "https://www.linkedin.com/in/douglas-de-jesus-ads/";
	
	String site() default "https://github.com/Douglasdejesus1";

}
