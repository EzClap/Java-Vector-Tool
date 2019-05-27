package paint;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.IOException;
import java.awt.geom.Line2D;



public class Line implements ConnectorLinePlot{
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
        return this.contains(p);
    }
    @Override
    public void move(Point spoint, Point fpoint){
        Point startPoint = new Point((int)line.getX1() + (fpoint.x - spoint.x), (int)line.getY1() + (fpoint.y - spoint.y));
        Point endPoint = new Point((int)line.getX2() + (fpoint.x - spoint.x),(int)line.getY2() + (fpoint.y - spoint.y));
        Line2D ln = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        this.setLine(ln);
    }

    @Override
    public void writetoFile(BufferedWriter b){
        try {
            b.write(getClass().getSimpleName() + ";");
            b.write((int)getLine().getX1() + ";" + (int)getLine().getY1() + ";" + (int)getLine().getX2() + ";" + (int)getLine().getY2() + ";");
            b.write(getColor().getRed() + ";" + getColor().getGreen() + ";" + getColor().getBlue());
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