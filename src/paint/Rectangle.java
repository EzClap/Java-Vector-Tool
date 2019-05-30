package paint;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Rectangle class contains methods for making, drawing, moving, and writing to file for rectangles
 *
 */
public class Rectangle implements ExtendingFill {
    private java.awt.Rectangle rect;
    private Color lineColor;
    private Color color = null;
    double x1, x2, y1, y2;

    /**
     * Rectangle constructor create a new rectangle object when files are loaded
     * Followed by numerous overload methods.
     */
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

    /**
     * makeObject creates the object from given points 'spoint' and 'fpoint'
     * @param spoint is the starting point at which the mouse is first clicked.
     * @param fpoint is the ending point of the rectangle where the mouse is released after being dragged
     */
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

    /**
     * draw draws the rectangle with the current selected colour and also the fill colour if it has one.
     * @param g graphics adapter to draw to the canvas
     */
    @Override
    public void draw(GraphicsAdapter g) {
        if(getColor() == null){
            g.getGraphicAdapter().setColor(this.getLineColor());
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width,
                    this.getRect().height);
        }
        else{
            g.getGraphicAdapter().setColor(this.getColor());
            g.getGraphicAdapter().fillRect(this.getRect().x, this.getRect().y, this.getRect().width,
                    this.getRect().height);
            g.getGraphicAdapter().setColor((this.getLineColor()));
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width,
                    this.getRect().height);
        }
    }

    /**
     * fill method is implemented from the ExtendingFill
     * this contains the method to fill the shape.
     * @param c the colour that the shape will be filled with.
     */
    @Override
    public void fill(Color c){
        this.setColor(c);
    }

    /**
     * contains is used to check when a shape has been clicked on, this is used in the App class for move and delete.
     *
     * @param p the point that has been clicked which is being test
     * @return boolean expression that is true if the point is inside the shape and false if otherwise.
     */
    @Override
    public boolean contains(Point p) {
        return this.getRect().contains(p);
    }

    /**
     * move will move the object by how much the mouse has moved by between being pressed down and released.
     * @param spoint the starting point, where the mouse was pressed
     * @param fpoint the finish point, where the mouse was released.
     */
    @Override
    public void move(Point spoint, Point fpoint){
        java.awt.Rectangle r = new java.awt.Rectangle(this.getRect().x + (fpoint.x - spoint.x),this.getRect().y +
                (fpoint.y - spoint.y), this.getRect().width, this.getRect().height);
        this.setRect(r);
    }

    /**
     * writetoFile is called when the canvas is being saved and writes to a vec file in a format that is readable
     * to load again, as per the assignment specifications
     * @param b bufferedWriter writes to the files
     */
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

    /**
     * getRect gets the rectangle
     * @returns the rectangle
     */
    public java.awt.Rectangle getRect() {
        return rect;
    }

    /**
     * sets the rectangle
     * @param rect the rectangle you want to set it to
     */
    public void setRect(java.awt.Rectangle rect) {
        this.rect = rect;
    }

    /**
     * gets the line colour of the rectangle
     * @return the Color
     */
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * sets the line colour of the rectangle
     * @param lineColor the colour you want the line to be
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    /**
     * gets the fill colour of the rectangle
     * @returns the colour
     */
    public Color getColor() {
        return color;
    }

    /**
     * sets the fill colour of the rectangle
     * @param color the colour you want the fill colour to be.
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
