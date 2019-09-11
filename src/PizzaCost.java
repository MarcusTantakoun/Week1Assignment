
import java.util.Scanner;


public class PizzaCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double cost, size, toppings = 0.75;
        System.out.print("Enter pizza size (in inches): ");
        size = s.nextDouble();
        System.out.print("Enter amount of toppings: ");
        toppings = s.nextDouble();
        cost = size*0.5+toppings+2.25;
        System.out.format("The cost of your pizza is %.2f$\n", cost);
    }
    
}
