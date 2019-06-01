package paint;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.BasicStroke;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JComponent;

public class App extends JComponent {
    public Point spoint, fpoint;
    public Paint currentPaint;
    public BasicStroke strokeSize;

    private ArrayList<Point> polyPoint = new ArrayList<>();
    private ArrayList<Point> polyPointEnd = new ArrayList<>();
    private ArrayList <Integer> polyX = new ArrayList<>();
    private ArrayList <Integer> polyY = new ArrayList<>();
    private int polyIndex = 0;

    public App() {
        this.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                spoint = new Point(e.getX(), e.getY());
                fpoint = spoint;
                if (GUI.shape == "move") {
                    for (int i = GUI.objects.size() - 1; i >= 0; i = i - 1) {
                        Paint pt = GUI.objects.get(i);
                        if (pt.contains(spoint)) {
                            currentPaint = pt;
                            GUI.objects.remove(pt);
                            break;
                        }
                    }
                } else if (GUI.shape == "Delete") {
                    for (int i = GUI.objects.size() - 1; i >= 0; i = i - 1) {
                        Paint pt = GUI.objects.get(i);
                        if (pt.contains(spoint)) {
                            currentPaint = null;
                            GUI.objects.remove(pt);
                            break;
                        }
                    }
                } else if (GUI.shape == "Polygon") {
                    polyPoint.add(spoint);
                    polyIndex = polyPoint.indexOf(spoint);

                    if (polyIndex > 0) {
                        int xDiff = polyPoint.get(polyIndex).x - polyPoint.get(0).x;
                        int yDiff = polyPoint.get(polyIndex).y - polyPoint.get(0).y;

                        if (xDiff <= 5 && xDiff >= -5 && yDiff <= 5 && yDiff >= -5) {
                            int size = polyPoint.size();
                            if (!polyX.isEmpty()) {
                                polyX.clear();
                                polyY.clear();
                            }
                            for (int i = 0; i < size; i++) {
                                polyX.add(i, polyPoint.get(i).x);
                                polyY.add(i, polyPoint.get(i).y);
                            }
                            polyPoint.clear();
                            polyIndex = 0;
                            polyPointEnd.clear();

                            Polygon obj = new Polygon();
                            obj.makeObject(polyX, polyY);
                            GUI.objects.add(obj);
                            repaint();
                        }
                    }
                }
               // GUI.updateComboBox();
            }


            public void mouseReleased(MouseEvent e) {
                Point p = new Point(e.getX(), e.getY());
                if (GUI.shape == "Rectangle") {
                    Rectangle obj = new Rectangle();
                    obj.makeObject(spoint, p);
                    GUI.objects.add(obj);
                } else if (GUI.shape == "Line") {
                    Line obj = new Line();
                    obj.makeObject(spoint, p);
                    GUI.objects.add(obj);
                } else if (GUI.shape == "Ellipse") {
                    Ellipse obj = new Ellipse();
                    obj.makeObject(spoint, p);
                    GUI.objects.add(obj);
                } else if (GUI.shape == "Plot") {
                    Plot obj = new Plot();
                    obj.makeObject(spoint, p);
                    GUI.objects.add(obj);
                } else if (GUI.shape == "fill") {
                    for (int i = GUI.objects.size() - 1; i >= 0; i = i - 1) {
                        Paint pt = GUI.objects.get(i);
                        try {
                            ConnectorRecEllipsePoly s = (ConnectorRecEllipsePoly) pt;
                            if (s.contains(spoint)) {
                                try {
                                    s.fill(GUI.colour);
                                } catch (Exception ex) {
                                }
                                break;
                            }
                        } catch (Exception ex) {
                        }
                    }
                } else if (GUI.shape == "move") {
                    if (currentPaint.contains(spoint)) {
                        currentPaint.move(spoint, p);
                        GUI.objects.add(currentPaint);
                    }
                }
                if (GUI.shape != "Polygon") {
                    spoint = null;
                    fpoint = null;
                }
                //System.out.println(GUI.objects.size());
                repaint();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                fpoint = new Point(e.getX(), e.getY());
                repaint();

                if (GUI.shape == "move") {

                }
            }

