import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice c;
    TextArea ta;
    MyFrame()
    {
        super("ListBox Demo");
        l=new List(4,true);//4 no of rows will be shown what ever the size may true means multiple items can be selected false means only one item
        c=new Choice();
        ta=new TextArea(20,30);//20lines and 30 alpabet in each line
        l.add("Monday");//monday will be added as a list item 
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        c.add("January");
        c.add("feb");
        c.add("march");
        c.add("april");
        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
        l.addActionListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        //if(ie.getsource) give reference of a compounent which generated this event ie.getsource==l means it is a list box
        if(ie.getSource()==l)
            ta.setText(l.getSelectedItem());
        else 
            ta.setText(c.getSelectedItem());

    }
    public void actionPerformed(ActionEvent ae) {//all selectec from list in textarea
        String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list)
            txt+=x+"\n";
        ta.setText(txt);
    }
}
class ListBoxDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
