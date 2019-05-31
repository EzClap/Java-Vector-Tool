package paint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.border.EmptyBorder;
//import javax.swing.undo.UndoManager;
import java.util.ArrayList;
import java.awt.event.MouseEvent;

/**
 *This class runs the program, and contains the 'objects' arraylist which contains all the shapes that are drawn,
 * as well as creating the Graphical user interface.
 *
 */
public class GUI extends JFrame {
    public static String shape = "Plot";
    public static Color colour = Color.BLACK;
    public static ArrayList<Paint> objects = new ArrayList<Paint>();
    public static JPanel canvas;
    public static JPanel window;
    public GridBagLayout layout = new GridBagLayout();
    public GridBagConstraints constraints = new GridBagConstraints();
    public static GUI app;

    /**
     * main method that creates a new instance of the 'GUI' and makes it visible.
     * @param args
     *
     */
    public static void main(String[] args)
    {
        app = new GUI();
        app.setVisible(true);
    }

    /**
     * A constructor of the GUI, contains set up and creation of the GUI
     *
     */
    public GUI() {
        createGUI();
    }

    /**
     * This method pulls together all the other methods in this class to create the GUI.
     *
     * Setting up the window for size to ensure users don't make it too small to operate.
     *
     * The window and canvas JPanel are created here, the window is assigned as the
     * content pane which hold everything that is visible, and the canvas panel will be
     * the panel that is drawn on, the app constructor is called on it to allow it to be
     * drawn on and contain the Action listeners.
     *
     * The constraints variable is initiated here which brings consistency visually for all the buttons
     *
     * Lastly, the other methods in this class are called to create their respective panels.
     *
     */
    public void createGUI(){
        //Setting up the display window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Vector Graphic Designer");
        setSize(900, 600);
        Dimension minSize = new Dimension(600,400);
        setMinimumSize(minSize);

        //Creates and sets up the 'window' this is set to the content pane, which will hold
        // everything that is displayed.
        window = new JPanel();
        window.setSize(450,450);
        window.setBorder(new EmptyBorder(0, 0, 0, 0));
        window.setLayout(new BorderLayout(0, 0));
        setContentPane(window);

        //Create the canvas. Being drawn on.
        canvas = new JPanel();
        canvas.setSize(450,450);
        canvas.setBounds(40,40,450,450);
        canvas.setBorder(new EmptyBorder(0, 0, 0, 0));
        canvas.setLayout(new BorderLayout(0, 0));
        canvas.setBackground(Color.white);
        window.add(canvas, BorderLayout.CENTER);

        //setting up constraints variable which will be used to create each button and make
        // them look the same, for visual consistency.
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.weightx = 100;
        constraints.weighty = 100;

        //calling the other methods to create their respective panels
        createMenu();
        createToolbar();
        createShapeButtons();
        createQuickColours();

        //calling a new instance of app onto canvas, this allows the canvas to be drawn on.
        canvas.add(new App());
        validate();
    }

