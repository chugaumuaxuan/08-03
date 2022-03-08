package UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorEXP {
	
	public static void main(String[] args) {
		UnaryOperator<String> unary = (name) -> name;
		String s = unary.apply("Thang");
		System.out.println(s);
	}
	
}
