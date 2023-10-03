package com.victim.victimjavacomparingobjectsequalshashcode.entity;

/**
 * @author Victim Musundire
 */
public class Employee {

    int age;
    int salary;
    String name;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Employee emp = (Employee) obj;

        return this.name.equals(emp.name) && this.age == emp.age && this.salary == emp.salary;
    }

    @Override
    public int hashCode() {
        return this.name.length() % 10;
    }

}
