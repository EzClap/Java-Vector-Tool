package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class Ellipse extends Shapes {

    private ArrayList<Point> pointEnd = new ArrayList<Point>();
    private ArrayList<Integer> width = new ArrayList<Integer>();
    private ArrayList<Integer> height = new ArrayList<Integer>();
    private int pointIndex;


    public Ellipse(Color penColor, Color fillColor) {
        super(penColor, fillColor);
        mouseListen();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Point point : super.getPointStart()) {
            int index = super.getPointStart().indexOf(point);
            if (super.getFillColor() != null) {
                g.setColor(super.getFillColor());
                g.fillOval(point.x, point.y, width.get(index), height.get(index));
            }
            g.setColor(super.getPenColor());
            g.drawOval(point.x, point.y, width.get(index), height.get(index));
        }
    }

    public void mouseListen() {
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                Ellipse.super.getPointStart().add(e.getPoint());
                pointIndex = Ellipse.super.getPointStart().indexOf(e.getPoint());
            }

            public void mouseReleased(MouseEvent e) {
                //pointStart.add(e.getPoint());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseMoved(MouseEvent e) {
                //pointEnd.add(e.getPoint());
            }

            public void mouseDragged(MouseEvent e) {
                pointEnd.add(pointIndex, e.getPoint());
                Point start = Ellipse.super.getPointStart().get(pointEnd.indexOf(e.getPoint()));
                width.add(pointIndex, e.getPoint().x - start.x);
                height.add(pointIndex,e.getPoint().y - start.y);
                repaint();
            }
        });
    }

}
