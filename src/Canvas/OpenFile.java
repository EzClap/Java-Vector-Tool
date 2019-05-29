package Canvas;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class OpenFile extends JFrame {
    public static BufferedImage image;
    private BufferedReader br;
    public OpenFile() throws ClassNotFoundException{
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new VECFileFilter());
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            if(fc.getSelectedFile().getName().endsWith(".VEC")){
                try{
                    FileInputStream k = new FileInputStream(fc.getSelectedFile());
                    InputStreamReader in = new InputStreamReader(k);
                    br = new BufferedReader(in);
                    String t = br.readLine();
                    if(t==null)
                    {
                        System.out.println ("File wrong, try again please");
                    }
                    else
                    {
                        while(t != null){
                            String[] a = t.split(" ");
                            if(a[0].equals("Rectangle")){
                                Rectangle r = new Rectangle();
                                r.makeRectangle(Integer.parseInt(a[1].toString()), Integer.parseInt(a[2].toString()), Integer.parseInt(a[3].toString()), Integer.parseInt(a[4].toString()));
                                r.setLineColor(new Color(Integer.parseInt(a[5]), Integer.parseInt(a[6]), Integer.parseInt(a[7])));
                                if(a[8].equals("null")){
                                    r.setColor(null);
                                }else{
                                    r.setColor(new Color(Integer.parseInt(a[8]), Integer.parseInt(a[9]), Integer.parseInt(a[10])));
                                }
                                GUI.objects.add(r);
                                GUI.f.repaint();
                            }
                            else if(a[0].equals("Ellipse")){
                                Ellipse r = new Ellipse();
                                r.makeEllipse(Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]), Integer.parseInt(a[4]));
                                r.setLineColor(new Color(Integer.parseInt(a[5]), Integer.parseInt(a[6]), Integer.parseInt(a[7])));
                                if(a[8].equals("null")){
                                    r.setColor(null);
                                }else{
                                    r.setColor(new Color(Integer.parseInt(a[8]), Integer.parseInt(a[9]), Integer.parseInt(a[10])));
                                }
                                GUI.objects.add(r);
                                GUI.f.repaint();
                            }else if(a[0].equals("Plot")){
                                Plot r = new Plot();
                                r.setPoint(new Point(Integer.parseInt(a[1]), Integer.parseInt(a[2])));
                                r.setColor(new Color(Integer.parseInt(a[3]), Integer.parseInt(a[4]), Integer.parseInt(a[5])));
                                GUI.objects.add(r);
                                GUI.f.repaint();
                            }
                            t = br.readLine();
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
