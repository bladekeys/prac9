package com.company;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.random;

public class Company {
    private int operators_static_salary;
    private int managers_static_salary;
    private int top_managers_static_salary;

    private int operators_number;
    private int managers_number;
    private int top_managers_number;
    ArrayList<Double> list_employee = new ArrayList<>();


    public Company() {
    }

    public void hire(){
    }

    public void hireall(int operators_number, int managers_number, int top_managers_number) {
        this.operators_number = operators_number;
        this.managers_number = managers_number;
        this.top_managers_number = top_managers_number;
        Employee employee = new Employee();
        for (int i=0; i<operators_number; i++){
            operators_static_salary=(int)(random() * ( 30000 - 20000 )) + 20000;
            employee.add_operator(operators_static_salary, "Operator");
        }
        for (int i=0; i<managers_number; i++){
            managers_static_salary=(int)(random() * ( 110000 - 70000 )) + 70000;
            employee.add_manager(managers_static_salary, "Manager");
        }
        for (int i=0; i<top_managers_number; i++){
            top_managers_static_salary=(int)(random() * ( 500000 - 150000 )) + 150000;
            employee.add_top_manager(top_managers_static_salary, "Top Manager");
        }
        for(int i=0;i<employee.mas_employee.size();i++){
            list_employee.add(employee.mas_employee.get(i));
        }

    }

    public void salary_top(int size){
        Collections.sort(list_employee,Collections.reverseOrder());
        System.out.println((list_employee.subList(0,size)));
    }
    public void salary_low(int size){
        Collections.sort(list_employee);
        System.out.println((list_employee.subList(0,size)));
    }
    public void getIncome(){
        System.out.println();
    }
}
