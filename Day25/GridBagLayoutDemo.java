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
        super("GridBagLayout");
        GridBagLayout gb=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        setLayout(gb);
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
       b5=new Button("five");
        b6=new Button("six");
        gbc.gridx=1;
        gbc.gridy=1;
        add(b1,gbc);
        gbc.gridx=3;
        gbc.gridy=1;
        add(b2,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        add(b3,gbc);
        gbc.gridx=4;
        gbc.gridy=2;
        add(b4,gbc);
        gbc.gridx=2;
        gbc.gridy=3;
        add(b5,gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        add(b6,gbc);
    }
}
class GridBagLayoutDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
