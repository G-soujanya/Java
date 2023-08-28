import java.io.*;
class FileHandling 
{
    public static void main(String args[]) throws Exception
    {
        File f=new File("./Data.txt");
        /*System.out.println(f.isDirectory());
        String[] li=f.list();
        File []lif=f.listFiles();
        for(String x:li)
        {
            System.out.println(x);
        }
        for(File x:lif)
        {
            System.out.print(x.getName());
            System.out.println(x.getPath());
            System.out.println(x.getParent());

        }*/ 
        //f.setReadOnly();
        f.setWritable(true);
        f.setLastModified(10);
        f.lastModified(); 
        FileOutputStream fos=new FileOutputStream(f, false);
    }    
}
