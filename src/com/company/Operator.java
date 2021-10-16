package com.company;

public class Operator extends Employee implements EmployeePosition{

    public Operator(int salary, String company_position) {
        this.salary=salary;
        this.company_position=company_position;
    }

    public String getJobTitle(){
        return company_position;
    };
    public double calcSalary(){
        return salary;
    };
}
