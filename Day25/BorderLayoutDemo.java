import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
{
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    MyFrame()
    {
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
       b5=new Button("five");
        b6=new Button("six");
        
        add(b1,BorderLayout.NORTH);
        //add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        Panel p=new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("MON"));
        p.add(new Button("TUE"));
        p.add(new Button("wed"));
        add(p,BorderLayout.EAST);
    }
}
class BorderLayoutDemo
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
