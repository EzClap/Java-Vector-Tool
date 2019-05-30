//package Canvas;
//
//import paint.*;
//
//import java.awt.*;
//import java.io.BufferedWriter;
//import java.io.IOException;
//
//public class Polygon implements ConnectorRecEllipsePoly {
//    private java.awt.Polygon polygon;
//    private Color lineColour;
//    private Color colour = null;
//
//    public Polygon(){
//
//    }
//
//    public Polygon(java.awt.Polygon p){
//        this.polygon = p;
//    }
//
//    public Polygon(java.awt.Polygon p, Color lc){
//        this.polygon = p;
//        this.lineColour = lc;
//    }
//
//    public Polygon(java.awt.Polygon p, Color lc, Color c){
//        this.polygon = p;
//        this.lineColour = lc;
//        this.colour = c;
//    }
//
//    public java.awt.Polygon getPolygon() {
//        return polygon;
//    }
//    public void setPolygon(java.awt.Polygon elip2d) {
//        this.polygon = elip2d;
//    }
//    public Color getLineColor() {
//        return lineColour;
//    }
//    public void setLineColor(Color linecolor) {
//        this.lineColour = linecolor;
//    }
//    public Color getColor() {
//        return colour;
//    }
//    public void setColor(Color color) {
//        this.colour = color;
//    }
//
//    @Override
//    public void fill(Color c){
//        this.setColor(c);
//    }
//
//    @Override
//    public boolean contains(Point p) {
//        return polygon.contains(p);
//    }
//
//    @Override
//    public void move(Point startDrag, Point endDrag){
//        polygon.translate( endDrag.x - startDrag.x , endDrag.y - startDrag.y );
//    }
//
//    public void makeObject(Point startDrag, Point endDrag){
//
//    }
//
//    public void makeObject(int[] xpoints, int[] ypoints){
//        setLineColor(GUI.colour);
//
//        java.awt.Polygon p = new java.awt.Polygon();
//        for (int i = 0; i < xpoints.length; i ++){
//            p.addPoint(xpoints[i], ypoints[i]);
//        }
//        this.setPolygon(p);
//    }
//
//    @Override
//    public void writetoFile(BufferedWriter b){
//        try {
//            b.write(getClass().getSimpleName() + " ");
//
//            for (int i=0;i < polygon.npoints-1 ; i++){
//                b.write(polygon.xpoints[i] + " " + polygon.ypoints[i] + " ");
//            }
//
//            b.write(getLineColor().getRed() + " " +getLineColor().getGreen() + " " + getLineColor().getBlue() +" ");
//            if(getColor()==null){
//                b.write("null" + " " +"null" +" " + "null");
//            }else{
//                b.write(getColor().getRed() + " " + getColor().getGreen() + " " + getColor().getBlue());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void draw(GraphicsAdapter g) {
//        if(getColor() == null){
//            g.getGraphicAdapter().setColor(getLineColor());
//            g.getGraphicAdapter().drawPolygon(polygon);
//        }
//        else{
//            g.getGraphicAdapter().setColor(getColor());
//            g.getGraphicAdapter().fillPolygon(polygon);
//            g.getGraphicAdapter().setColor(getLineColor());
//            g.getGraphicAdapter().drawPolygon(polygon);
//        }
//    }
//}
