package gui.design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainGUI extends JFrame implements ActionListener, Runnable{
    public static final int WIDTH = 900;
    public static final int HEIGHT= 600;
    private JPanel pnlCanvas, pnlLeft, pnlRight, pnlTop, pnlBottom;
    private JButton btnLoad, btnSave, btnPlot, btnLine, btnRectangle, btnEllipse, btnPolygon;

    public MainGUI(String title) throws HeadlessException {
        super(title);
    }

    private void createGUI() {
        //Setup
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        pnlCanvas = createPanel(Color.WHITE);
        pnlLeft = createPanel(Color.LIGHT_GRAY);
        pnlRight = createPanel(Color.LIGHT_GRAY);
        pnlTop = createPanel(Color.LIGHT_GRAY);
        pnlBottom = createPanel(Color.LIGHT_GRAY);
        btnLoad = createButton("Load");
        btnSave = createButton("Save");
        btnPlot = createButton("Plot");
        btnLine = createButton("Line");
        btnRectangle = createButton("Rectangle");
        btnEllipse = createButton("Ellipse");
        btnPolygon = createButton("Polygon");
        getContentPane().add(pnlCanvas,BorderLayout.CENTER);
        getContentPane().add(pnlBottom,BorderLayout.SOUTH);
        getContentPane().add(pnlTop,BorderLayout.NORTH);
        getContentPane().add(pnlLeft,BorderLayout.WEST);
        getContentPane().add(pnlRight,BorderLayout.EAST);
        setVisible(true);

        layoutButtonPanel();
    }

    private JPanel createPanel(Color color){
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    private JButton createButton  (String str) {
        JButton button = new JButton();
        button.setText(str);
        button.addActionListener(this);
        return button;
    }

    private void layoutButtonPanel() {
        GridBagLayout layout = new GridBagLayout();
        pnlLeft.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagConstraints constraintsTop = new GridBagConstraints();
        constraintsTop.fill = GridBagConstraints.NONE;
        //why is this not working??
        constraintsTop.anchor = GridBagConstraints.WEST;
        constraintsTop.weightx = 100;
        constraintsTop.weighty = 100;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.weightx = 100;
        constraints.weighty = 100;
        addToPanel(pnlTop, btnLoad,constraintsTop,0,0,2,1);
        addToPanel(pnlTop, btnSave,constraintsTop,1,0,2,1);
        addToPanel(pnlLeft, btnPlot,constraints,0,1,2,1);
        addToPanel(pnlLeft, btnLine,constraints,0,2,2,1);
        addToPanel(pnlLeft, btnRectangle,constraints,0,3,2,1);
        addToPanel(pnlLeft, btnEllipse,constraints,0,4,2,1);
        addToPanel(pnlLeft, btnPolygon,constraints,0,5,2,1);
    }

    private void addToPanel(JPanel jp,Component c,   GridBagConstraints constraints,int x,   int    y,   int    w,   int    h)   {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = w;
        constraints.gridheight = h;
        jp.add(c, constraints);
    }

    @Override
    public void actionPerformed (ActionEvent e){

    }

    @Override
    public void run(){
        createGUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MainGUI("BorderLayout"));

    }

}
