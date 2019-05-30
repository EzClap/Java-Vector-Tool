package paint;

import java.awt.Color;

/**
 * interface to be implemented by rectangle, ellipse, and polygon carrying over the methods from the Interface Paint
 * and containing fill method
 */
public interface ExtendingFill extends Paint{
    public void fill(Color color);
}