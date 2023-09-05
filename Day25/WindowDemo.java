import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener
{
    Label l;
    MyFrame()
    {
        l=new Label();
        setLayout(null);
        l.setBounds(30,40,100,100);
        add(l);
        addWindowListener(this);
    }
    @Override
    public void windowActivated(WindowEvent arg0) {
        l.setText("window activated");
    }
    @Override
    public void windowClosed(WindowEvent arg0) {
        l.setText("window closed");
        System.exit(0);
    }
    @Override
    public void windowClosing(WindowEvent arg0) {
        l.setText("window closing");
    }
    @Override
    public void windowDeactivated(WindowEvent arg0) {
        l.setText("window deactivated");
    }
    @Override
    public void windowDeiconified(WindowEvent arg0) {
        l.setText("window deiconfied");
    }
    @Override
    public void windowIconified(WindowEvent arg0) {
        l.setText("window conified");
    }
    @Override
    public void windowOpened(WindowEvent arg0) {
        l.setText("window opened");
    }
}
class WindowDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}
