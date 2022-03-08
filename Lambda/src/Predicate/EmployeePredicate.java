package Predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
	
	public static Predicate isAdultMale() {
	      return p -> ((Employee) p).getAge() > 21 && ((Employee) p).getGender().equalsIgnoreCase("M");
	   }
	
	   public static Predicate isAdultFemale() {
	      return p -> ((Employee) p).getAge() > 18 && ((Employee) p).getGender().equalsIgnoreCase("F");
	   }
	   
	   public static Predicate isAgeMoreThan(Integer age) {
	      return p -> ((Employee) p).getAge() > age;
	   }
	   
	   public static List filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
	       return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	   }
}
