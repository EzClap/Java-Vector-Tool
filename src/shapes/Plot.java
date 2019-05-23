package shapes;

import Application.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.*;
import java.util.ArrayList;

public class Plot extends JPanel {
    private Point point;
    private Color colour;

    private ArrayList<Point> points = new ArrayList<Point>();
    private int width = 4;
    private int height = 4;

    public Plot(Color c){
        this.colour = c;
        mouseListen();
    }

    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
    public Color getColor() {
        return colour;
    }
    public void setColor(Color color) {
        this.colour = color;
    }

    public void paint(Graphics g){
//        g.setColor(getColor());
//        g.drawLine(getPoint().x,getPoint().y,getPoint().x, getPoint().y);

        g.setColor(colour);
        for (Point point : points) {
            int x = point.x - (width/2);
            int y = point.y - (height/2);
            g.fillOval(x, y, width, height);
        }
    }

    private void mouseListen() {
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                //pointStart.add(e.getPoint());
            }
        });
    }

    public boolean contains(Point p) {
        if(p.x == getPoint().x && p.y == getPoint().y){
            return true;
        }
        return false;
    }

    public void makeObject(Point spoint, Point epoint){
        Point p = new Point(spoint.x, spoint.y);
        setPoint(p);
        setColor(GUI.selectedColour);
    }

    public void writetoFile(BufferedWriter b){
        try {
            b.write(getClass().getSimpleName() + ";");
            b.write(getPoint().x + ";" + getPoint().y + ";");
            b.write(getColor().getRed() + ";" + getColor().getGreen() + ";" + getColor().getBlue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
