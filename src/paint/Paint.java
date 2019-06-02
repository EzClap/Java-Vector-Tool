package paint;

import java.awt.*;
import java.io.BufferedWriter;

public interface Paint {
    public void draw(GraphicsAdapter g);
    public boolean contains(Point p);
    public void move(Point startDrag, Point endDrag);
    public void writetoFile(BufferedWriter b, Color prevLColor, Color prevFColor);
    public void makeObject(Point startDrag, Point endDrag);
    public Color getLineColor();
    public Color getColor();
    //public void makeObject(int[] xpoints, int[] ypoints);
}