//package paint;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionAdapter;
//import java.util.ArrayList;
//
//public class Polygon extends JPanel {
//
//    private ArrayList<int[]> polygons = new ArrayList<>();
//    private ArrayList<Integer> numPolyPoints = new ArrayList<>();
//    private int pointIndex = 0;
//    private int[] x;
//    private int[] y;
//    private boolean done = false;
//    private Color penColor;
//    private Color fillColor;
//
//    private ArrayList<Point> pointStart = new ArrayList<>();
//    private ArrayList<Point> pointEnd = new ArrayList<>();
//
//    public Polygon(Color penColor, Color fillColor) {
//        this.penColor = penColor;
//        this.fillColor = fillColor;
//        mouseListen();
//    }
//
//    public void paint(Graphics g) {
//        super.paint(g);
//
//        if (done) {
//            for (int i = 0; i < polygons.size(); i = i + 2) {
//                int yIndex = i + 1;
//                int[] xp = polygons.get(i);
//                int[] yp = polygons.get(yIndex);
//
//                g.setColor(fillColor);
//                g.fillPolygon(xp, yp, numPolyPoints.get(i));
//                g.setColor(penColor);
//                g.drawPolygon(xp, yp, numPolyPoints.get(i));
//            }
//        }
//
//        if (!pointStart.isEmpty()) {
//            for (Point point : pointStart) {
//                int index = pointStart.indexOf(point);
//                g.setColor(penColor);
//                g.drawLine(point.x, point.y, pointEnd.get(index).x, pointEnd.get(index).y);
//            }
//        } else {
//            done = true;
//        }
//    }
//    @Override
//    public void fill(Color c){
//        this.setColor(c);
//    }
//
//    private void mouseListen() {
//        addMouseListener(new MouseAdapter() {
//
//            public void mousePressed(MouseEvent e) {
//                pointStart.add(e.getPoint());
//                pointIndex = pointStart.indexOf(e.getPoint());
//
//                if (pointIndex > 0) {
//                    int xDiff = pointStart.get(pointIndex).x - pointStart.get(0).x;
//                    int yDiff = pointStart.get(pointIndex).y - pointStart.get(0).y;
//
//                    if (xDiff <= 5 && xDiff >= -5 && yDiff <= 5 && yDiff >= -5) {
//                        int size = pointStart.size();
//                        numPolyPoints.add(size);
//                        numPolyPoints.add(0);
//                        x = new int[size];
//                        y = new int[size];
//                        for (int i = 0; i < size; i++) {
//                            x[i] = pointStart.get(i).x;
//                            y[i] = pointStart.get(i).y;
//                        }
//                        polygons.add(x);
//                        polygons.add(y);
//                        pointStart.clear();
//                        pointEnd.clear();
//                        pointIndex = 0;
//                    }
//                }
//                repaint();
//            }
//
//            public void mouseReleased(MouseEvent e) {
////                pointX.add(pointIndex, e.getPoint().x);
////                pointY.add(pointIndex, e.getPoint().y);
////                pointIndex++
//            }
//        });
//
//        addMouseMotionListener(new MouseMotionAdapter() {
//
//            public void mouseMoved(MouseEvent e) {
//                pointEnd.add(pointIndex, e.getPoint());
//                repaint();
//            }
//
//            public void mouseDragged(MouseEvent e) {
////                pointX.add(pointIndex, e.getPoint().x);
////                pointY.add(pointIndex, e.getPoint().y);
////                repaint();
////                pointEnd.add(pointIndex, e.getPoint());
////                repaint();
//            }
//        });
//    }
//
//}
