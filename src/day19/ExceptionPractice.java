package day19;

import java.io.IOException;

public class ExceptionPractice {

    public void readFromFile() throws IOException {
        throw new IOException("oops readFromFile is throwing exception");
    }

    public void running() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("oops running is throwing exception");
    }

    public void arithmeticOperation() throws ArithmeticException {
        throw new ArithmeticException("oops running is throwing exception");
    }

    public void calculateAgeOfUser(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("You are below 18 so you cannot login to our website");
        } else {
            System.out.println("You can login to our system");
        }
    }

    public static void main(String[] args) {
        ExceptionPractice exceptionPractice = new ExceptionPractice();

//               try {
//               exceptionPractice.readFromFile();
//               System.out.println("In between Read from file and running");
//               exceptionPractice.running();
//               } catch (IOException e) {
//                   System.out.println("In Catch block of IOException");
//                   e.printStackTrace();
//              }


//        try {
//            exceptionPractice.running();
////            exceptionPractice.arithmeticOperation();
//        } catch (ArithmeticException e) {
//            System.out.println("In Catch block of ArithmeticException");
//            e.printStackTrace();
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("In Catch block of IndexOutOfBoundsException");
//            e.printStackTrace();
//    }

//        try{
//            exceptionPractice.running();
//            exceptionPractice.arithmeticOperation();
//        }catch (Throwable e){
//            e.printStackTrace();
//        }

        try {
            exceptionPractice.calculateAgeOfUser(16);
        }catch (AgeRestrictionException e) {
            System.out.println(e.getLocalizedMessage());
        }finally {
            System.out.println("Finally will always execute");

        }
    }
}