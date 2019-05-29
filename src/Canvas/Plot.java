package Canvas;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.IOException;

public class Plot implements ConnectorLinePlot {
    private Point point;
    private Color color = Color.black;

    public Plot() {

    }
    public Plot(Point p) {
        this.point = p;
    }

    public Plot(Point p, Color c) {
        this.point = p;
        this.color = c;
    }

    public void draw(GraphicsAdapter g){
        g.GraphicAdapter.setColor(getColor());
        g.getGraphicAdapter().drawLine(getPoint().x, getPoint().y,getPoint().x, getPoint().y);
    }


    public boolean contains(Point p) {
        if(p.x == getPoint().x && p.y == getPoint().y){
            return true;
        }
        return false;
    }

    public void move(Point startDrag, Point endDrag){
        setPoint(endDrag);
    }


    public void writetoFile(BufferedWriter b){
        try {
            b.write(getClass().getSimpleName() + " ");
            b.write(getPoint().x + " " + getPoint().y + " ");
            b.write(getColor().getRed() + " " + getColor().getGreen() + " " + getColor().getBlue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void makeObject(Point startDrag, Point endDrag){
        Point p = new Point(startDrag.x, startDrag.y);
        setPoint(p);
        setColor(GUI.colour);
    }

    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

}
