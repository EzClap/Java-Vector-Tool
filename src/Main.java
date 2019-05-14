import shapes.Ellipse;
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

        f.add(new Ellipse(Color.BLACK, Color.BLUE));
        //f.add(new Rectangle(Color.BLACK, null));

        f.setVisible(true);
    }

}