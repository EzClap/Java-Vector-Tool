package paint;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * save file class controls how the vec files are saved and written into the folder selected
 */
public class SaveFile extends JFrame {
    /**
     * save file will save the file using the .vec extension type and use the writeToFile method that is declared
     * uniquely through each of the shapes classes
     */
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
                        pt.writetoFile(b);
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
