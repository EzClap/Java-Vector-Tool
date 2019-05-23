package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class Line extends JPanel {

    private ArrayList<Point> pointStart = new ArrayList<Point>();
    private ArrayList<Point> pointEnd = new ArrayList<Point>();
    private int pointIndex;
    private Color penColor;

    public Line(Color penColor) {
        this.penColor = penColor;
        mouseListen();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Point point : pointStart) {
            int index = pointStart.indexOf(point);
            g.setColor(penColor);
            g.drawLine(point.x, point.y, pointEnd.get(index).x, pointEnd.get(index).y);
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
                repaint();
            }
        });
    }

}
