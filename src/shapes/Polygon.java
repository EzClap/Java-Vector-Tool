package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class Polygon extends JPanel {

    // NO ERRORS BUT DOESN'T WORK

    private ArrayList<Integer> pointX = new ArrayList<Integer>();
    private ArrayList<Integer> pointY = new ArrayList<Integer>();
    private ArrayList<ArrayList<Integer>> polygons = new ArrayList<ArrayList<Integer>>();
    private int pointIndex = 0;
    private Color penColor;
    private Color fillColor;

    public Polygon(Color penColor, Color fillColor) {
        this.penColor = penColor;
        this.fillColor = fillColor;
        mouseListen();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < polygons.size(); i+=2) {
            int size = polygons.get(i).size();
            int[] x = new int[size];
            int[] y = new int[size];
            for (int j = 0; j < size; j++) {
                x[j] = polygons.get(i).get(j);
                y[j] = polygons.get(i++).get(j);
            }

            g.setColor(fillColor);
            g.fillPolygon(x, y, size);
            g.setColor(penColor);
            g.drawPolygon(x, y, size);
        }
    }

    private void mouseListen() {
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                pointX.add(pointIndex, e.getPoint().x);
                pointY.add(pointIndex, e.getPoint().y);

                if (pointIndex > 0) {
                    int xDiff = pointX.get(pointIndex) - pointX.get(0);
                    int yDiff = pointY.get(pointIndex) - pointY.get(0);
                    if (xDiff <= 10 && xDiff >= -10 && yDiff <= 10 && yDiff >= -10) {
                        polygons.add(pointX);
                        polygons.add(pointY);
                        pointX.clear();
                        pointY.clear();
                        pointIndex = 0;
                    } else {
                        pointIndex++;
                    }
                } else {
                    pointIndex++;
                }
                repaint();

            }

            public void mouseReleased(MouseEvent e) {
//                pointX.add(pointIndex, e.getPoint().x);
//                pointY.add(pointIndex, e.getPoint().y);
//                pointIndex++
            }

        });

        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseMoved(MouseEvent e) {
//                pointX.add(pointIndex, e.getPoint().x);
//                pointY.add(pointIndex, e.getPoint().y);
//                repaint();
            }

            public void mouseDragged(MouseEvent e) {
//                pointX.add(pointIndex, e.getPoint().x);
//                pointY.add(pointIndex, e.getPoint().y);
//                repaint();
            }
        });
    }
}
