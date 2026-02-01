package dao;

import java.util.List;
import model.Employee;

public interface EmployeeDao {

    //CREATE
    void addEmployee(Employee employee);

    //READ
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);

    //UPDATE
    void updateEmployee(Employee employee);

    //DELETE
    void deleteEmployee(int id);
}
