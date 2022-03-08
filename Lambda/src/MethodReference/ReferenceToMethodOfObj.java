package MethodReference;

interface myInterface2{
	public void Display();
}

public class ReferenceToMethodOfObj {
	
	public void myMethod() {
		System.out.println("This is instance method");
	}
	public static void main(String[] args) {
		
		ReferenceToMethodOfObj obj = new ReferenceToMethodOfObj();
		
		myInterface2 ref = obj::myMethod;
		ref.Display();
	}
	
}
