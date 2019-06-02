package paint;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class SaveFile extends JFrame {
    public SaveFile(){
        JFileChooser saveFile = new JFileChooser();
        saveFile.addChoosableFileFilter(new VECFileFilter());
        int sf = saveFile.showSaveDialog(saveFile);
        if(sf == JFileChooser.APPROVE_OPTION){
            String ext = "";
            String extension = saveFile.getFileFilter().getDescription();
             if(extension.equals("*.VEC")||extension.equals("*.vec")){
                ext = ".VEC";
                try{
                    FileOutputStream fi = new FileOutputStream(saveFile.getSelectedFile() + ext);
                    OutputStreamWriter out = new OutputStreamWriter(fi);
                    BufferedWriter b = new BufferedWriter(out);
                    for(int i = 0; i<GUI.objects.size(); i++)
                    {
                        Paint pt = GUI.objects.get(i);
                        if (i == 0) {
                            pt.writetoFile(b, Color.BLACK, null);
                        } else {
                            Paint prevPt = GUI.objects.get(i-1);
                            pt.writetoFile(b, prevPt.getLineColor(), prevPt.getColor());
                        }
                        b.newLine();
                    }
                    b.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
