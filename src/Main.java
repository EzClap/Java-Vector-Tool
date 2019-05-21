import shapes.Ellipse;
import shapes.Line;
import shapes.Plot;
import shapes.Polygon;
import shapes.Rectangle;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame("Draw a Red Line");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setLocation(300, 300);
        f.setResizable(true);

//        f.add(new Ellipse(Color.BLACK, Color.BLUE));
//        f.add(new Rectangle(Color.BLACK, null));
//        f.add(new Plot(Color.BLACK));
//        f.add(new Line(Color.BLACK));
//        f.add(new Polygon(Color.BLACK, Color.PINK));

        JPanel p = new JPanel() {
            public void paint(Graphics g) {
                super.paint(g);
                int[] x = new int[] {20, 50, 60, 40, 20};
                int[] y = new int[] {20, 20, 50, 80, 20};
                g.drawPolygon(x, y, 5);
            }
        };
        f.add(p);

        f.setVisible(true);

    }

    public void paint(Graphics g) {

    }

}