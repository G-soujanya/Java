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
        super("GRIDLAYOUTDEMo");
        setLayout(new GridLayout(2, 3));
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
       b5=new Button("five");
        b6=new Button("six");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
class GridLayoutDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
