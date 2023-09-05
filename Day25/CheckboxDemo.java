import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    public MyFrame()
    {
        super("Check Box Demo");
        l=new Label("Nothing is selected");
        cbg=new CheckboxGroup();
        c1=new Checkbox("java",false,cbg);//to make check box as radio button here false is initial state here we have give check box group to which it belongs
        c2=new Checkbox("python",false,cbg);
        c3=new Checkbox("C#",false,cbg);
        c1.addItemListener(this);//listenter must register with checkbox such that when check box is clicked it will infrom the listener
        c2.addItemListener(this);//when all three given as true then third will be selected when second one selected first get de selected like that
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    //single method in itemeventlistener
    public void itemStateChanged(ItemEvent e) {
        /*e.getItem();//c1,c2,c3 as output 
        e.getItemSelectable();//selecteable or not 
        e.getStateChange();//whether it is selected or deselected*/
        String s="";
         if(c1.getState())
            s=s+" "+c1.getLabel();
        if(c2.getState())
            s=s+" "+c2.getLabel();
        if(c3.getState())
            s=s+" "+c3.getLabel();
        if(s.isEmpty())
            s="Nothing is selected";
        l.setText(s);
    }
}
class CheckboxDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }    
}

