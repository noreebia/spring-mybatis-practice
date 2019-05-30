package org.sooyoung.mybatispractice.controller;

import lombok.AllArgsConstructor;
import org.sooyoung.mybatispractice.entity.Employee;
import org.sooyoung.mybatispractice.mapper.EmployeeMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    EmployeeMapper employeeMapper;

//    @PostMapping("")
////    public List<Employee> insertEmployee(@RequestBody Employee employee) {
////        employeeMapper.insert(employee);
////        return employeeMapper.findByName(employee.getName());
////    }

    @GetMapping("")
    public Employee getEmployees() {
        return employeeMapper.findAll();
    }
    
    @GetMapping("/alternative")
    public List<Employee> getEveryEmployee() {
        return employeeMapper.findEveryEmployee();
    }
}
