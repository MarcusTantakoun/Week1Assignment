
import hsa.Console;
import java.awt.Color;

public class BarChart1 {

    public static void main(String[] args) {
        Console c = new Console();
        
        int h1, h2, h3, h4; 
        c.print("Enter height of Bar 1: ");
        h1 = c.readInt();
        c.print("Enter height of Bar 2: ");
        h2 = c.readInt();
        c.print("Enter height of Bar 3: ");
        h3 = c.readInt();
        c.print("Enter height of Bar 4: ");
        h4 = c.readInt();
        //bar 1
        c.setColor(Color.red);
        c.fillRect(100,500-h1,50,h1);
        c.drawString("Value: " + h1, 100, 500-h1-20);
        //bar 2
        c.setColor(Color.blue);
        c.fillRect(200,500-h2,50,h2);
        c.drawString("Value: " + h2, 200, 500-h2-20);
        //bar 3
        c.setColor(Color.green);
        c.fillRect(300,500-h3,50,h3);
        c.drawString("Value: " + h3, 300, 500-h3-20);
        //bar 4
        c.setColor(Color.orange);
        c.fillRect(400,500-h4,50,h4);
        c.drawString("Value: " + h4, 400, 500-h4-20);
    }

}
