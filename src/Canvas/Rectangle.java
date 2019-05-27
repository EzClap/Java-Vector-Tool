package Canvas;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;

public class Rectangle implements ConnectorRecEllipsePoly {
    private java.awt.Rectangle rect;
    private Color lineColor;
    private Color color = null;

    public Rectangle() {

    }
    public Rectangle(java.awt.Rectangle r) {
        this.rect = r;
    }
    public Rectangle(java.awt.Rectangle r, Color lc) {
        this.rect = r;
        this.lineColor = lc;
    }
    public Rectangle(java.awt.Rectangle r, Color lc, Color c) {
        this.rect = r;
        this.lineColor = lc;
        this.color = c;
    }

    public void makeObject(Point spoint, Point fpoint) {
        setLineColor(GUI.colour);
        java.awt.Rectangle r = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        this.setRect(r);
    }

    public void makeRectangle(int x, int y, int w, int h) {
        java.awt.Rectangle r = new java.awt.Rectangle(x, y, w, h);
        this.setRect(r);
    }

    @Override
    public void draw(GraphicsAdapter g) {
        if(getColor() == null){
            g.getGraphicAdapter().setColor(this.getLineColor());
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
        }
        else{
            g.getGraphicAdapter().setColor(this.getColor());
            g.getGraphicAdapter().fillRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
        }
    }
    @Override
    public void fill(Color c){
        this.setColor(c);
    }
    @Override
    public boolean contains(Point p) {
        return this.getRect().contains(p);
    }
    @Override
    public void move(Point startDrag, Point endDrag){
        java.awt.Rectangle r = new java.awt.Rectangle(this.getRect().x + (endDrag.x - startDrag.x),this.getRect().y + (endDrag.y - startDrag.y), this.getRect().width, this.getRect().height);
        this.setRect(r);
    }

    public void writetoFile(BufferedWriter b){
        try {
            b.write(getClass().getSimpleName() + ";");
            b.write(getRect().x + " " + getRect().y + " " + getRect().width + " " + getRect().height + "\n");
            b.write(getLineColor().getRed() + ";" +getLineColor().getGreen() + ";" + getLineColor().getBlue() +";");
            if(getColor()==null){
                b.write("null" + ";" +"null" +";" + "null");
            }else{
                b.write(getColor().getRed() + ";" + getColor().getGreen() + ";" + getColor().getBlue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public java.awt.Rectangle getRect() {
        return rect;
    }
    public void setRect(java.awt.Rectangle rect) {
        this.rect = rect;
    }
    public Color getLineColor() {
        return lineColor;
    }
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
