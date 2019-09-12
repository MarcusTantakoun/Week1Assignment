
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PenBar pb1 = new PenBar();
        PenBar pb2 = new PenBar();
        PenBar pb3 = new PenBar();
        PenBar pb4 = new PenBar();

        System.out.print("Enter length for bar 1 (max 600) > ");
        pb1.width = s.nextInt();
        System.out.print("Enter length for bar 2 (max 600) > ");
        pb2.width = s.nextInt();
        System.out.print("Enter length for bar 3 (max 600) > ");
        pb3.width = s.nextInt();
        System.out.print("Enter length for bar 4 (max 600) > ");
        pb4.width = s.nextInt();

        Pen p = new StandardPen(new SketchPadWindow(800, 600));

        makeBar(p, pb1, -350, 200, pb1.width, Color.blue);
        makeBar(p, pb2, -350, 100, pb2.width, Color.red);
        makeBar(p, pb3, -350, 0, pb3.width, Color.green);
        makeBar(p, pb4, -350, -100, pb4.width, Color.orange);
    }

    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c) {
        pb.x = x;
        pb.y = y;
        pb.width = w;
        pb.barCol = c;
        pb.draw(p);
    }

}
