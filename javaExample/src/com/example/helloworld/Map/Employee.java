package com.example.helloworld.Map;

public class Employee extends Customer{
    private int salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
