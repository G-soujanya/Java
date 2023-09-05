import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener,MouseMotionListener
{
    Label l;
    MyFrame()
    {
        super("mouseevent");
        l=new Label("");
        setLayout(null);
        l.setBounds(10,50,100,20);
        add(l);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent arg0) {
        l.setText("mouse dragged");
    }
    @Override
    public void mouseMoved(MouseEvent arg0) {
        l.setText("mouse moved");
    }
    @Override
    public void mouseClicked(MouseEvent arg0) {
        l.setText("mouseclicked");
    }
    @Override
    public void mouseEntered(MouseEvent arg0) {
        l.setText("mouse entered");
    }
    @Override
    public void mouseExited(MouseEvent arg0) {
        l.setText("mouse exited");
    }
    @Override
    public void mousePressed(MouseEvent arg0) {
        l.setText("mouse pressed");
    }
    @Override
    public void mouseReleased(MouseEvent arg0) {
        l.setText("mouse released");
    }
}
class MouseDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }    
}