    /**
     * This method creates the menu bar.
     * The menu bar contains a 'File' and 'About' menus.
     * File contains 'New' which creates a new blank canvas, 'Load' which load .VEC file into the canvas, 'Save' which
     * can save the masterpiece created, into a vec file. In the save and load windows it is advised to select '*.VEC'
     * in the file format option. 'Exit' exits tha application.
     * The About menu item brings up a window about us.
     *
     */
    private void createMenu(){
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        //Create 'New' menu item
        JMenuItem menuItemNew = new JMenuItem("New");
        menuItemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "";
                OpenFile.image = null;
                objects.clear();
                repaint();
            }
        });
        menuFile.add(menuItemNew);

        //Create 'Load' menu item
        JMenuItem menuItemLoad = new JMenuItem("Load");
        menuItemLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape ="Open";
                try {
                    objects.clear();
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
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "Save";
                new SaveFile();
            }
        });
        menuFile.add(menuItemSave);

        //Create 'Exit' menu item
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(new ActionListener() {
            @Override
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
    }

    /**
     * This method creates the buttons on the left hand side of the window which allow you to select which shape you
     * would like to draw with. The different options are plot, line, rectangle, ellipse, and polygon.
     * When a button is clicked the 'shape' varible declared publicly at the top of this class is set to the name of
     * the shape that has been clicked.
     *
     */
    private void createShapeButtons(){
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        panel.setBackground(Color.LIGHT_GRAY);
        window.add(panel, BorderLayout.WEST);
        //Create plot button
        JButton btnPoint = new JButton("Plot");
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "Plot";
            }
        });
        addToPanel(panel, btnPoint, constraints, 0,1,2,1);

        //Create Line button
        JButton btnLine = new JButton("Line");
        btnLine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "Line";
            }
        });
        addToPanel(panel, btnLine, constraints, 0,2,2,1);

        //Create Rectangel button
        JButton btnRect = new JButton("Rectangle");
        btnRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "Rectangle";
            }
        });
        addToPanel(panel, btnRect, constraints, 0,3,2,1);

        //Create ellipse button
        JButton btnEllipse = new JButton("Ellipse");
        btnEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "Ellipse";
            }
        });
        addToPanel(panel, btnEllipse, constraints, 0,5,2,1);

        //Create polygon button
        JButton btnPolygon = new JButton("Polygon");
        btnPolygon.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape = "Polygon";
            }
        }));
        addToPanel(panel,btnPolygon, constraints,0,6,2,1);

    }

    /**
     * This method creates the quick colour options at the bottom of the window. The purpose of this
     * buttons is to allow for easy access to some simple colour without having to select a colour
     * in the colour palette window. When a button is clicked the 'colour' variable declared at the
     * top of this class is set to the colour that has been pressed.
     *
     */
    private void createQuickColours(){
        //create panel containing colours
        JPanel pnlColour = new JPanel();
        pnlColour.setBackground(Color.LIGHT_GRAY);
        pnlColour.setSize(20, getHeight());
        window.add(pnlColour, BorderLayout.SOUTH);

        //add red to colour panel
        JButton btnRed = new JButton();
        btnRed.setText("Red");
        btnRed.setBackground(Color.RED);
        btnRed.addActionListener(new ActionListener() {
            @Override
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
            @Override
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
            @Override
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
            @Override
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
            @Override
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
            @Override
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
            @Override
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
            @Override
            public void actionPerformed(ActionEvent e) {
                colour = Color.YELLOW;
            }
        });
        pnlColour.add(btnYellow);
    }

    /**
     * This method create the tool bar on the right side of the window. This contains tools such as undo, fillcolour,
     * move, delete, and colour palette.
     * Undo removes the last object that was created, ideally this would need to remove the last action done, such as
     * changing a colour of moving an object, however this was not implemented.
     * Fillcolour will make then next object that is clicked fill with the current colour selected a colour can be
     * selected before or after choosing to fill
     * Move will enable the user to move any objects that are on the canvas
     * Delete will allow the user to delete any object that is clicked on
     * Colour Palette give the user a wide variety of colours that the user can select from, including alpha, a value
     * that sets the transparency of the object.
     */
    private void createToolbar(){
        JPanel toolPanel = new JPanel();
        toolPanel.setLayout(layout);
        toolPanel.setBackground(Color.LIGHT_GRAY);
        window.add(toolPanel, BorderLayout.EAST);

        JButton undo = new JButton("undo");
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {

                shape = "Undo";
                objects.remove(objects.size()-1);
                canvas.updateUI();
                canvas.repaint();
            }
        });
        addToPanel(toolPanel,undo,constraints,0,0,2,1);

        JComboBox undoHistory = new JComboBox();
        undoHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedUndo = undoHistory.getSelectedIndex();
                for (int i = undoHistory.getItemCount(); i > selectedUndo; i--){
                    undoHistory.remove(i);

                }
                objects.subList(selectedUndo, objects.size()).clear();
                canvas.repaint();
            }
        });
        addToPanel(toolPanel,undoHistory,constraints,2,0,2,1);

        //Create fill button
        JButton btnFill = new JButton("Fillcolor");
        btnFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "fill";
            }
        });
        addToPanel(toolPanel, btnFill, constraints, 0,1,2,1);

        //create move button
        JButton btnMove = new JButton("Move");
        btnMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "move";
            }
        });
        addToPanel(toolPanel, btnMove, constraints, 0,2,2,1);

        //create delete button
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                shape = "Delete";
            }
        });
        addToPanel(toolPanel, btnDelete, constraints, 0,3,2,1);

        //create colour palette button
        JButton btnColourPalette = new JButton("Colour Palette");
        btnColourPalette.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //shape = "ChooseColor";
                new ColourPalette();
            }
        });
        addToPanel(toolPanel, btnColourPalette, constraints,0,4,2,1);

    }


    /**
     * add to panel takes a component 'c' and add it to a JPanel 'jp' with chosen constraints, grid positions
     * and a width and height.
     *
     * @param jp the JPanel that the Component is going to be added to
     * @param c the component that will be added
     * @param constraints the constraint that the component will be set to
     * @param x the x position in the grid of the JPanel
     * @param y the y position in the grid of the JPanel
     * @param w the width of the component
     * @param h the height of the component
     *
     */
    private void addToPanel(JPanel jp, Component c,   GridBagConstraints constraints,int x,   int    y,   int    w,   int    h)   {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = w;
        constraints.gridheight = h;
        jp.add(c, constraints);
    }

//    public static void updateComboBox(){
//        undoHistory.addItem(shape);
//            undoHistory.addItem(objects.get(objects.size()-1).getClass().getSimpleName());
//    }
}
