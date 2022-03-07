package controller;


import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;
import storage.EmployeeFromFileBinary;
import storage.IEmployeeData;


import java.io.IOException;
import java.util.ArrayList;

import static view.Client.addFullTimeEmployee;
import static view.Client.addPartTimeEmployee;

public class EmployeeManager {
    public static IEmployeeData employeeData = (IEmployeeData) new EmployeeFromFileBinary();
    public static ArrayList<Employee> employeesArraylist = employeeData.readFile();

    public static void addEmployee(Employee newEmployee){
        employeesArraylist.add(newEmployee);
        try {
            employeeData.writeFile(employeesArraylist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addNewFullTimeEmployee(){
        FullTimeEmployee fullTimeEmployee = addFullTimeEmployee();
        EmployeeManager.addEmployee(fullTimeEmployee);
    }
    public static void addNewEmployeePartTime(){
        PartTimeEmployee partTimeEmployee = addPartTimeEmployee();
        EmployeeManager.addEmployee(partTimeEmployee);
    }
}
