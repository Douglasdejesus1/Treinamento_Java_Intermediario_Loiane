package aula98;

import java.math.BigDecimal;

public class BigDecimaBidNumber {

	public static void main(String[] args) {

		double a = 0.0300;
		double b = 0.04;
		double c =b-a;
		System.out.println(c);
		
		BigDecimal _a = new BigDecimal("0.03");
		BigDecimal _b = new BigDecimal("0.04");
		
		BigDecimal _c= _b.subtract(_a);
		System.out.println(_c);
		
		BigDecimal bd1 = new BigDecimal("12345567890.0987654321");
		BigDecimal bd2 = new BigDecimal("92345567890.0987654321");
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.multiply(bd2));
		
	}

}
