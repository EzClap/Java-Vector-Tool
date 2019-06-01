package paint;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.IOException;
import java.awt.geom.Line2D;

/**
 * Line class contains methods for making, drawing, moving, and writing to file for lines
 *
 */
public class Line implements Paint{
    private Line2D line;
    private Color color;

    /**
     * Line constructor create a new line object when files are loaded
     * Followed by numerous overload methods.
     */
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

    /**
     * makeObject creates the object from given points 'spoint' and 'fpoint'
     * @param spoint is the starting point at which the mouse is first clicked.
     * @param fpoint is the ending point of the line where the mouse is released after being dragged
     */
    @Override
    public void makeObject(Point spoint, Point fpoint){
        Line2D ln = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);
        setLine(ln);
        setColor(GUI.colour);
    }

    /**
     * draws the line with the current selected colour and also the fill colour if it has one.
     * @param g graphics adapter to draw to the canvas
     */
    @Override
    public void draw(GraphicsAdapter g){
        g.getGraphicAdapter().setColor(getColor());
        g.getGraphicAdapter().drawLine((int)line.getX1(), (int)line.getY1() , (int)line.getX2(), (int)line.getY2());
    }

    /**
     * contains is used to check when a shape has been clicked on, this is used in the App class for move and delete.
     *
     * @param p the point that has been clicked which is being test
     * @return boolean expression that is true if the point is inside the shape and false if otherwise.
     */
    @Override
    public boolean contains(Point p) {
        return this.contains(p);
    }

    /**
     * move will move the object by how much the mouse has moved by between being pressed down and released.
     * @param spoint the starting point, where the mouse was pressed
     * @param fpoint the finish point, where the mouse was released.
     */
    @Override
    public void move(Point spoint, Point fpoint){
        Point startPoint = new Point((int)line.getX1() + (fpoint.x - spoint.x), (int)line.getY1() + (fpoint.y - spoint.y));
        Point endPoint = new Point((int)line.getX2() + (fpoint.x - spoint.x),(int)line.getY2() + (fpoint.y - spoint.y));
        Line2D ln = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        this.setLine(ln);
    }

    /**
     * writetoFile is called when the canvas is being saved and writes to a vec file in a format that is readable
     * to load again, as per the assignment specifications
     * @param b bufferedWriter writes to the files
     */
    @Override
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
            b.write((getLine().getX1())/GUI.canvas.getWidth() + " " + (getLine().getY1())/GUI.canvas.getHeight() + " " + (getLine().getX2())/GUI.canvas.getWidth() + " " + (getLine().getY2())/GUI.canvas.getHeight());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * get line returns the line
     * @return the line
     */
    public Line2D getLine() {
        return line;
    }

    /**
     * sets the line
     * @param line the line that is set
     */
    public void setLine(Line2D line) {
        this.line = line;
    }

    /**
     * get colour of the lin
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * set the colour of the line
     * @param color the colour that the line will be
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public String getName(){
        return (getClass().getSimpleName());
    }
}