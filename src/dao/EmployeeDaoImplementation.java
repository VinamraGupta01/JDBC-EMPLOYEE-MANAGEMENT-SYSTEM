package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Employee;
import util.*;

public class EmployeeDaoImplementation implements EmployeeDao {

    // INSERT
    @Override
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employee (name, department, salary, joining_date) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDepartment());
            ps.setDouble(3, employee.getSalary());
            ps.setDate(4, employee.getJoiningDate());

            ps.executeUpdate();
            System.out.println("EMPLOYEE ADDED SUCCESSFULLY");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ ALL
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getDate("joining_date")
                );
                emp.setId(rs.getInt("id"));
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // READ BY ID
    @Override
    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE id=?";
        Employee emp = null;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                emp = new Employee(
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getDate("joining_date")
                );
                emp.setId(rs.getInt("id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return emp;
    }

    // UPDATE
    @Override
    public void updateEmployee(Employee employee) {
        String sql = "UPDATE employee SET name=?, department=?, salary=?, joining_date=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDepartment());
            ps.setDouble(3, employee.getSalary());
            ps.setDate(4, employee.getJoiningDate());
            ps.setInt(5, employee.getId());

            ps.executeUpdate();
            System.out.println("EMPLOYEE UPDATED SUCCESSFULLY");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    @Override
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("EMPLOYEE DELETED SUCCESSFULLY");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
