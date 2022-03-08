package Consumer;

import java.util.function.BiConsumer;

public class BiConsumerEXP {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> biConsumer =(a, b) -> System.out.println(a + b);
		biConsumer.accept(10, 20);
		
		BiConsumer<Integer, Integer> biConsumer2 =(a, b) -> System.out.println(a - b);
		biConsumer2.accept(10, 20);
		
	}
}
