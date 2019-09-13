import TurtleGraphics.Pen;
import java.awt.Color;

public class PenBar {
    int x,y;
    int width;
    Color barCol;
    public void draw(Pen p){
        p.setColor(barCol);
        p.up();
        p.move(x,y);
        p.setDirection(0);
        p.down();
        p.setWidth(50);
        p.move(width);
        p.up();
        p.move(50);
        p.down();
        p.drawString("Value: " + width);
    }
    
}
