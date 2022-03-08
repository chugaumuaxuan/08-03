package BinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorEXP {

	public static void main(String[] args) {
		
		BinaryOperator<String> bin = (FirstName, LastName) -> FirstName + " " + LastName;
		
		String s = bin.apply("Doan", "Thang");
		
		System.out.println(s);
	
	}
}
