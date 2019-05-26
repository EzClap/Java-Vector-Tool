package paint;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.BasicStroke;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JComponent;

public class App extends JComponent {
    public Point spoint, fpoint;
    public Paint currentPaint;
    public BasicStroke strokeSize;

    public App() {
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                spoint = new Point(e.getX(), e.getY());
                fpoint = spoint;
                if (GUI.shape == "move") {
                    for (int i = GUI.paint.size() - 1; i >= 0; i = i - 1) {
                        Paint pt = GUI.paint.get(i);
                        if (pt.contains(spoint)) {
                            currentPaint = pt;
                            GUI.paint.remove(pt);
                            break;
                        }
                    }
                } else if (GUI.shape == "Delete") {
                    for (int i = GUI.paint.size() - 1; i >= 0; i = i - 1) {
                        Paint pt = GUI.paint.get(i);
                        if (pt.contains(spoint)) {
                            currentPaint = null;
                            GUI.paint.remove(pt);
                            break;
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent e) {
                Point p = new Point(e.getX(), e.getY());
                if (GUI.shape == "Rectangle") {
                    Rectangle obj = new Rectangle();
                    obj.makeObject(spoint, p);
                    GUI.paint.add(obj);
                } else if (GUI.shape == "Line") {
                    Line obj = new Line();
                    obj.makeObject(spoint, p);
                    GUI.paint.add(obj);
                } else if (GUI.shape == "Ellipse") {
                    Ellipse obj = new Ellipse();
                    obj.makeObject(spoint, p);
                    GUI.paint.add(obj);
                } else if (GUI.shape == "Plot") {
                    Plot obj = new Plot();
                    obj.makeObject(spoint, p);
                    GUI.paint.add(obj);
                }   else if (GUI.shape == "fill") {
                    for (int i = GUI.paint.size() - 1; i >= 0; i = i - 1) {
                        Paint pt = GUI.paint.get(i);
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
                        GUI.paint.add(currentPaint);
                    }
                }
                spoint = null;
                fpoint = null;
                System.out.println(GUI.paint.size());
                repaint();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                fpoint = new Point(e.getX(), e.getY());
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        GraphicsAdapter g2 = new GraphicsAdapter() {
        };
        g2.setGraphicAdapter(g);
        strokeSize = new BasicStroke(4);
        g2.getGraphicAdapter().setStroke(strokeSize);
        if (OpenFile.image != null) {
            g2.getGraphicAdapter().drawImage(OpenFile.image, 0, 0, null);
            repaint();
        }
        for (Paint pt : GUI.paint) {
            pt.draw(g2);
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
            }  else if (GUI.shape == "move") {
                if (currentPaint instanceof Rectangle) {
                    Rectangle r = (Rectangle) currentPaint;
                    if (r.contains(spoint)) {
                        if (r.getColor() == null) {
                            g2.getGraphicAdapter().setColor(r.getLineColor());
                            g2.getGraphicAdapter().drawRect(r.getRect().x + fpoint.x - spoint.x, r.getRect().y + fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                        } else {
                            g2.getGraphicAdapter().setColor(r.getColor());
                            g2.getGraphicAdapter().fillRect(r.getRect().x + fpoint.x - spoint.x, r.getRect().y + fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                            g2.getGraphicAdapter().drawRect(r.getRect().x + fpoint.x - spoint.x, r.getRect().y + fpoint.y - spoint.y, r.getRect().width, r.getRect().height);
                        }
                    }
                } else if (currentPaint instanceof Ellipse) {
                    Ellipse oval = (Ellipse) currentPaint;
                    if (oval.contains(spoint)) {
                        if (oval.getColor() == null) {
                            g2.getGraphicAdapter().setColor(oval.getLineColor());
                            g2.getGraphicAdapter().drawOval((int) (oval.getElip2d().getX() + fpoint.x - spoint.x), (int) (oval.getElip2d().getY() + fpoint.y - spoint.y), (int) oval.getElip2d().getWidth(), (int) oval.getElip2d().getHeight());
                        } else {
                            g2.getGraphicAdapter().setColor(oval.getColor());
                            g2.getGraphicAdapter().fillOval((int) (oval.getElip2d().getX() + fpoint.x - spoint.x), (int) (oval.getElip2d().getY() + fpoint.y - spoint.y), (int) oval.getElip2d().getWidth(), (int) oval.getElip2d().getHeight());
                        }
                    }
                }
            }
        }
    }
}