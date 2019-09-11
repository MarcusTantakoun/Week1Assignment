
import TurtleGraphics.Pen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length;
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.print("Enter length for bar " + (i + 1) + " (max 600) > ");
                length = s.nextInt();
                if (length <= 600 && length >= 10) {
                    break;
                } else {
                    System.out.println("Error, number must be lower than 600\n");
                }
            }

            makeBar(p, pb1, -350, 200, pb1.width, Color.blue);
            makeBar(p, pb1, -350, 100, pb2.width, Color.red);
            makeBar(p, pb1, -350, 0, pb3.width, Color.green);
            makeBar(p, pb1, -350, -100, pb4.width, Color.orange);
        }
    }

    public void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c) {
        pb.x = x;
        pb.y = y;
        pb.width = w;
        pb.barColor = c;
        pb.draw(p);
    }

}
