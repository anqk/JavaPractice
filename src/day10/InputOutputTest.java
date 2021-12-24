package day10;

import java.util.Scanner;

public class InputOutputTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("What is your address?");
        String address = in.next();

        System.out.println("Enter your password");
        String password = in.next();

        System.out.println("How old are you? ");
        int age = in.nextInt();

        System.out.println("Name is = " + name);
        System.out.println("Address is = " + address);
        System.out.println("password is = " + password);
        System.out.println("Age is : " + age);
    }
}
