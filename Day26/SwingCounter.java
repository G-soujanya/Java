import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b,b1;
    int count=0;
    MyFrame()
    {
        l=new JLabel("clicked"+count+"times");
        b=new JButton("Click");
        b1=new JButton("cancel");
        setLayout(new FlowLayout());
        add(l);
        add(b);
        add(b1);
        l.setToolTipText("counter");
        b.addActionListener(this);
        getRootPane().setDefaultButton(b);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        count++;
        l.setText("clicked"+count+"times");
    }
}
class SwingCounter 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
