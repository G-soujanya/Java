import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
class MyFrame extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;
    MyFrame()
    {
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        setLayout(null);
        l1.setBounds(30,20,100,20); 
        l2.setBounds(30,40,100,20); 
        l3.setBounds(30,70,100,20); 
        l4.setBounds(30,100,100,20); 
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        addKeyListener(this);

    }
    public void keyPressed(KeyEvent arg0) {
        l1.setText("Key Pressed");
        l2.setText("");
    }
    public void keyReleased(KeyEvent arg0) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    public void keyTyped(KeyEvent arg0) {
        l3.setText("Key Typed");
        l4.setText(new Date(arg0.getWhen())+"  ");
    }
}
class KeyDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
