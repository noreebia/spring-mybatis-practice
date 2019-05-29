package mapper;

import entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Insert("INSERT INTO employee (name, phone_number) VALUES (#{name}, #{phoneNumber})")
    void insert(Employee employee);

    @Select("SELECT * FROM employee")
    List<Employee> findAll();
}
