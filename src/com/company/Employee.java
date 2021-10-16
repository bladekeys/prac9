package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Employee extends Company {
    protected String name;
    protected String surname;
    protected double salary;
    protected String company_position;
    protected int managers_profit;
    protected int sum_managers_profit;
    ArrayList<Double> mas_employee = new ArrayList<>();

    public Employee() {
    }

    public void add_top_manager(int salary, String company_position){
        this.salary = salary;
        this.company_position = company_position;
        TopManager topManager = new TopManager(salary, company_position,sum_managers_profit);
        mas_employee.add(topManager.calcSalary());
    };

    public void add_operator(int salary, String company_position) {
        this.salary = salary;
        this.company_position = company_position;
        Operator operator = new Operator(salary, company_position);
        mas_employee.add(operator.calcSalary());
    }

    public void add_manager(int salary, String company_position) {
        this.salary = salary;
        this.company_position = company_position;
        managers_profit=(int)(Math.random() * ( 140000 - 115000 )) + 115000;
        sum_managers_profit+=managers_profit;
        Manager manager = new Manager(salary, company_position, managers_profit);
        mas_employee.add(manager.calcSalary());
    }


}
