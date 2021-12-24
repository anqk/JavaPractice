package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {


        Employee employee = new Employee("Ankita","Jairu",28, 50000, LocalDate.now());
        Employee employee2= new Employee("Ankita2","Anki",30,500000,LocalDate.now());

        Employee employee3 = new Employee("Anjali","Anki","Jairu3",35,5000000,LocalDate.now());

        employee.raiseSalary(employee,10);


        employee.displayEmployeeDetail();
        employee2.displayEmployeeDetail();
        employee3.displayEmployeeDetail();
    }
}
