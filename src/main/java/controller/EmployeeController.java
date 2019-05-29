package controller;

import entity.Employee;
import lombok.AllArgsConstructor;
import mapper.EmployeeMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {

    EmployeeMapper employeeMapper;

    @PostMapping
    

    @GetMapping("/")
    public List<Employee> getEmployees(){
        return employeeMapper.findAll();

    }
}
