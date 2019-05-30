package paint;

import  java.io.File;

import javax.swing.filechooser.FileFilter;

/**
 * this class allows the user to select .vec as the file extension and filter looking for .vec extensions
 */
public class VECFileFilter extends FileFilter
{
    public boolean accept(File f)
    {
        if (f.isDirectory())
        {
            return false;
        }
        String s = f.getName();
        return s.endsWith(".VEC")||s.endsWith(".vec");
    }
    public String getDescription()
    {
        return "*.VEC";
    }
}
