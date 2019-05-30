package paint;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.BasicStroke;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 * app class manages all the clicks in the canvas and draws according to what the 'shape' variable is reading
 */
public class App extends JComponent {
    public Point spoint, fpoint;
    public Paint currentPaint;
    public BasicStroke strokeSize;

    private ArrayList<Point> polyPoint = new ArrayList<>();
    private ArrayList<Point> polyPointEnd = new ArrayList<>();
    private ArrayList <Integer> polyX = new ArrayList<>();
    private ArrayList <Integer> polyY = new ArrayList<>();
    private int polyIndex = 0;

    /**
     * The app constructor is called on the canvas JPanel so any mouse actions performed on that canvas will
     * be connected here
     */
    public App() {
        this.addMouseListener(new MouseAdapter() {
            /**
             * when the mouse is clicked on the canvas the x and y co-ordinates are recorded and if the 'shape' variable
             * is 'delete', 'move', or 'polygon' it will do those actions respectively.
             * @param e the mouse event
             */
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
                            if(!polyX.isEmpty()){
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
                        else if (GUI.shape != "Polygon"){

                        }
                    }
                }
               // GUI.updateComboBox();
            }

            /**
             * when the mouse is release it will check what the 'shape' variable was and use the first point
             * declared above in mouse clicked and the co-ordinates of this second point from mouse release
             * to draw the shape
             * @param e the mouse event
             */
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
                            ExtendingFill s = (ExtendingFill) pt;
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
                repaint();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            /**
             * if the mouse is dragged it will record the end point of the drag, this is used the draw the shapes before
             * they have been confirmed by a release, this allows for a better user experience as they can see they
             * shape before it is drawn
             */
            public void mouseDragged(MouseEvent e) {
                fpoint = new Point(e.getX(), e.getY());
                repaint();
            }

            /**
             * mouseMoved method is because polygon does not use drag, but clicks for each point, the line is shown
             * when the mouse is moved so the user can see how it will look before they click to confirm the point
             * @param e the mouse event
             */
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

    /**
     * paint, paints the objects based off they points that have be declared and set in the about mouse app constructor.
     * @param g the drawing object
     */
    public void paint(Graphics g) {
        GraphicsAdapter g2 = new GraphicsAdapter() {
        };
        g2.setGraphicAdapter(g);
        strokeSize = new BasicStroke(4);
        g2.getGraphicAdapter().setStroke(strokeSize);

        //draw all the objects in the arraylist
        for (Paint pt : GUI.objects) {
            pt.draw(g2);
        }

        //if polygon is half way through drawing and another button is clicked the polygon automatically finishes
        if(!polyPoint.isEmpty() && GUI.shape != "Polygon"){
            int size = polyPoint.size();
            if(!polyX.isEmpty()){
                polyX.clear();
                polyY.clear();
            }
            for (int i = 0; i < size; i++) {
                polyX.add(i,polyPoint.get(i).x);
                polyY.add(i, polyPoint.get(i).y);
            }
            polyPoint.clear();
            polyIndex = 0;
            polyPointEnd.clear();

            Polygon obj = new Polygon();
            obj.makeObject(polyX, polyY);
            GUI.objects.add(obj);
            obj.draw(g2);

        }

        //draws the respective object to he canvas if it is selected
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

                //while moving a shape draw the shape as it is moving to give user feedback
            } else if (GUI.shape == "move") {
                if (currentPaint instanceof Rectangle) {
                    Rectangle r = (Rectangle) currentPaint;
                    if (r.contains(spoint)) {
                        if (r.getColor() == null) {
                            g2.getGraphicAdapter().setColor(r.getLineColor());
                            g2.getGraphicAdapter().drawRect(r.getRect().x + fpoint.x - spoint.x, r.getRect().y +
                                    fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                        } else {
                            g2.getGraphicAdapter().setColor(r.getColor());
                            g2.getGraphicAdapter().fillRect(r.getRect().x + fpoint.x - spoint.x, r.getRect().y +
                                    fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                            g2.getGraphicAdapter().setColor(r.getLineColor());
                            g2.getGraphicAdapter().drawRect(r.getRect().x + fpoint.x - spoint.x, r.getRect().y +
                                    fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
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
                        int[]x = {polygon.getPolygon().xpoints[0] + fpoint.x - spoint.x,polygon.getPolygon().xpoints[1]
                                + fpoint.x - spoint.x, polygon.getPolygon().xpoints[2] + fpoint.x - spoint.x};
                        int[]y = {polygon.getPolygon().ypoints[0] + fpoint.y - spoint.y,polygon.getPolygon().ypoints[1]
                                + fpoint.y - spoint.y, polygon.getPolygon().ypoints[2] + fpoint.y - spoint.y};
                        if (polygon.getColor() == null) {
                            g2.getGraphicAdapter().setColor(polygon.getLineColor());
                            g2.getGraphicAdapter().drawPolygon(polygon.getPolygon());
                        } else {
                            g2.getGraphicAdapter().setColor(polygon.getColor());
                            g2.getGraphicAdapter().fillPolygon(polygon.getPolygon());
                            g2.getGraphicAdapter().setColor(polygon.getLineColor());
                            g2.getGraphicAdapter().drawPolygon(polygon.getPolygon());
                        }
                    }

                }
            }
        }
    }
}