            public void mouseMoved(MouseEvent e) {
                if (GUI.shape == "Polygon") {

                    int i = polyIndex + 1;
                    if (polyPoint.contains(spoint)) {
                        polyPointEnd.add(polyIndex, e.getPoint());

                        repaint();
                    }
                }
            }
        });
    }

    public void paint(Graphics g) {
        GraphicsAdapter g2 = new GraphicsAdapter() {
        };
        g2.setGraphicAdapter(g);
        strokeSize = new BasicStroke(4);
        g2.getGraphicAdapter().setStroke(strokeSize);

        for (Paint pt : GUI.objects) {
            pt.draw(g2);
        }
        if (!polyPoint.isEmpty() && GUI.shape != "Polygon") {
            int size = polyPoint.size();
            if (!polyX.isEmpty()) {
                polyX.clear();
                polyY.clear();
            }
            for (int i = 0; i < size; i++) {
                polyX.add(i, polyPoint.get(i).x);
                polyY.add(i, polyPoint.get(i).y);
            }
            polyX.add(polyPoint.get(0).x);
            polyY.add(polyPoint.get(0).y);
            polyPoint.clear();
            polyIndex = 0;
            polyPointEnd.clear();

            Polygon obj = new Polygon();
            obj.makeObject(polyX, polyY);
            GUI.objects.add(obj);
            obj.draw(g2);
        }
        if (spoint != null && fpoint != null) {
            if (GUI.shape == "Rectangle") {
                Rectangle obj = new Rectangle();
                obj.makeObject(spoint, fpoint);
                obj.draw(g2);
            } else if (GUI.shape == "Ellipse") {
                Ellipse obj = new Ellipse();
                obj.makeObject(spoint, fpoint);
                obj.draw(g2);
            } else if (GUI.shape == "Plot") {
                Plot obj = new Plot();
                obj.makeObject(spoint, fpoint);
                obj.draw(g2);
            } else if (GUI.shape == "Line") {
                Line obj = new Line();
                obj.makeObject(spoint, fpoint);
                obj.draw(g2);
            } else if (GUI.shape == "Polygon") {
                if (!polyPointEnd.isEmpty()) {
                    for (Point point : polyPoint) {
                        int index = polyPoint.indexOf(point);
                        g2.getGraphicAdapter().setColor(GUI.colour);
                        g2.getGraphicAdapter().drawLine(point.x, point.y,
                                polyPointEnd.get(index).x, polyPointEnd.get(index).y);
                    }
                } else {
                    Polygon obj = new Polygon();
                    if (polyX != null) {
                        obj.makeObject(polyX, polyY);
                        obj.draw(g2);
                    }
                }
            } else if (GUI.shape == "move") {
                if (currentPaint instanceof Rectangle) {
                    Rectangle r = (Rectangle) currentPaint;
                    if (r.contains(spoint)) {
                        if (r.getColor() == null) {
                            g2.getGraphicAdapter().setColor(r.getLineColor());
                            g2.getGraphicAdapter().drawRect(r.getRect().x + fpoint.x - spoint.x,
                                    r.getRect().y + fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                        } else {
                            g2.getGraphicAdapter().setColor(r.getColor());
                            g2.getGraphicAdapter().fillRect(r.getRect().x + fpoint.x - spoint.x,
                                    r.getRect().y + fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                            g2.getGraphicAdapter().setColor(r.getLineColor());
                            g2.getGraphicAdapter().drawRect(r.getRect().x + fpoint.x - spoint.x,
                                    r.getRect().y + fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                        }
                    }
                } else if (currentPaint instanceof Ellipse) {
                    Ellipse oval = (Ellipse) currentPaint;
                    if (oval.contains(spoint)) {
                        if (oval.getColor() == null) {
                            g2.getGraphicAdapter().setColor(oval.getLineColor());
                            g2.getGraphicAdapter().drawOval((int) (oval.getElip2d().getX() + fpoint.x - spoint.x),
                                    (int) (oval.getElip2d().getY() + fpoint.y - spoint.y),
                                    (int) oval.getElip2d().getWidth(), (int) oval.getElip2d().getHeight());
                        } else {
                            g2.getGraphicAdapter().setColor(oval.getColor());
                            g2.getGraphicAdapter().fillOval((int) (oval.getElip2d().getX() + fpoint.x - spoint.x),
                                    (int) (oval.getElip2d().getY() + fpoint.y - spoint.y),
                                    (int) oval.getElip2d().getWidth(), (int) oval.getElip2d().getHeight());
                            g2.getGraphicAdapter().setColor(oval.getLineColor());
                            g2.getGraphicAdapter().drawOval((int) (oval.getElip2d().getX() + fpoint.x - spoint.x),
                                    (int) (oval.getElip2d().getY() + fpoint.y - spoint.y),
                                    (int) oval.getElip2d().getWidth(), (int) oval.getElip2d().getHeight());
                        }
                    }
                } else if (currentPaint instanceof Polygon) {
                    Polygon polygon = (Polygon) currentPaint;
                    if (polygon.contains(spoint)) {
                        int size = polygon.getPolygon().npoints;
                        int[] x = new int[size];
                        int[] y = new int[size];
                        for (int i = 0; i < size; i ++) {
                            x[i] = polygon.getPolygon().xpoints[i] + (fpoint.x - spoint.x);
                            y[i] = polygon.getPolygon().ypoints[i] + (fpoint.y - spoint.y);
                        }

                        if (polygon.getColor() == null) {
                            g2.getGraphicAdapter().setColor(polygon.getLineColor());
                            g2.getGraphicAdapter().drawPolygon(x, y, size);
                        } else {
                            g2.getGraphicAdapter().setColor(polygon.getColor());
                            g2.getGraphicAdapter().fillPolygon(x, y, size);
                            g2.getGraphicAdapter().setColor(polygon.getLineColor());
                            g2.getGraphicAdapter().drawPolygon(x, y, size);
                        }
                    }
                } else if (currentPaint instanceof Line) {
                    Line line = (Line) currentPaint;
                    if (line.contains(spoint)) {
                        g2.getGraphicAdapter().setColor(line.getColor());
                        g2.getGraphicAdapter().drawLine((int) line.getLine().getX1() + fpoint.x - spoint.x,
                                (int) line.getLine().getY1() + fpoint.y - spoint.y,
                                (int) line.getLine().getX2() + fpoint.x - spoint.x,
                                (int) line.getLine().getY2() + fpoint.y - spoint.y);
                    }
                } else if (currentPaint instanceof Plot) {
                    Plot plot = (Plot) currentPaint;
                    if (plot.contains(spoint)) {
                        g2.getGraphicAdapter().setColor(plot.getColor());
                        g2.getGraphicAdapter().drawLine(plot.getPoint().x  + fpoint.x - spoint.x,
                                plot.getPoint().y + fpoint.y - spoint.y,
                                plot.getPoint().x + fpoint.x - spoint.x,
                                plot.getPoint().y + fpoint.y - spoint.y);
                    }
                }
            }
        }
    }
}