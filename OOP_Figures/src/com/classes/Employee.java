package com.classes;

import java.util.Objects;

public class Employee {
    private int id;
    private int salary;
    private String firstName;
    private String lastName;

    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return (firstName + " " + lastName);
    }

    public int getAnnualSalary () {
        return salary * 12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent) {
        return salary * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Employee[id = " + id + ", name = " + this.getName() + ", salary = " + salary + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary &&
                firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary, firstName, lastName);
    }
}
