package paint;

import java.awt.*;
import java.io.BufferedWriter;

/**
 * this is the interface that is implemented by all shapes is extended by ExtendingFill for the objects
 * that can be filled
 */
public interface Paint {
    void draw( GraphicsAdapter g);
    boolean contains(Point p);
    void move(Point startDrag, Point endDrag);
    void writetoFile(BufferedWriter b);
    void makeObject(Point startDrag, Point endDrag);
    String getName();
}