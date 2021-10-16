package com.company;

public class TopManager extends Employee implements EmployeePosition {

    public TopManager(int salary, String company_position, int sum_managers_profit) {
        this.salary=salary;
        this.company_position=company_position;
        this.sum_managers_profit=sum_managers_profit;
    }

    public String getJobTitle(){
        return company_position;
    };
    public double calcSalary(){
        if (sum_managers_profit>10000000) {
            double bonus=1.5d * salary;
            return salary+bonus;
        }
        else return salary;
    };
}
