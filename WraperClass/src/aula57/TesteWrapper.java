package aula57;

public class TesteWrapper {

	public static void main(String[] args) {

		//classes Whappers do java
		short num1= 1;
		byte num2= 10;
		int num3=100;
		long num4= 1000l;
		float num5=3.5f;
		double num6=3.55555;
		boolean flag=true;
		char a = 'a';
		
		Short num7= num1;
		System.out.println(num7);
		
		Byte num8 = new Byte((byte)12);
		System.out.println(num8);
		Integer num9 = new Integer(100);
		
		Long num10 = new Long((long)1000l);
		Float num11= new Float(3.5f);
		Double num12 = new Double(3.555);
		Boolean flag2 = new Boolean(true);
		Character b= new Character('b');
		Integer num18 = Integer.valueOf(1342);
		System.out.println(num18);
		double num17 = Double.parseDouble("3.55");
		System.out.println(num17);
	}
	

}
