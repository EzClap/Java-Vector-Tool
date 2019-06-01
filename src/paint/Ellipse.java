package paint;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Ellipse class contains methods for making, drawing, moving, and writing to file for ellipses
 *
 */
public class Ellipse implements ExtendingFill {
    private Ellipse2D elip2d;
    private Color linecolor = null;
    private Color color = null;
    double x1, x2, y1, y2;

    /**
     * Ellipse constructor create a new ellipse object when files are loaded
     * Followed by numerous overload methods.
     */
    public Ellipse() {

    }
    public Ellipse(Ellipse2D e) {
        this.elip2d = e;
    }
    public Ellipse(Ellipse2D e, Color lc) {
        this.elip2d = e;
        this.linecolor = lc;
    }
    public Ellipse(Ellipse2D e, Color lc, Color c) {
        this.elip2d = e;
        this.linecolor = lc;
        this.color = c;
    }

    /**
     * makeObject creates the object from given points 'spoint' and 'fpoint'
     * @param spoint is the starting point at which the mouse is first clicked.
     * @param fpoint is the ending point of the ellipse where the mouse is released after being dragged
     */
    @Override
    public void makeObject(Point spoint, Point fpoint) {
        x1 = spoint.x;
        y1 = spoint.y;
        x2 = fpoint.x;
        y2 = fpoint.y;
        setLineColor(GUI.colour);
        Ellipse2D r = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        this.setElip2d(r);
    }

    /**
     * draw draws the ellipse with the current selected colour and also the fill colour if it has one.
     * @param g graphics adapter to draw to the canvas
     */
    @Override
    public void draw(GraphicsAdapter g) {
        if(getColor() == null){
            g.getGraphicAdapter().setColor(getLineColor());
            g.getGraphicAdapter().drawOval((int)getElip2d().getX(),(int)getElip2d().getY(),
                    (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
        }
        else{
            g.getGraphicAdapter().setColor(getColor());
            g.getGraphicAdapter().fillOval((int)getElip2d().getX(),(int)getElip2d().getY(),
                    (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
            g.getGraphicAdapter().setColor((this.getLineColor()));
            g.getGraphicAdapter().drawOval((int)getElip2d().getX(),(int)getElip2d().getY(),
                    (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
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
        return this.getElip2d().contains(p);
    }

    /**
     * move will move the object by how much the mouse has moved by between being pressed down and released.
     * @param spoint the starting point, where the mouse was pressed
     * @param fpoint the finish point, where the mouse was released.
     */
    @Override
    public void move(Point spoint, Point fpoint){
        x1 = this.getElip2d().getX() + fpoint.x - spoint.x;
        y1 = this.getElip2d().getY() + fpoint.y - spoint.y;
        x2 = x1 + this.getElip2d().getWidth();
        y2 = y1 + this.getElip2d().getHeight();
        this.getElip2d().setFrame(getElip2d().getX() + fpoint.x - spoint.x,this.getElip2d().getY() +
                fpoint.y - spoint.y,this.getElip2d().getWidth(), this.getElip2d().getHeight());
    }

    /**
     * writetoFile is called when the canvas is being saved and writes to a vec file in a format that is readable
     * to load again, as per the assignment specifications
     * @param b bufferedWriter writes to the files
     */
    @Override
    public void writetoFile(BufferedWriter b,Color prevLColor, Color prevFColor){
        try {
            if (prevLColor != getLineColor()) {
                if (getLineColor().getRed() < 17) {
                    b.write("PEN #0" + Integer.toHexString(getLineColor().getRed()));
                } else {
                    b.write("PEN #" + Integer.toHexString(getLineColor().getRed()));
                }
                if (getLineColor().getGreen() < 17) {
                    b.write("0" + Integer.toHexString(getLineColor().getGreen()));
                } else {
                    b.write(Integer.toHexString(getLineColor().getGreen()));
                }
                if (getLineColor().getBlue() < 17) {
                    b.write("0" + Integer.toHexString(getLineColor().getBlue()) + "\n");
                } else {
                    b.write(Integer.toHexString(getLineColor().getBlue()) + "\n");
                }
            }

            if (prevFColor != getColor()) {
                if (getColor() == null) {
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
            }
            b.write(getClass().getSimpleName().toUpperCase() + " ");
            b.write(String.format("%.8f",(double)(x1/GUI.canvas.getWidth())) + " " +
                    String.format("%.8f",(double)(y1/GUI.canvas.getHeight())) + " " +
                    String.format("%.8f",(double)(x2/GUI.canvas.getWidth())) + " " +
                    String.format("%.8f",(double)(y2/GUI.canvas.getHeight())) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * gets the ellipse
     * @return the ellipse
     */
    public Ellipse2D getElip2d() {
        return elip2d;
    }

    /**
     * sets the ellipse
     * @param elip2d the ellipse that will be selected
     */
    public void setElip2d(Ellipse2D elip2d) {
        this.elip2d = elip2d;
    }

    /**
     * gets the colour of the line of the ellipse
     * @return the colour
     */
    public Color getLineColor() {
        return linecolor;
    }

    /**
     * sets the line colour of the ellipse
     * @param linecolor the colour
     */
    public void setLineColor(Color linecolor) {
        this.linecolor = linecolor;
    }

    /**
     * gets the fill colour of the ellipse
     * @return the colour
     */
    public Color getColor() {
        return color;
    }

    /**
     * sets the fill colour of the ellipse
     * @param color the colour
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public String getName(){
        return (getClass().getSimpleName());
    }
}
