import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements ActionListener,ListSelectionListener,ChangeListener
{
    JComboBox cb;
    JList list;
    JSpinner sp1,sp2;
    JTextField tf;
    MyFrame()
    {
        super("Spinner Demo");
        String countries[]={"India","US","UK","Canada","Australia"};
        String months[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
        String days[]={"monday","tuesday","wednesday","thursday","friday","saturday"};
        cb=new JComboBox(countries);
        list=new JList(months);
        list.setVisibleRowCount(5);
        tf=new JTextField(15);
        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));//initial,minimum,maximum,increment
        sp2=new JSpinner(new SpinnerListModel(days));
        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);
        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        tf.setText((String)cb.getSelectedItem());
    }
    @Override
    public void valueChanged(ListSelectionEvent arg0) {
        tf.setText((String)list.getSelectedValue());
    }
    @Override
    public void stateChanged(ChangeEvent arg0) {
        if(arg0.getSource()==sp1)
        tf.setText(sp1.getValue()+"");
        else 
        tf.setText(sp2.getValue()+"");
    }
}
class ListComboBoxSpinner 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
