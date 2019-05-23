package Application;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener, Runnable{
    public static String shape = "";
    public static Color selectedColour = Color.BLACK;
    public static ArrayList<Paint> app = new ArrayList<Paint>();
    private JPanel pnlCanvas, pnlTools, pnlColours;
    private JButton btnPlot, btnLine, btnRectangle, btnEllipse, btnPolygon;

    public GUI(String title) throws HeadlessException {
        super(title);
    }

    private void createGUI() {
        setSize(900, 600);
        setLayout(new BorderLayout());
        this.setJMenuBar(createMenuBar());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pnlCanvas = new JPanel();
        pnlCanvas.setBorder(new EmptyBorder(3, 3, 3, 3));
        pnlCanvas.setLayout(new BorderLayout(0, 0));
        pnlCanvas.setBackground(Color.WHITE);
        setContentPane(pnlCanvas);
        createToolPanel();
        createColourPanel();
    }

    private void createToolPanel(){
        pnlTools = createPanel(Color.LIGHT_GRAY);
        btnPlot = createButton("Plot");
        btnLine = createButton("Line");
        btnRectangle = createButton("Rectangle");
        btnEllipse = createButton("Ellipse");
        btnPolygon = createButton("Polygon");



        getContentPane().add(pnlTools,BorderLayout.WEST);
        GridBagLayout layout = new GridBagLayout();
        pnlTools.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.weightx = 100;
        constraints.weighty = 100;
        addToPanel(pnlTools, btnPlot,constraints,0,1,2,1);
        addToPanel(pnlTools, btnLine,constraints,0,2,2,1);
        addToPanel(pnlTools, btnRectangle,constraints,0,3,2,1);
        addToPanel(pnlTools, btnEllipse,constraints,0,4,2,1);
        addToPanel(pnlTools, btnPolygon,constraints,0,5,2,1);
    }

    private void createColourPanel(){
        pnlColours = createPanel(Color.LIGHT_GRAY);
        getContentPane().add(pnlColours,BorderLayout.SOUTH);
        Dimension btnColourSize = new Dimension(50,30);

        JButton btnRed = new JButton();
        btnRed.setPreferredSize(btnColourSize);
        btnRed.setBackground(Color.RED);
        btnRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedColour = Color.RED;
            }
        });
        pnlColours.add(btnRed);

        JButton btnBlue = new JButton();
        btnBlue.setPreferredSize(btnColourSize);
        btnBlue.setBackground(Color.BLUE);
        btnBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedColour = Color.BLUE;
            }
        });
        pnlColours.add(btnBlue);

        JButton btnGreen = new JButton();
        btnGreen.setPreferredSize(btnColourSize);
        btnGreen.setBackground(Color.GREEN);
        btnGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedColour = Color.GREEN;
            }
        });
        pnlColours.add(btnGreen);

    }

    /***
     * Creates menu bar
     * @return the menu bar
     */
    public JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu mFile, mEdit, mHelp;
        JMenuItem miNew, miLoad, miSave;
        JRadioButtonMenuItem rPlot, rLine, rEllipse, rPolygon, rRectangle;

        mFile = new JMenu("File");
        menuBar.add(mFile);
            miNew = new JMenuItem("New",
                    new ImageIcon("images/newproject.png"));
//            miNew.addActionListener(new ActionListener(){
//                public void actionPerformed(ActionEvent a){
//                    shape = "";
//                    OpenFile.image = null;
//                    app.clear();
//                    repaint();
//                }
//            });
            mFile.add(miNew);

            miLoad = new JMenuItem("Load Project...");
                    //new ImageIcon("../images/load.png"));
            miLoad.setMnemonic(KeyEvent.VK_L);
            mFile.add(miLoad);

            miSave = new JMenuItem("Save Project");
                    //new ImageIcon("../images/load.png"));
            miSave.setMnemonic(KeyEvent.VK_S);
            mFile.add(miSave);



        //Build Edit menu in the menu bar.
        mEdit = new JMenu("Edit");
        mEdit.setMnemonic(KeyEvent.VK_E);
        mEdit.getAccessibleContext().setAccessibleDescription(
                "Edit Menu");
        menuBar.add(mEdit);
            ButtonGroup group = new ButtonGroup();
            rPlot = new JRadioButtonMenuItem("Plot");
            rPlot.setSelected(true);
            rPlot.setMnemonic(KeyEvent.VK_P);
            group.add(rPlot);
            mEdit.add(rPlot);

            rLine = new JRadioButtonMenuItem("Line");
            rLine.setMnemonic(KeyEvent.VK_L);
            group.add(rLine);
            mEdit.add(rLine);

            rRectangle = new JRadioButtonMenuItem("Rectangle");
            rRectangle.setMnemonic(KeyEvent.VK_R);
            group.add(rRectangle);
            mEdit.add(rRectangle);

            rEllipse = new JRadioButtonMenuItem("Ellipse");
            rEllipse.setMnemonic(KeyEvent.VK_E);
            group.add(rEllipse);
            mEdit.add(rEllipse);

            rPolygon = new JRadioButtonMenuItem("Polygon");
            rPolygon.setMnemonic(KeyEvent.VK_P);
            group.add(rPolygon);
            mEdit.add(rPolygon);

        mHelp = new JMenu("Help");
        mHelp.setMnemonic(KeyEvent.VK_H);
        mHelp.getAccessibleContext().setAccessibleDescription(
                "Help Menu");
        menuBar.add(mHelp);

        return menuBar;

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
        SwingUtilities.invokeLater(new GUI("Vector Design Tool"));

    }

}
