package Function;

import java.util.function.Function;

public class FunctionEXP {
	public static void main(String[] args) {
		
		Function<String, Integer> func = (t) -> t.length();
		int length = func.apply("Hello World");
		System.out.println(length);
		
	}


}
