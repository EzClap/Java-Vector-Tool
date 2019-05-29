package Canvas;

import java.awt.*;
import java.io.BufferedWriter;

public interface Paint {
    public void draw(GraphicsAdapter g);
    public boolean contains(Point p);
    public void move(Point startDrag, Point endDrag);
    public void writetoFile(BufferedWriter b);
    public void makeObject(Point startDrag, Point endDrag);
    //public void makeObject(int[] xpoints, int[] ypoints);
}