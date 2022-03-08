package Consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerEXP {
	
	public static void main(String[] args) {
		Consumer<String> consum = t -> System.out.println(t);
		consum.accept("Hello World");
		
		
		Consumer<String> display = name -> System.out.println("Hello " +name);
		Stream<String> names = Stream.of("Nguyen", "Tran" , "Pham");
		names.forEach(display);
		
		
	}
}
