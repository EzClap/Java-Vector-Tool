package paint;

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
        if(p.x <= getPoint().x + 1.5 && p.x >= getPoint().x - 1.5 &&
                p.y <= getPoint().y + 1.5 && p.y >= getPoint().y - 1.5){
            return true;
        }
        return false;
    }

    public void move(Point startDrag, Point endDrag){
        setPoint(endDrag);
    }


    public void writetoFile(BufferedWriter b, Color prevLColor, Color prevFColor){
        try {
            if (prevLColor != getLineColor()) {
                if (getColor().getRed() < 17) {
                    b.write("PEN #0" + Integer.toHexString(getColor().getRed()));
                } else {
                    b.write("PEN #" + Integer.toHexString(getColor().getRed()));
                }
                if (getColor().getGreen() < 17) {
                    b.write("0" + Integer.toHexString(getColor().getGreen()));
                } else {
                    b.write(Integer.toHexString(getColor().getGreen()));
                }
                if (getColor().getBlue() < 17) {
                    b.write("0" + Integer.toHexString(getColor().getBlue()) + "\n");
                } else {
                    b.write(Integer.toHexString(getColor().getBlue()) + "\n");
                }
            }
            b.write(getClass().getSimpleName().toUpperCase() + " ");
            b.write(String.format("%.8f",(double)(getPoint().x)/GUI.canvas.getWidth()) + " " +
                    String.format("%.8f",(double)(getPoint().y)/GUI.canvas.getHeight()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void makeObject(Point startDrag, Point endDrag){
        Point p = new Point(startDrag.x, startDrag.y);
        setPoint(p);
        setColor(GUI.colour);
    }

    @Override
    public Color getLineColor() {
        return color;
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
