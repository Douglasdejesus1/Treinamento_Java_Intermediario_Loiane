package a58;

public class Autoboxing {

	public static void main(String[] args) {
		
	

		//autoboxing
		
		Short num7= 1;
		System.out.println(num7);
		
		Byte num8 = 10;
		System.out.println(num8);
		Integer num9 = 100;
		
		Long num10 = 1000l;
		Float num11= 3.5f;
		Double num12 = 3.555;
		Boolean flag2 = true;
		Character b1= 'b';
		System.out.println();
		//auto un-boxing
		int num13 =num9;
		System.out.println(num13);
		//o auto un-boxing é o mesmo que:
		int num14=num9.intValue();
		
		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		Integer num15 = num13/num9;
		//mau uso
		Double a,b,c;
		a=10.0;
		b=12.2;
		c=4.7;
		Double media=(a+b+c)/3;
		System.out.println(media);
	}

}
