import shapes.Ellipse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Main extends JPanel {
    public static void main(String args[]) throws Exception {
        JFrame f = new JFrame("Draw a Red Line");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setLocation(300, 300);
        f.setResizable(true);

        Ellipse e = new Ellipse();
        f.add(e);
        f.setVisible(true);
    }

}