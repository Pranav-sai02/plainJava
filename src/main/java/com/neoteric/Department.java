package com.neoteric;

import lombok.*;

import java.util.List;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Department {

    String department_name;

    private List<Employee> employeeList;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(department_name, that.department_name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(department_name);
    }
}
