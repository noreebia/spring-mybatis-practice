package org.sooyoung.mybatispractice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.sooyoung.mybatispractice.entity.Employee;

@Mapper
public interface EmployeeMapper {


//    @Select("SELECT * from EMPLOYEE")
    Employee findAll();
    
    List<Employee> findEveryEmployee();

}
