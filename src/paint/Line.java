package paint;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.IOException;
import java.awt.geom.Line2D;



public class Line implements ConnectorLinePlot {
    private Line2D line;
    private Color color;
    public Line(){

    }
    public Line(Line2D ln){
        this.line = ln;
    }
    public Line(Point spoint, Point fpoint){
        this.line = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
    }
    public Line(Point spoint, Point fpoint, Color c){
        this.line = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        this.color = c;
    }

    @Override
    public void draw(GraphicsAdapter g){
        g.getGraphicAdapter().setColor(getColor());
        g.getGraphicAdapter().drawLine((int)line.getX1(), (int)line.getY1() , (int)line.getX2(), (int)line.getY2());
    }

    @Override
    public boolean contains(Point p) {
        int boxX = p.x - 1;
        int boxY = p.y - 1;
        return this.line.intersects(boxX,boxY,2,2);
    }
    @Override
    public void move(Point spoint, Point fpoint){
        Point startPoint = new Point((int)line.getX1() + (fpoint.x - spoint.x),
                (int)line.getY1() + (fpoint.y - spoint.y));
        Point endPoint = new Point((int)line.getX2() + (fpoint.x - spoint.x),
                (int)line.getY2() + (fpoint.y - spoint.y));
        Line2D ln = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        this.setLine(ln);
    }

    @Override
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
            b.write(String.format("%.8f",(double)(getLine().getX1())/GUI.canvas.getWidth()) + " " +
                    String.format("%.8f",(double)(getLine().getY1())/GUI.canvas.getHeight()) + " " +
                    String.format("%.8f",(double)(getLine().getX2())/GUI.canvas.getWidth()) + " " +
                    String.format("%.8f",(double)(getLine().getY2())/GUI.canvas.getHeight()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeObject(Point spoint, Point fpoint){
        Line2D ln = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);
        setLine(ln);
        setColor(GUI.colour);
    }

    public Color getLineColor() {
        return color;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Line2D getLine() {
        return line;
    }
    public void setLine(Line2D line) {
        this.line = line;
    }

}