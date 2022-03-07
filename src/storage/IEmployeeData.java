package storage;

import model.Employee;

import java.util.ArrayList;

public interface IEmployeeData {
    ArrayList<Employee> readFile();
    void writeFile(ArrayList<Employee> arrayList)throws Exception;
}
