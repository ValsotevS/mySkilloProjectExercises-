import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        daysOfTheWeek();
    }

    public static void daysOfTheWeek() {
        System.out.println("Input day of the week: ");

        Scanner scanDay = new Scanner(System.in);
        int weekDay = scanDay.nextInt();

        switch (weekDay) {
            case 1:
                System.out.println("The " + weekDay + "st day of the week is Monday!");
                break;
            case 2:
                System.out.println("The " + weekDay + "nd day of the week is Tuesday!");
                break;
            case 3:
                System.out.println("The " + weekDay + "rd day of the week is Wednesday!");
                break;
            case 4:
                System.out.println("The " + weekDay + "th day of the week is Thursday!");
                break;
            case 5:
                System.out.println("The " + weekDay + "th day of the week is Friday!");
                break;
            case 6:
                System.out.println("The " + weekDay + "th day of the week is Saturday!");
                break;
            case 7:
                System.out.println("The " + weekDay + "th day of the week is Sunday!");
                break;
            default:
                System.out.println("Input NOT valid. There is no such day of the Week");
                break;
        }
    }
}