//package shapes;
//
//import Application.GUI;
//
//import java.awt.*;
//
//public class Plot {
//    private Point point;
//    private Color colour;
//
//    public Plot(Point p, Color c){
//        this.colour = c;
//        this.point = p;
//    }
//
//    public Point getPoint() {
//        return point;
//    }
//    public void setPoint(Point point) {
//        this.point = point;
//    }
//    public Color getColor() {
//        return colour;
//    }
//    public void setColor(Color color) {
//        this.colour = color;
//    }
//
//    @Override
//    public void draw(Graphics g){
//        g.setColor(getColor());
//        g.drawLine(getPoint().x,getPoint().y,getPoint().x, getPoint().y);
//    }
//
//    @Override
//    public boolean contains(Point p) {
//        if(p.x == getPoint().x && p.y == getPoint().y){
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public void makeObject(Point spoint, Point epoint){
//        Point p = new Point(spoint.x, spoint.y);
//        setPoint(p);
//        setColor(GUI.selectedColour);
//    }
//
//}
