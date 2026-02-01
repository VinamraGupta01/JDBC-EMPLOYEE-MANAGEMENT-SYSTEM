package model;

import java.sql.*;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private Date joiningDate;

    public Employee(String name,String department,double salary,Date joiningDate){
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.joiningDate=joiningDate;
    }

    //GETTERS AND SETTERS FOR ASSIGNING AND ACCESSING VALUES

    //GETTER AND SETTER FOR ID
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    //GETTER AND SETTER FOR NAME
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    //GETTER AND SETTER FOR DEPARTMENT
    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department=department;
    }

    //GETTER AND SETTER FOR SALARY
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    //GETTER AND SETTER FOR DATE
    public Date getJoiningDate(){
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate){
        this.joiningDate=joiningDate;
    }    
}