package paint;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import static java.awt.Color.BLACK;
import static java.awt.Color.decode;


/**
 * Openfile class controls how the vec files are read and drawn onto the canvas
 */
public class OpenFile extends JFrame {
    public static BufferedImage image;
    private BufferedReader br;

    /**
     * this openFile method will try to open the file and throw an error if it cannot. When it does success open a file
     * it will split up the data in the file and read it to adjust to line and fill colours and draw the shapes as a
     * ratio to the size of the canvas as all vector data points come in between 0 and 1, these data points are
     * multiplied by the canvas size to draw the file to fit the current size of the screen.
     * @throws ClassNotFoundException exception
     */
    public OpenFile() throws ClassNotFoundException{
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new VECFileFilter());
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
           if(fc.getSelectedFile().getName().endsWith(".VEC")||fc.getSelectedFile().getName().endsWith(".vec")){
                try{
                    FileInputStream k = new FileInputStream(fc.getSelectedFile());
                    InputStreamReader in = new InputStreamReader(k);
                    br = new BufferedReader(in);
                    String t = br.readLine();
                    Color lineColour = BLACK;
                    Color fillColour = null;
                    if(t==null)
                    {
                        System.out.println ("File wrong, try again please");
                    }
                    else
                    {
                        while(t != null){
                            //if pen decode the colour for linecolour
                            String[] a = t.split(" ");
                            if(a[0].equals("PEN")){
                                lineColour = decode(a[1]);
                            }
                            //if fill decode the colour for fillcolour
                            if(a[0].equals("FILL")){
                                if(a[1].equals("OFF")){
                                    fillColour = null;
                                } else{
                                    fillColour = decode(a[1]);
                                }
                            }
                            //if rectangle get the points and parse them into the makeobject method
                            if(a[0].equals("RECTANGLE")||a[0].equals("Rectangle")){
                                Rectangle r = new Rectangle();
                                r.makeObject(new Point((int)(Double.parseDouble(a[1])*GUI.canvas.getWidth()),
                                        (int)(Double.parseDouble(a[2])*GUI.canvas.getHeight())),
                                        new Point((int)(Double.parseDouble(a[3])*GUI.canvas.getWidth()),
                                                (int)(Double.parseDouble(a[4])*GUI.canvas.getHeight())));
                                r.setLineColor(lineColour);
                                r.setColor(fillColour);
                                GUI.objects.add(r);
                                System.out.println(GUI.canvas.getWidth());
                                System.out.println(GUI.canvas.getHeight());
                                //if polygon get the points and parse them into the makeobject method
                            } else if (a[0].equals("POLYGON")||a[0].equals("Polygon")){
                                Polygon r = new Polygon();
                                ArrayList <Integer> xpoints= new ArrayList<>();
                                ArrayList <Integer> ypoints = new ArrayList<>();
                                System.out.println(a.length);

                                for (int i = 1; i < a.length ; i=i+2){
                                    System.out.println(a.length);
                                    xpoints.add( (int)((Double.parseDouble(a[i]))*GUI.canvas.getWidth()));
                                }

                                for (int i = 2; i <= a.length-1 ; i=i+2){
                                    ypoints.add((int)((Double.parseDouble(a[i]))*GUI.canvas.getHeight()));

                                }
                                xpoints.add(xpoints.get(0));
                                ypoints.add(ypoints.get(0));
                                System.out.println(xpoints);
                                System.out.println(ypoints);
                                r.makeObject(xpoints,ypoints);
                                r.setLineColor(lineColour);
                                r.setColor(fillColour);
                                GUI.objects.add(r);
                                //if ellipse get the points and parse them into the makeobject method
                            } else if(a[0].equals("ELLIPSE")||a[0].equals("Ellipse")){
                                Ellipse r = new Ellipse();
                                r.makeObject(new Point((int)(Double.parseDouble(a[1])*GUI.canvas.getWidth()),
                                        (int)(Double.parseDouble(a[2])*GUI.canvas.getHeight())),
                                        new Point((int)(Double.parseDouble(a[3])*GUI.canvas.getWidth()),
                                                (int)(Double.parseDouble(a[4])*GUI.canvas.getHeight())));
                                r.setLineColor(lineColour);
                                r.setColor(fillColour);
                                GUI.objects.add(r);
                                //if plot get the points and parse them into the makeobject method
                            } else if(a[0].equals("PLOT")||a[0].equals("Plot")){
                                Plot r = new Plot();
                                r.setPoint(new Point((int)(Double.parseDouble(a[1])*GUI.canvas.getWidth()),
                                        (int)(Double.parseDouble(a[2])*GUI.canvas.getHeight())));
                                r.setColor(lineColour);
                                GUI.objects.add(r);
                                //if line get the points and parse them into the makeobject method
                            } else if(a[0].equals("LINE")||a[0].equals("Line")){
                                Line r = new Line();
                                r.makeObject(new Point((int)(Double.parseDouble(a[1])*GUI.canvas.getWidth()),
                                        (int)(Double.parseDouble(a[2])*GUI.canvas.getHeight())),
                                        new Point((int)(Double.parseDouble(a[3])*GUI.canvas.getWidth()),
                                                (int)(Double.parseDouble(a[4])*GUI.canvas.getHeight())));
                                r.setColor(lineColour);
                                GUI.objects.add(r);
                            }
                            t = br.readLine();
                            GUI.app.repaint();
                        }
                    }
                }
                catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
