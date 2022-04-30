package com.prokhnov.spring_rest.client;

import com.prokhnov.spring_rest.client.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);

//>>>        Get list of Employees
//        List<Employee> allEmployees = communication.showAllEmployees();
//        System.out.println(allEmployees);

//>>>        Get Employee by ID
//        Employee employee = communication.getEmployee(17);
//        System.out.println(employee);

//>>>        Create Employee
//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 900);
//        communication.saveEmployee(employee);

//>>>        Update Employee
//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 900);
//        employee.setId(0);
//        communication.saveEmployee(employee);

//>>>        Delete Employee
//        communication.deleteEmployee(22);

    }
}
