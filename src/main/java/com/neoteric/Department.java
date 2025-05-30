package com.neoteric;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    String department_name;

    private List<Employee> employeeList;



}
