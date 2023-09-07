import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
class MyFrame extends JFrame 
{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    MyFrame()
    {
        l=new JLabel("filed");
        tf=new JTextField(10);
        b=new JButton("Ok");
        p=new JPanel();
        p.add(l);
        p.add(tf);
        p.add(b);
        Border b=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"login",TitledBorder.ABOVE_TOP,TitledBorder.CENTER);
        p.setBorder(b);
        setLayout(new FlowLayout());
        add(p);

    }
}
class BorderDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
