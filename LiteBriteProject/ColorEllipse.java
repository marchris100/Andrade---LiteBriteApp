/**
 * Peg that goes on the panel
 * 
 * @author Christohpe rAndrade
 * @version 2.2
 */
import java.awt.*;
import java.awt.geom.Ellipse2D.Double;

public class ColorEllipse extends Double {
    private final int STROKE_WIDTH = 2;
    private Color  _fillColor;
    private Point _clickedPoint;

    public ColorEllipse(Color aColor){ 
        _fillColor = aColor;
    }
    public ColorEllipse(Color color, int x, int y, int width, int height) {
        super (x, y, width, height);
        this.setColor(color);
    }
 
    public void setColor (Color aColor) {
        _fillColor = aColor;
    }
    public void fill (Graphics2D aBetterBrush){
        Color savedColor = aBetterBrush.getColor();
        aBetterBrush.setColor(_fillColor);
        aBetterBrush.fill(this);
        aBetterBrush.setColor(savedColor);
    }
    public void draw (Graphics2D aBrush) {
        Color savedColor = aBrush.getColor();
        aBrush.setColor(_fillColor);
        java.awt.Stroke savedStroke = aBrush.getStroke();
        aBrush.setStroke(new BasicStroke(STROKE_WIDTH));
        aBrush.draw(this);
        aBrush.setStroke(savedStroke);
        aBrush.setColor(savedColor);
    }
}