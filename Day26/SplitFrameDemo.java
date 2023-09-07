import java.awt.Color;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
class MyFrame extends JFrame implements ListSelectionListener
{
    JSplitPane sp;
    JList list;
    JLabel lbl;
    MyFrame()
    {
        super("Split Demo");
        String cols[]={"RED","GREEN","YELLOW","MAGENTA","ORANGE","BLACK"};
        list=new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1=new JScrollPane(list);
        lbl=new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.RED);
        JScrollPane p2=new JScrollPane(lbl);
        //sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        //sp.setDividerLocation(200);
        //add(sp);
        JTabbedPane tp=new JTabbedPane();
        tp.addTab("Colors",p1);
        tp.addTab("label",p2);
        add(tp);
    }
    @Override
    public void valueChanged(ListSelectionEvent arg0) {
        String str=(String)list.getSelectedValue();
        switch(str)
        {
            case "RED":
                lbl.setBackground(Color.red);
                break;
            case "GREEN":
                lbl.setBackground(Color.green);
                break;
            case "YELLOW":
                lbl.setBackground(Color.yellow);
                break;
            case "MAGENTA":
                lbl.setBackground(Color.magenta);
                break;
            case "ORANGE":
                lbl.setBackground(Color.orange);
                break;
            case "BLACK":
                lbl.setBackground(Color.black);
                break;
            
        }
    }
}
class SplitFrameDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
