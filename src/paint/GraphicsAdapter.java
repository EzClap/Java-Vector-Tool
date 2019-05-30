package paint;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 */
abstract class GraphicsAdapter {
    public Graphics2D GraphicAdapter;
    public GraphicsAdapter(){
    }
    public GraphicsAdapter(Graphics g){
        this.GraphicAdapter = (Graphics2D) g;
    }
    public GraphicsAdapter(Graphics2D g){
        this.GraphicAdapter = g;
    }
    public Graphics2D getGraphicAdapter() {
        return GraphicAdapter;
    }
    public void setGraphicAdapter(Graphics2D graphicAdapter) {
        GraphicAdapter = graphicAdapter;
    }
    public void setGraphicAdapter(Graphics graphicAdapter) {
        GraphicAdapter = (Graphics2D)graphicAdapter;
    }

}
