package day9;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String hello = "Hello";

        String helloSubString = "Hello".substring(0,5);

        System.out.println(helloSubString);

        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + ""+ PG13;


        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;

        String value = 13 + ""; // Bad way of doing instead of use String.valueOf()


        System.out.println(rating);

        String all = String.join("/","S","M","L","XL");
        System.out.println(all);

        String repeated = "Java".repeat(3);
        System.out.println(repeated);

        System.out.println("hell".equalsIgnoreCase("y"));
        String userInput = "y";
        String userInputLowerCase = userInput.toLowerCase();
        System.out.println(userInputLowerCase.equals("y"));

        String empty = "   ";

        System.out.println(empty.isBlank()); // Trim before length checking


        String nullString = null;

        if(nullString != null){

            System.out.println(nullString.length());

        }




    }
}