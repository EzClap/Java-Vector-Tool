package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Ellipse extends JPanel {

    private Point pointStart = null;
    private Point pointEnd = null;
    private int width = 0;
    private int height = 0;

    public Ellipse() {
        mouseListen();
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (pointStart != null) {
            g.setColor(Color.BLACK);
            g.drawOval(pointStart.x, pointStart.y, width, height);
        }
    }

    private void mouseListen() {
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                pointStart = e.getPoint();
                System.out.println(pointStart);
            }

            public void mouseReleased(MouseEvent e) {
                pointStart = null;
                System.out.println(pointEnd);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseMoved(MouseEvent e) {
                pointEnd = e.getPoint();
            }

            public void mouseDragged(MouseEvent e) {
                pointEnd = e.getPoint();
                width = pointEnd.x - pointStart.x;
                height = pointEnd.y - pointStart.y;
                repaint();
            }
        });
    }

}
