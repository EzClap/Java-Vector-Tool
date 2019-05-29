package paint;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
//import javax.swing.undo.UndoManager;
import java.util.ArrayList;
import java.awt.event.MouseEvent;

/**
 *
 */
public class GUI extends JFrame {
    public static String shape = "Plot";
    public static Color colour = Color.BLACK;
    public static ArrayList<Paint> objects = new ArrayList<Paint>();
    private JPanel canvas;
    public static GUI f;

    public static void main(String[] args)
    {
        ArrayList<Paint> paint = new ArrayList<Paint>();
        f.objects = paint;
        f = new GUI();
        f.setVisible(true);
    }

    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Vector Graphic Designer");
        setSize(900, 600);
        Dimension minSize = new Dimension(600,400);
        setMinimumSize(minSize);

        //Create Menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        //Create 'New' menu item
        JMenuItem menuItemNew = new JMenuItem("New");
        menuItemNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "";
                OpenFile.image = null;

                //paint.GUI g = new paint.GUI();
                //g.setVisible(true);
                objects.clear();
                //g.objects = new ArrayList<Paint> ();

                repaint();
            }
        });
        menuFile.add(menuItemNew);

        //Create 'Load/ menu item
        JMenuItem menuItemLoad = new JMenuItem("Load");
        menuItemLoad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape ="Open";
                try {
                    GUI.objects.clear();
                    new OpenFile();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        menuFile.add(menuItemLoad);

        //Create 'Save' menu item
        JMenuItem menuItemSave = new JMenuItem("Save");
        menuItemSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Save";
                new SaveFile();
            }
        });
        menuFile.add(menuItemSave);

        //Create 'Exit' menu item
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Exit";
                System.exit(0);
            }
        });
        menuFile.add(menuItemExit);

        //Create About menu
        Panel aboutPanel = new Panel();
        aboutPanel.setVisible(false);
        JMenu menuAbout = new JMenu("About");
        menuAbout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent a) {
                new About();
            }
        });
        menuBar.add(menuAbout);
