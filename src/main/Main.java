package main;

import dao.EmployeeDao;
import dao.EmployeeDaoImplementation;   
import model.Employee;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeDao dao = new EmployeeDaoImplementation();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- EMPLOYEE MANAGEMENT SYSTEM ----");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("2. VIEW ALL EMPLOYEES");
            System.out.println("3. VIEW EMPLOYEE BY ID");
            System.out.println("4. UPDATE EMPLOYEE");
            System.out.println("5. DELETE EMPLOYEE");
            System.out.println("6. EXIT");

            System.out.print("CHOOSE OPTION: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("NAME: ");
                    String name = sc.nextLine();

                    System.out.print("DEPARTMENT: ");
                    String dept = sc.nextLine();

                    System.out.print("SALARY: ");
                    double salary = sc.nextDouble();

                    System.out.print("JOINING DATE (YYYY-MM-DD): ");
                    Date date = Date.valueOf(sc.next());

                    Employee emp = new Employee(name, dept, salary, date);
                    dao.addEmployee(emp);
                    break;

                case 2:
                    List<Employee> list = dao.getAllEmployees();
                    for (Employee e : list) {
                        System.out.println(
                                e.getId() + " | " +
                                e.getName() + " | " +
                                e.getDepartment() + " | " +
                                e.getSalary() + " | " +
                                e.getJoiningDate()
                        );
                    }
                    break;

                case 3:
                    System.out.print("ENTER ID: ");
                    int id = sc.nextInt();

                    Employee e = dao.getEmployeeById(id);
                    if (e != null) {
                        System.out.println(
                                e.getId() + " | " +
                                e.getName() + " | " +
                                e.getDepartment() + " | " +
                                e.getSalary() + " | " +
                                e.getJoiningDate()
                        );
                    } else {
                        System.out.println("EMPLOYEE NOT FOUND");
                    }
                    break;

                case 4:
                    System.out.print("ID TO UPDATE: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("NEW NAME: ");
                    String newName = sc.nextLine();

                    System.out.print("NEW DEPARTMENT: ");
                    String newDepartment = sc.nextLine();

                    System.out.print("NEW SALARY: ");
                    double newSalary = sc.nextDouble();

                    System.out.print("NEW JOINING DATE (YYYY-MM-DD): ");
                    Date newDate = Date.valueOf(sc.next());

                    Employee updated =
                            new Employee(newName, newDepartment, newSalary, newDate);
                    updated.setId(uid);

                    dao.updateEmployee(updated);
                    break;

                case 5:
                    System.out.print("ID TO DELETE: ");
                    int did = sc.nextInt();
                    dao.deleteEmployee(did);
                    break;

                case 6:
                    System.out.println("EXITING...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}
