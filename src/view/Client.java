package view;

import controller.EmployeeManager;
import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("FT1", "DT", 20, "025545223", "dtr@gmail.com", 1000, 520, 5000);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("FT2", "TDT", 20, "025545223", "dtr@gmail.com", 100, 20, 6000);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee("FT3", "T", 20, "025545223", "dtr@gmail.com", 1000, 500, 8000);
        employeeArrayList.add(fullTimeEmployee1);
        employeeArrayList.add(fullTimeEmployee2);
        employeeArrayList.add(fullTimeEmployee3);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("PT1", "H", 30, "58595", "gnut@xmail.com", 15);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("PT2", "HV", 30, "58595", "gnut@xmail.com", 25);
        PartTimeEmployee partTimeEmployee3 = new PartTimeEmployee("PT3", "HVB", 30, "58595", "gnut@xmail.com", 35);
        employeeArrayList.add(partTimeEmployee1);
        employeeArrayList.add(partTimeEmployee2);
        employeeArrayList.add(partTimeEmployee3);

        int choice;
        Scanner inputChoice = new Scanner(System.in);
            System.out.println("________Menu_________");
            System.out.println("1. Hiển thị tất cả Nhân viên");
            System.out.println("2. Thêm mới Nhân viên Full time");
            System.out.println("3. Thêm mới Nhân viên Part time");
            System.out.println("4. Xóa Nhân viên theo ID");
            System.out.println("5. Sửa thông tin Nhân viên Full time");
            System.out.println("6. Sửa thông tin Nhân viên Part time");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn của bạn: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    showAllEmployee(employeeArrayList);
                    break;
                case 2:
                    EmployeeManager.addNewFullTimeEmployee();
                    break;
                case 3:
                    EmployeeManager.addNewEmployeePartTime();
                    break;
                case 4:
                case 5:
                case 6:
                case 0:
                    System.exit(0);
        }
    }
    public static void showAllEmployee(ArrayList<Employee> employeeArrayList){
        for (Employee employee:employeeArrayList
             ) {
            System.out.println(employee);
        }
    }
    public static FullTimeEmployee addFullTimeEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID Nhân Viên: ");
        String idEmployeeFullTime = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập Tên Nhân Viên: ");
        String nameEmployeeFullTime = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập Tuổi Nhân Viên: ");
        int ageEmployeeFullTime = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Nhập Phone Nhân Viên: ");
        String phoneEmployeeFullTime = sc3.nextLine();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Nhập Email Nhân Viên: ");
        String emailEmployeeFullTime = sc4.nextLine();
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Nhập Tiền Thưởng Nhân Viên: ");
        double bonusEmployeeFullTime = sc5.nextDouble();
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Nhập Tiền Phạt Nhân Viên: ");
        double fineEmployeeFullTime = sc6.nextDouble();
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Nhập lương cứng Nhân Viên: ");
        double salaryEmployeeFullTime = sc7.nextDouble();
        FullTimeEmployee fullTimeEmployee  = new FullTimeEmployee(idEmployeeFullTime,nameEmployeeFullTime,
                ageEmployeeFullTime,phoneEmployeeFullTime,
                emailEmployeeFullTime,bonusEmployeeFullTime,fineEmployeeFullTime,salaryEmployeeFullTime);
        return fullTimeEmployee;
    }
    public static PartTimeEmployee addPartTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID Nhân Viên: ");
        String idPartTimeEmployee = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập Tên Nhân Viên: ");
        String namePartTimeEmployee = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập Tuổi Nhân Viên: ");
        int agePartTimeEmployee = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Nhập Phone Nhân Viên: ");
        String phonePartTimeEmployee = sc3.nextLine();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Nhập Email Nhân Viên: ");
        String emailPartTimeEmployee = sc4.nextLine();
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Nhập Số Giờ Làm Việc Nhân Viên: ");
        double workHourPartTimeEmployee = sc4.nextDouble();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(idPartTimeEmployee,namePartTimeEmployee
                ,agePartTimeEmployee,phonePartTimeEmployee
                ,emailPartTimeEmployee,workHourPartTimeEmployee);
        return partTimeEmployee;
    }
}
