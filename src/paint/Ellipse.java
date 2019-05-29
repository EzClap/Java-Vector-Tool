package paint;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.io.BufferedWriter;
import java.io.IOException;


public class Ellipse implements ConnectorRecEllipsePoly {
    private Ellipse2D elip2d;
    private Color linecolor = null;
    private Color color = null;
    double x1, x2, y1, y2;

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


    @Override
    public void draw(GraphicsAdapter g) {
        if(getColor() == null){
            g.getGraphicAdapter().setColor(getLineColor());
            g.getGraphicAdapter().drawOval((int)getElip2d().getX(),(int)getElip2d().getY(), (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
        }
        else{
            g.getGraphicAdapter().setColor(getColor());
            g.getGraphicAdapter().fillOval((int)getElip2d().getX(),(int)getElip2d().getY(), (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
            g.getGraphicAdapter().setColor(this.getLineColor());
            g.getGraphicAdapter().drawOval((int)getElip2d().getX(),(int)getElip2d().getY(), (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
        }
    }
    @Override
    public void fill(Color c){
        this.setColor(c);
    }
    @Override
    public boolean contains(Point p) {
        return this.getElip2d().contains(p);
    }
    @Override
    public void move(Point startDrag, Point endDrag){
        this.getElip2d().setFrame(getElip2d().getX() + endDrag.x - startDrag.x,this.getElip2d().getY() + endDrag.y - startDrag.y,this.getElip2d().getWidth(), this.getElip2d().getHeight());
    }

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
            }else{
                if (getColor().getRed()<17 ){
                    b.write("FILL #0" + Integer.toHexString(getColor().getRed()));
                }else{
                    b.write("FILL #" + Integer.toHexString(getColor().getRed()));
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
            }
            b.write(getClass().getSimpleName() + " ");
            b.write((double)(x1/GUI.canvas.getWidth()) + " " + (double)(y1/GUI.canvas.getHeight()) + " " + (double)(x2/GUI.canvas.getWidth()) + " " + (double)(y2/GUI.canvas.getHeight()) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Ellipse2D getElip2d() {
        return elip2d;
    }
    public void setElip2d(Ellipse2D elip2d) {
        this.elip2d = elip2d;
    }
    public Color getLineColor() {
        return linecolor;
    }
    public void setLineColor(Color linecolor) {
        this.linecolor = linecolor;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

}
