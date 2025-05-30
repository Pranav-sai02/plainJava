package com.neoteric;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {

        List<Employee> hrEmployees = new ArrayList<>();
        hrEmployees.add(new Employee("Eve", 50000.0, "Hr"));
        hrEmployees.add(new Employee("Adam", 60000.0, "Hr"));

        List<Employee> itEmployees = new ArrayList<>();
        itEmployees.add(new Employee("sanjay", 10000.0, "It"));
        itEmployees.add(new Employee("sucheel", 60000.0, "It"));

        List<Employee> marketingEmployees = new ArrayList<>();
        marketingEmployees.add(new Employee("sam", 40000.0, "Marketing"));
        marketingEmployees.add(new Employee("dam", 60000.0, "Marketing"));


        Department hr = new Department("HR", hrEmployees);
        Department it = new Department("IT", itEmployees);
        Department marketing = new Department("Marketing", marketingEmployees);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(it);
        departments.add(marketing);

        Map<String, Double> avgSalaryByDept = departments.stream()
                .flatMap(Department -> Department.getEmployeeList().stream())
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        avgSalaryByDept.forEach((deptName, avgSalary) ->
                System.out.println("Average salary in " + deptName + ": ₹" + avgSalary));




    }
}
