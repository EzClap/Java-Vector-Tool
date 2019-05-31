package paint;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.security.Guard;

public class Rectangle implements ConnectorRecEllipsePoly {
    private java.awt.Rectangle rect;
    private Color lineColor;
    private Color color = null;
    double x1, x2, y1, y2;

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
        x1 = spoint.x;
        y1 = spoint.y;
        x2 = fpoint.x;
        y2 = fpoint.y;
        setLineColor(GUI.colour);
        java.awt.Rectangle r = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y),
                Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        this.setRect(r);
    }

    @Override
    public void draw(GraphicsAdapter g) {
        if(getColor() == null){
            g.getGraphicAdapter().setColor(this.getLineColor());
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y,
                    this.getRect().width, this.getRect().height);
        }
        else{
            g.getGraphicAdapter().setColor(this.getColor());
            g.getGraphicAdapter().fillRect(this.getRect().x, this.getRect().y,
                    this.getRect().width, this.getRect().height);
            g.getGraphicAdapter().setColor(this.getLineColor());
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y,
                    this.getRect().width, this.getRect().height);
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
        java.awt.Rectangle r = new java.awt.Rectangle(this.getRect().x + (endDrag.x - startDrag.x),
                this.getRect().y + (endDrag.y - startDrag.y), this.getRect().width, this.getRect().height);
        this.setRect(r);
    }

    public void writetoFile(BufferedWriter b){
        try {
            if (getLineColor().getRed()<17 ){
                b.write("PEN #0" + Integer.toHexString(getLineColor().getRed()));
            }else{
                b.write("PEN #" + Integer.toHexString(getLineColor().getRed()));
            }
            if (getLineColor().getGreen() <17){
                b.write("0" + Integer.toHexString(getLineColor().getGreen()));
            }else{
                b.write(Integer.toHexString(getLineColor().getGreen()));
            }
            if (getLineColor().getBlue()<17){
                b.write("0" + Integer.toHexString(getLineColor().getBlue())+"\n");
            }else{
                b.write(Integer.toHexString(getLineColor().getBlue())+"\n");
            }
            if(getColor()==null){
                b.write("FILL OFF\n");
            } else {
                if (getColor().getRed() < 17) {
                    b.write("FILL #0" + Integer.toHexString(getColor().getRed()));
                } else {
                    b.write("FILL #" + Integer.toHexString(getColor().getRed()));
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
            b.write(getClass().getSimpleName() + " ");
            b.write((double)(x1/GUI.canvas.getWidth()) + " " + (double)(y1/GUI.canvas.getHeight()) + " " +
                    (double)(x2/ GUI.canvas.getWidth()) + " " + (double)(y2/ GUI.canvas.getHeight()) );
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