package paint;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Graphics Adapter creates an object that is of type Graphics2D
 */
public class GraphicsAdapter {
    public Graphics2D GraphicAdapter;
    public GraphicsAdapter(){
    }

    /**
     * gets the current graphic adapter
     * @return the graphic adapter
     */
    public Graphics2D getGraphicAdapter() {
        return GraphicAdapter;
    }

    /**
     * sets the graphic adapter
     * @param graphicAdapter this is the new graphic adapter that is set
     */
    public void setGraphicAdapter(Graphics graphicAdapter) {
        GraphicAdapter = (Graphics2D)graphicAdapter;
    }

}
