package CreateFunctionalinterface;

@FunctionalInterface
interface FunctionalInterfaceEXP {
		public void display();
	}

public class FuctionalInterfaceDemo  {
	public static void main(String[] args) {
		
		//su dung lop vo danh
		FunctionalInterfaceEXP fucn1 = new FunctionalInterfaceEXP() {
			public void display() {
				System.out.println("Hello world");	
			}
		};
		fucn1.display();
		
		//su dung lambda
		FunctionalInterfaceEXP fucn2 = () -> {
			System.out.println("Xin chao Viet Nam");
		};
		fucn2.display();
		
	}

}
