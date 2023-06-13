import java.util.Scanner;
public class Main {

    public static void main(String[] arrg) {
    triangleByVortex();
    }
    public static void triangleByVortex () {

        System.out.println("Input the 'a' vertex of the triangle: ");

        Scanner scan = new Scanner(System.in);

        double vortexA = scan.nextDouble();

        System.out.println("Input the 'b' vertex of the triangle: ");

        double vortexB = scan.nextDouble();

        System.out.println("Input the 'c' vertex of the triangle: ");

        double vortexC = scan.nextDouble();

        double vortexSum = vortexA + vortexB + vortexC;

        if (vortexSum == 180) {
            System.out.println("The triangle is valid!");
        } else {
            System.out.println("The triangle is NOT valid!");
            return;
        }

        if (vortexA == 90 || vortexB == 90 || vortexC == 90) {
            System.out.println("The triangle is 'Right angled'.");
        } else if (vortexA > 90 || vortexB > 90 || vortexC > 90) {
            System.out.println("The triangle is 'Obtuse triangle'.");
        } else if (vortexA < 90 && vortexB < 90 && vortexC < 90) {
            System.out.println("The triangle is 'Acute triangle'.");
        }
        }
    }