//        //Create Undo button
//        JMenu menuUndo = new JMenu("Undo");
//        menuUndo.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent a) {
//                shape = "Undo";
//
//            }
//        });
//        menuBar.add(menuUndo);




        //Create the canvas. Being drawn on.
        canvas = new JPanel();
        canvas.setBorder(new EmptyBorder(5, 5, 5, 5));
        canvas.setLayout(new BorderLayout(0, 0));
        canvas.setBackground(Color.white);
        setContentPane(canvas);

        //Create the panel that contains the tool buttons
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        panel.setBackground(Color.LIGHT_GRAY);
        canvas.add(panel, BorderLayout.WEST);

        JPanel toolPanel = new JPanel();
        toolPanel.setLayout(layout);
        toolPanel.setBackground(Color.LIGHT_GRAY);
        canvas.add(toolPanel, BorderLayout.EAST);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.weightx = 100;
        constraints.weighty = 100;



        //addToPanel(panel, btnUndo, constraints,0,0,2,1);
        //Create plot button
        JButton btnPoint = new JButton("Plot");
        btnPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Plot";
            }
        });
        addToPanel(panel, btnPoint, constraints, 0,1,2,1);

        //Create Line button
        JButton btnLine = new JButton("Line");
        btnLine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Line";
            }
        });
        addToPanel(panel, btnLine, constraints, 0,2,2,1);

        //Create Rectangel button
        JButton btnRect = new JButton("Rectangle");
        btnRect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Rectangle";
            }
        });
        addToPanel(panel, btnRect, constraints, 0,3,2,1);

        //Create ellipse button
        JButton btnEllipse = new JButton("Ellipse");
        btnEllipse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Ellipse";
            }
        });
        addToPanel(panel, btnEllipse, constraints, 0,4,2,1);

        //Create polygon button
        JButton btnPolygon = new JButton("Polygon");
        btnPolygon.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape = "Polygon";
            }
        }));
        addToPanel(panel,btnPolygon, constraints,0,5,2,1);


        JButton undo = new JButton("undo");
        //UndoManager undoManager = new UndoManager();

        undo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Undo";
                GUI.objects.remove(GUI.objects.size()-1);
                System.out.println(GUI.objects.size());
                canvas.updateUI();
                canvas.repaint();
            }
        });
        addToPanel(toolPanel,undo,constraints,0,0,2,1);
        //Create fill button
        JButton btnFill = new JButton("Fillcolor");
        btnFill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "fill";
            }
        });
        addToPanel(toolPanel, btnFill, constraints, 0,1,2,1);

        //create move button
        JButton btnMove = new JButton("Move");
        btnMove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "move";
            }
        });
        addToPanel(toolPanel, btnMove, constraints, 0,2,2,1);

        //create delete button
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                shape = "Delete";
            }
        });
        addToPanel(toolPanel, btnDelete, constraints, 0,3,2,1);

        //create colour palette button
        JButton btnColourPalette = new JButton("Colour Palette");
        btnColourPalette.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //shape = "ChooseColor";
                new ColourPalette();
            }
        });
        addToPanel(toolPanel, btnColourPalette, constraints,0,4,2,1);

        //create panel containing colours
        JPanel pnlColour = new JPanel();
        pnlColour.setBackground(Color.LIGHT_GRAY);
        pnlColour.setSize(20, getHeight());
        canvas.add(pnlColour, BorderLayout.SOUTH);


        //add red to colour panel
        JButton btnRed = new JButton();
        btnRed.setText("Red");
        btnRed.setBackground(Color.RED);
        btnRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.RED;
            }
        });
        pnlColour.add(btnRed);

        //add blue to colour panel
        JButton btnBlue = new JButton();
        btnBlue.setText("Blue");
        btnBlue.setBackground(Color.BLUE);
        btnBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.BLUE;
            }
        });
        pnlColour.add(btnBlue);

        //add green to colour panel
        JButton btnGreen = new JButton();
        btnGreen.setText("Green");
        btnGreen.setBackground(Color.GREEN);
        btnGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.GREEN;
            }
        });
        pnlColour.add(btnGreen);

        //add purple to colour panel
        JButton btnPurple = new JButton();
        btnPurple.setText("Purple");
        btnPurple.setBackground(Color.MAGENTA);
        btnPurple.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.MAGENTA;
            }
        });
        pnlColour.add(btnPurple);

        //add gray to colour panel
        JButton btnGray = new JButton();
        btnGray.setText("Gray");
        btnGray.setBackground(Color.DARK_GRAY);
        btnGray.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.DARK_GRAY;
            }
        });
        pnlColour.add(btnGray);

        //add orange to colour panel
        JButton btnOrange = new JButton();
        btnOrange.setText("Orange");
        btnOrange.setBackground(Color.ORANGE);
        btnOrange.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.ORANGE;
            }
        });
        pnlColour.add(btnOrange);

        //add pink to colour panel
        JButton btnPink = new JButton();
        btnPink.setText("Pink");
        btnPink.setBackground(Color.PINK);
        btnPink.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.PINK;
            }
        });
        pnlColour.add(btnPink);

        //add yellow to colour panel
        JButton btnYellow = new JButton();
        btnYellow.setText("Yellow");
        btnYellow.setBackground(Color.YELLOW);
        btnYellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = Color.YELLOW;
            }
        });
        pnlColour.add(btnYellow);

        //Adding the canvas to the application
        canvas.add(new App(), BorderLayout.CENTER);
        validate();
    }
    private void addToPanel(JPanel jp, Component c,   GridBagConstraints constraints,int x,   int    y,   int    w,   int    h)   {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = w;
        constraints.gridheight = h;
        jp.add(c, constraints);
    }
}
