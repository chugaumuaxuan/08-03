package LambdaEXP;

public interface Printable {
	public void Print();
	
	default void Display() {
		System.out.println("Display");
	}
}

