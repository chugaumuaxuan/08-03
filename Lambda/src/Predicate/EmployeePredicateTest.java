package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeePredicateTest {
	public static void main(String[] args) {
	      Employee e1 = new Employee(1, 23, "M", "Nguyen");
	      Employee e2 = new Employee(2, 13, "M", "Pham");
	      Employee e3 = new Employee(3, 36, "F", "Tran");

	      List<Employee> employees = new ArrayList<Employee>();
	      employees.addAll(Arrays.asList(new Employee[]{e1, e2, e3}));

	      System.out.println(EmployeePredicate.filterEmployees(employees, EmployeePredicate.isAdultMale()));
	      System.out.println(EmployeePredicate.filterEmployees(employees, EmployeePredicate.isAdultFemale()));
	      System.out.println(EmployeePredicate.filterEmployees(employees, EmployeePredicate.isAgeMoreThan(35)));
	      System.out.println(EmployeePredicate.filterEmployees(employees, EmployeePredicate.isAgeMoreThan(35).negate()));
	   }
}
