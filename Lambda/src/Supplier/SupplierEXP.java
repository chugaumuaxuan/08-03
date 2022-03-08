package Supplier;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEXP {

	public static void main(String[] args) {
		
		Supplier<LocalDateTime> supllier =() ->  LocalDateTime.now();
			
		System.out.println(supllier.get());
		
		Supplier<List<Product>> productSupplier = () -> {
			List<Product> productList = new ArrayList<Product>();
			productList.add(new Product(1, "Laptop", 20000));
			productList.add(new Product(2, "Mobile", 30000));
			productList.add(new Product(3, "PC", 40000));
			return productList;
		};
		
		System.out.println(productSupplier.get());
		
		
	}
	

}
