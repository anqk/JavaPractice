package day10;

public class New {
    public static void main(String[] args) {
        int sales = 50;
        int target = 10;
        if (sales >= 2 * target) {
            System.out.println("Excellent");

        } else if (sales >= 1.5 * target) {
            System.out.println("Better");

        } else if (sales >= target){
            System.out.println("Good");
        } else {
            System.out.println("fired");
        }
        System.out.println("Outside");
    }
}