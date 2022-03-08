package Predicate;

public class Employee {
	private Integer id;
	private Integer age;
	private String gender;
	private String name;
	
	public Employee(Integer id, Integer age, String gender, String name) {
		this.id = id;
	    this.age = age;
	    this.gender = gender;
	    this.name = name;
	   }
	
	   public Integer getAge() {
	      return age;
	   }
	   
	   public String getGender() {
	      return gender;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   @Override
	   public String toString() {
	      return this.name.toString()+" - "+ this.age.toString();
	   }
}
