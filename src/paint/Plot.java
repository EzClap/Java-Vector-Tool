package paint;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Plot class contains methods for making, drawing, moving, and writing to file for plots
 *
 */
public class Plot implements Paint {
    private Point point;
    private Color color = Color.black;

    /**
     * Plot constructor create a new plot object when files are loaded
     * Followed by numerous overload methods.
     */
    public Plot() {

    }
    public Plot(Point p) {
        this.point = p;
    }
    public Plot(Point p, Color c) {
        this.point = p;
        this.color = c;
    }

    /**
     * makeObject creates the object from given points 'spoint' and 'fpoint'
     * @param spoint is the starting point at which the mouse is first clicked.
     * @param fpoint is not used in plot as it is not dragged
     */
    @Override
    public void makeObject(Point spoint, Point fpoint){
        Point p = new Point(spoint.x, spoint.y);
        setPoint(p);
        setColor(GUI.colour);
    }

    /**
     * draws the plot with the current selected colour and also the fill colour if it has one.
     * @param g graphics adapter to draw to the canvas
     */
    @Override
    public void draw(GraphicsAdapter g){
        g.getGraphicAdapter().setColor(getColor());
        g.getGraphicAdapter().drawLine(getPoint().x, getPoint().y,getPoint().x, getPoint().y);
    }

    /**
     * contains is used to check when a shape has been clicked on, this is used in the App class for move and delete.
     *
     * @param p the point that has been clicked which is being test
     * @return boolean expression that is true if the point is inside the shape and false if otherwise.
     */
    @Override
    public boolean contains(Point p) {
        if(p.x == getPoint().x && p.y == getPoint().y){
            return true;
        }
        return false;
    }

    /**
     * move will move the object by how much the mouse has moved by between being pressed down and released.
     * @param spoint is not needed in plot
     * @param fpoint the plot point is set to the finish point
     */
    public void move(Point spoint, Point fpoint){
        setPoint(fpoint);
    }

    /**
     * writetoFile is called when the canvas is being saved and writes to a vec file in a format that is readable
     * to load again, as per the assignment specifications
     * @param b bufferedWriter writes to the files
     */
    public void writetoFile(BufferedWriter b){
        try {
            if (getColor().getRed()<17 ){
                b.write("PEN #0" + Integer.toHexString(getColor().getRed()));
            }else{
                b.write("PEN #" + Integer.toHexString(getColor().getRed()));
            }
            if (getColor().getGreen() <17){
                b.write("0" + Integer.toHexString(getColor().getGreen()));
            }else{
                b.write(Integer.toHexString(getColor().getGreen()));
            }
            if (getColor().getBlue()<17){
                b.write("0" + Integer.toHexString(getColor().getBlue())+"\n");
            }else{
                b.write(Integer.toHexString(getColor().getBlue())+"\n");
            }
            b.write(getClass().getSimpleName() + " ");
            b.write((double)(getPoint().x)/GUI.canvas.getWidth() + " " +
                    (double)(getPoint().y)/GUI.canvas.getHeight());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * get plot returns the plot
     * @return the line
     */
    public Point getPoint() {
        return point;
    }

    /**
     * sets the plot point
     * @param point the point where the plot will be
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * gets the color of the plot
     * @return the colour
     */
    public Color getColor() {
        return color;
    }

    /**
     * sets the colour of the plot
     * @param color the colour
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
