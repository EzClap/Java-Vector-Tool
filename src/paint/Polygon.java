package paint;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Polygon class contains methods for making, drawing, moving, and writing to file for polygons
 *
 */
public class Polygon implements ExtendingFill {
    private java.awt.Polygon polygon;
    private Color lineColour;
    private Color colour = null;

    /**
     * Polygon constructor create a new ellipse object when files are loaded
     * Followed by numerous overload methods.
     */
    public Polygon(){

    }
    public Polygon(java.awt.Polygon p){
        this.polygon = p;
    }
    public Polygon(java.awt.Polygon p, Color lc){
        this.polygon = p;
        this.lineColour = lc;
    }
    public Polygon(java.awt.Polygon p, Color lc, Color c){
        this.polygon = p;
        this.lineColour = lc;
        this.colour = c;
    }

    /**
     * is not used but is included as it is extended from paint through implemented ExtendingFill
     * @param startDrag
     * @param endDrag
     */
    public void makeObject(Point startDrag, Point endDrag){

    }

    /**
     * makeObject creates the object from given points 'xpoints' and 'ypoints'
     * @param xpoints is all the x values from all the points in the polygon
     * @param ypoints is all the y values from all the points in the polygon
     */
    public void makeObject(ArrayList xpoints, ArrayList ypoints){
        setLineColor(GUI.colour);

        java.awt.Polygon p = new java.awt.Polygon();
        for (int i = 0; i < xpoints.size()-1; i ++){
            p.addPoint((int)xpoints.get(i), (int)ypoints.get(i));
        }
        this.setPolygon(p);
    }

    /**
     * draw draws the polygon with the current selected colour and also the fill colour if it has one.
     * @param g graphics adapter to draw to the canvas
     */
    @Override
    public void draw(GraphicsAdapter g) {
        if(getColor() == null){
            g.getGraphicAdapter().setColor(getLineColor());
            g.getGraphicAdapter().drawPolygon(polygon);
        }
        else{
            g.getGraphicAdapter().setColor(getColor());
            g.getGraphicAdapter().fillPolygon(polygon);
            g.getGraphicAdapter().setColor(getLineColor());
            g.getGraphicAdapter().drawPolygon(polygon);
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
        return polygon.contains(p);
    }

    /**
     * move will move the object by how much the mouse has moved by between being pressed down and released.
     * @param spoint the starting point, where the mouse was pressed
     * @param fpoint the finish point, where the mouse was released.
     */
    @Override
    public void move(Point spoint, Point fpoint){
        polygon.translate( fpoint.x - spoint.x ,
                fpoint.y - spoint.y );
    }

    /**
     * writetoFile is called when the canvas is being saved and writes to a vec file in a format that is readable
     * to load again, as per the assignment specifications
     * @param b bufferedWriter writes to the files
     */
    @Override
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

            for (int i=0;i < polygon.npoints -1 ; i++){
                b.write((double)polygon.xpoints[i]/GUI.canvas.getWidth() + " " +
                        (double)polygon.ypoints[i]/GUI.canvas.getHeight() + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * gets the polygon
     * @return the polygon
     */
    public java.awt.Polygon getPolygon() {
        return polygon;
    }

    /**
     * sets the polygon to elip2d
     * @param elip2d the polygon
     */
    public void setPolygon(java.awt.Polygon elip2d) {
        this.polygon = elip2d;
    }

    /**
     * gets the line colour of the polygon
     * @return the colour
     */
    public Color getLineColor() {
        return lineColour;
    }

    /**
     * sets the line colour of the polygon to linecolour
     * @param linecolor the colour
     */
    public void setLineColor(Color linecolor) {
        this.lineColour = linecolor;
    }

    /**
     * gets the fill colour of the polygon
     * @return the colour
     */
    public Color getColor() {
        return colour;
    }

    /**
     * sets the fill colour of the polygon to color
     * @param color the colour
     */
    public void setColor(Color color) {
        this.colour = color;
    }
}
