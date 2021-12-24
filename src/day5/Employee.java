package day5;

import java.time.LocalDate;

public class Employee {


    private String firstName;  //Man
    private String middleName; //opt
    private String lastName; //Man
    private int age;  //Man
    private double salary; //Man
    private LocalDate hireDate; //Man


    private Employee(){};  //Default Constructor

    //Parameterized Constructor
    public Employee(String firstName, String lastName, int age, double salary, LocalDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

        public Employee(String firstName,String middleName,String lastName, int age, double salary, LocalDate hireDate){
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
            this.hireDate = hireDate;

    }

    public void raiseSalary(Employee employee, double percentage){
        employee.salary += employee.salary * percentage/100;
    }

    public void displayEmployeeDetail(){
        System.out.println(this.firstName);
        System.out.println(this.middleName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.hireDate);

    }
}
