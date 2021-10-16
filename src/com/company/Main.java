package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Company company = new Company();
        company.hireall(180, 80,10);
        company.salary_top(15);
        company.salary_low(30);

        //System.out.println(employee.sum_managers_profit);


    }
}
