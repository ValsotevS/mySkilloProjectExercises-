import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        eligibleToWork();
    }

    public static void eligibleToWork() {

        System.out.println("Please, Enter you age: ");

        Scanner scanAge = new Scanner(System.in);

        int age = scanAge.nextInt();

        if (age < 16) {
            System.out.println("You are NOT eligible to work!");
        } else if (age > 64){
            System.out.println("You are NOT eligible to work!");
        } else {
            System.out.println("You are ELIGIBLE to work!");
        }
    }
}