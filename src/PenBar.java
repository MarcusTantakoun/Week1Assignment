import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;

public class PenBar {
    int x,y;
    int width;
    Color barCol;
    public void draw(Pen p){
        p.up();
        p.move(x,y);
        p.setDirection(0);
        p.down();
        p.setWidth(50);
        p.move(width);
        p.drawString("Value: " + width);
    }
    
}
