import hsa.Console;
import java.awt.Color;
public class Wagon {

    public static void main(String[] args) {
        Console c = new Console();
        //sky and ground
        c.setColor(new Color(0,204,255));
        c.fillRect(0,0,700,400);
        c.setColor(new Color(51,204,51));
        c.fillRect(0,400,700,100);
        //body
        c.setColor(Color.red);
        c.fillRect(180,260,300,100);
        //wheels
        c.setColor(Color.black);
        c.fillOval(150,320,80,80);
        c.fillOval(430,320,80,80);
        c.drawLine(100, 180, 180, 260);
        c.fillRect(90, 180, 20, 10);
        //sun
        c.setColor(Color.yellow);
        c.fillOval(500, 20, 100, 100);
    }
    
}
