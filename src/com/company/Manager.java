package com.company;

public class Manager extends Employee implements EmployeePosition {

    public Manager(int salary, String company_position, int managers_profit) {
        this.salary=salary;
        this.company_position=company_position;
        this.managers_profit = managers_profit;
    }

    public String getJobTitle(){
        return company_position;
    };
    public double calcSalary(){
        return (managers_profit*5/100)+salary;
    };
}
