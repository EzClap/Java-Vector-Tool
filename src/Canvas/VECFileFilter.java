package paint;

import  java.io.File;

import javax.swing.filechooser.FileFilter;

public class VECFileFilter extends FileFilter
{
    public boolean accept(File f)
    {
        if (f.isDirectory())
        {
            return false;
        }
        String s = f.getName();
        return s.endsWith(".VEC");
    }
    public String getDescription()
    {
        return "*.VEC";
    }
}
