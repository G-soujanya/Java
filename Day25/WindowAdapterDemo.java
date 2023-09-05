import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    MyFrame()
    {
        super("window adapter");
        //addWindowListener(new windowadpter());
        addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        });
    }
    /*class windowadpter extends WindowAdapter //we can write this class outer also without any changes just by replacing it if it inner class then it useful only for outer class if it is outer class useful for many other classes
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }*/
}
class WindowAdapterDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
