package MethodReference;

@FunctionalInterface
interface ExecuteFunction{
	public int Execute(int a, int b);
}

public class ReferenceToStaticMethod {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int minus(int a, int b) {
		return a - b;
	}
	
	public static int doAction(int a, int b, ExecuteFunction f) {
		return f.Execute(a, b);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		
		int sum = doAction(a, b , ReferenceToStaticMethod::sum );
		System.out.println(a + " + " + b + " = " + sum  );
		
		int minus = doAction(a, b, ReferenceToStaticMethod::minus);
		System.out.println(a + " - " + b + " = " + minus );
	}
	
}


