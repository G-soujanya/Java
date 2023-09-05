import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener
{
    Button b1,b2,b3;
    TextField tf1,tf2,tf3;
    Checkbox c1,c2;
    Panel p1; 
    Panel p2;
    Panel cp;
    Panel mainp;
    CardLayout cl;
    MyFrame()
    {
        super("CardLayoutDemo");
        CheckboxGroup cbg=new CheckboxGroup();
        c1=new Checkbox("one", true,cbg);
        c2=new Checkbox("two",false,cbg);
        c1.addItemListener(this);
        c2.addItemListener(this);
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        tf1=new TextField(20);
        tf2=new TextField(20);
        tf3=new TextField(20);
        cp=new Panel();
        cp.add(c1);
        cp.add(c2);
        p1=new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p2=new Panel();
        p2.add(tf1);
        p2.add(tf2);
        p2.add(tf3);
        mainp=new Panel();
        cl=new CardLayout();
        mainp.setLayout(cl);
        mainp.add("one",p1);
        mainp.add("two",p2);
        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);
        
    }
    @Override
    public void itemStateChanged(ItemEvent arg0) {
        if(c1.getState())
            cl.first(mainp);
        else 
            cl.last(mainp);
    }
}
class CardLayoutDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
