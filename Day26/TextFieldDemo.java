import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
class MyFrame extends JFrame 
{
    MyFrame()
    {
        JTextField tf=new JTextField(15);
        DateFormat d=new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField tf1=new JFormattedTextField(d);
        tf1.setColumns(10);
        tf1.setValue(0);

        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft=new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(1000);
        JFormattedTextField tf2=new JFormattedTextField(nft);
        tf2.setColumns(15);
        tf2.setValue(0);
        setLayout(new FlowLayout());
        add(tf);
        add(tf1);   
        add(tf2);
    }
}
class TextFieldDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}