package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class Rectangle extends JPanel {

    private ArrayList<Point> pointStart = new ArrayList<Point>();
    private ArrayList<Point> pointEnd = new ArrayList<Point>();
    private ArrayList<Integer> width = new ArrayList<Integer>();
    private ArrayList<Integer> height = new ArrayList<Integer>();
    private int pointIndex;
    private Color penColor;
    private Color fillColor;

    public Rectangle(Color penColor, Color fillColor) {
        this.penColor = penColor;
        this.fillColor = fillColor;
        mouseListen();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Point point : pointStart) {
            int index = pointStart.indexOf(point);
            if (fillColor != null) {
                g.setColor(fillColor);
                g.fillRect(point.x, point.y, width.get(index), height.get(index));
            }
            g.setColor(penColor);
            g.drawRect(point.x, point.y, width.get(index), height.get(index));
        }
    }

    private void mouseListen() {
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                pointStart.add(e.getPoint());
                pointIndex = pointStart.indexOf(e.getPoint());
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
                Point start = pointStart.get(pointEnd.indexOf(e.getPoint()));
                width.add(pointIndex, e.getPoint().x - start.x);
                height.add(pointIndex,e.getPoint().y - start.y);

//                int newX = start.x;
//                int newY = start.y;
//                int newWidth = width.get(pointIndex);
//                int newHeight = height.get(pointIndex);
//                if (width.get(pointIndex) < 0) {
//                    newX = start.x + width.get(pointIndex);
//                    width.add(pointIndex, -newWidth);
//                }
//                if (height.get(pointIndex) < 0) {
//                    newY = start.y + height.get(pointIndex);
//                    height.add(pointIndex, -newHeight);
//                }
//                start.setLocation(newX, newY);
//                pointStart.add(pointIndex, start);
                repaint();
            }
        });
    }
}
