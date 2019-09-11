
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, result;
        System.out.print("Enter your mass (kg): ");
        x = scan.nextDouble();
        System.out.print("Enter your velocity (m/s): ");
        y = scan.nextDouble();
        result = x*y;
        System.out.format("Your momentum is %.2f kg*m/s\n", result);
    }

}
