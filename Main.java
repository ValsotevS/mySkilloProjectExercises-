import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    triangleByVortex();
    }
    public static void triangleByVortex () {

        System.out.println("Input the 'a' vertex of the triangle: ");

        Scanner scan = new Scanner(System.in);

        double vertexA = scan.nextDouble();

        System.out.println("Input the 'b' vertex of the triangle: ");

        double vertexB = scan.nextDouble();

        System.out.println("Input the 'c' vertex of the triangle: ");

        double vertexC = scan.nextDouble();

        double vertexSum = vertexA + vertexB + vertexC;

        if (vertexSum == 180) {
            System.out.println("The triangle is valid!");
        } else {
            System.out.println("The triangle is NOT valid!");
            return;
        }

        if (vertexA == 90 || vertexB == 90 || vertexC == 90) {
            System.out.println("The triangle is 'Right angled'.");
        } else if (vertexA > 90 || vertexB > 90 || vertexC > 90) {
            System.out.println("The triangle is 'Obtuse triangle'.");
        } else if (vertexA < 90 || vertexB < 90 || vertexC < 90) {
            System.out.println("The triangle is 'Acute triangle'.");
        }
    }
}