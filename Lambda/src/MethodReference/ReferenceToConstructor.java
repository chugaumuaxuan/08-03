package MethodReference;

@FunctionalInterface
interface myInterface1{
	Hello display(String s);
}

class Hello{
	public Hello(String s) {
		System.out.println(s);
	}
}

public class ReferenceToConstructor {
	
	public static void main(String[] args) {
		myInterface1 m = Hello::new;
		m.display("Hello");
		
	}
}
