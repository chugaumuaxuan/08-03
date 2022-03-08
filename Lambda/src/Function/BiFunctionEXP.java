package Function;

import java.util.function.BiFunction;

public class BiFunctionEXP{
	
	public static void main(String[] args) {
		BiFunction<String , String , String> bi = (name, subject) -> name + subject;			
		String s = bi.apply("Nguyen ", "Math");
		System.out.println(s);	
	}
}
