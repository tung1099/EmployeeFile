package model;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Employee implements Serializable {
    private String employeeId;
    private String name;
    private int age;
    private String numberPhone;
    private String email;

    public Employee() {
    }

    public Employee(String employeeId, String name, int age, String numberPhone, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void information(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID Nhân viên: ");
        employeeId = scanner.nextLine();
        System.out.print("Họ và tên: ");
        name = scanner.nextLine();
        System.out.print("Tuổi: ");
        age = scanner.nextInt();
        System.out.print("Số điện thoại: ");
        numberPhone = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
    }

   public abstract double getSalary();

    @Override
    public String toString() {
        return  "ID Nhân viên: '" + employeeId + '\'' +
                ", Họ và tên: '" + name + '\'' +
                ", Tuổi: " + age +
                ", Số điện thoại'" + numberPhone + '\'' +
                ", Email:'" + email ;
    }
}
