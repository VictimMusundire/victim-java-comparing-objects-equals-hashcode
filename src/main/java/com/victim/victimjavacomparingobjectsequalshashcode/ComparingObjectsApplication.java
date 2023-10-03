package com.victim.victimjavacomparingobjectsequalshashcode;

import com.victim.victimjavacomparingobjectsequalshashcode.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComparingObjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComparingObjectsApplication.class, args);

		Employee e1 = new Employee("Sachin", 45, 55000);
		Employee e2 = new Employee("Sachin", 45, 55000);

		Employee e3 = new Employee("Dhonii", 40, 30000);

		//System.out.println(e1.equals(e2));

// After you have overridden the equal method in the Employee class you can use the .equals() directly
// But it's considered to check hashcode first, coz if it's different there is not need to continue.

		if (e1.hashCode() == e3.hashCode()) {
			System.out.println(e1.equals(e3));
		} else {
			System.out.println("Not Equal");
		}

	}

}
