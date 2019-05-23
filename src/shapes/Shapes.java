package shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class Shapes extends JPanel {

    private Color penColor;
    private Color fillColor;

    private ArrayList<Point> pointStart = new ArrayList<Point>();


    public Shapes(Color penColor, Color fillColor) {
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    public Color getPenColor() {
        return penColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public ArrayList<Point> getPointStart() {
        return pointStart;
    }

    //public abstract void paint(Graphics g);

    public abstract void mouseListen();

}
