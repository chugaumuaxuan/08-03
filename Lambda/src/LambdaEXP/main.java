package LambdaEXP;

public class main {
	
	static void PrintThing(Printable p) {
		p.Print();
	}
	
	
	public static void main(String[] args) {
		
		
		//cach1
		PrintThing(
			() -> System.out.println("Studying" )
			
		);
		
		//cach2
//		Printable lambdaPrintable = () -> System.out.println("Studying");
//		PrintThing(lambdaPrintable);
		
		
	}

}	
