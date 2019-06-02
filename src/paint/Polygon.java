package paint;

//import java.awt.Polygon;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Polygon implements ConnectorRecEllipsePoly {
    private java.awt.Polygon polygon;
    private Color lineColour;
    private Color colour = null;

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

    public java.awt.Polygon getPolygon() {
        return polygon;
    }
    public void setPolygon(java.awt.Polygon polygon) {
        this.polygon = polygon;
    }
    public Color getLineColor() {
        return lineColour;
    }
    public void setLineColor(Color linecolor) {
        this.lineColour = linecolor;
    }
    public Color getColor() {
        return colour;
    }
    public void setColor(Color color) {
        this.colour = color;
    }
    @Override
    public void fill(Color c){
        this.setColor(c);
    }
    @Override
    public boolean contains(Point p) {
        return polygon.contains(p);
    }
    @Override
    public void move(Point startDrag, Point endDrag){
        polygon.translate( endDrag.x - startDrag.x , endDrag.y - startDrag.y );
    }

    public void makeObject(Point startDrag, Point endDrag){

    }

    public void makeObject(ArrayList<Integer> xpoints, ArrayList<Integer> ypoints){
        setLineColor(GUI.colour);

        java.awt.Polygon p = new java.awt.Polygon();
        for (int i = 0; i < xpoints.size(); i ++){
            p.addPoint((int)xpoints.get(i), (int)ypoints.get(i));
        }
        this.setPolygon(p);
    }
    @Override
    public void writetoFile(BufferedWriter b, Color prevLColor, Color prevFColor){
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

            for (int i=0;i < polygon.npoints -1 ; i++){
                b.write(String.format("%.8f",(double)polygon.xpoints[i]/GUI.canvas.getWidth()) + " " +
                        String.format("%.8f",(double)polygon.ypoints[i]/GUI.canvas.getHeight()) + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
}
