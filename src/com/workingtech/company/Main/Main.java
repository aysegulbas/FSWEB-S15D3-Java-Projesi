package com.workingtech.company.Main;

import com.workingtech.company.Model.Employee;

import java.util.*;

public class Main {//bu örenekte amacımız List'in içini map'e aktarmak bunu yaparken duplicateleri kaldırcaz

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Aysegul", "Bas"));
        employees.add(new Employee(1, "Aysegul", "Bas"));
        employees.add(new Employee(2, "Aytac", "Sahin"));
        employees.add(new Employee(2, "Aytac", "Sahin"));
        employees.add(new Employee(3, "Serkan", "Toraman"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();
        Iterator iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployees.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }

        }
        for (Employee employee:removedEmployees){
            employees.remove(employee);
        }
        System.out.println(employees);
        System.out.println(removedEmployees);
        System.out.println(employeeMap);

    }
}