import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.*;
class MyFrame extends JFrame implements ActionListener
{
    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6;
    JTextArea ta;
    MyFrame()
    {
        super("tollbar demo");
        tb=new JToolBar();
        b1=new JButton("b1");
        b2=new JButton("b2");
        b3=new JButton("b3");
        b4=new JButton("b4");
        b5=new JButton("b5");
        b6=new JButton("b6");
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);
        ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        JMenuItem m1=new JMenuItem("save");
        JMenuItem m2=new JMenuItem("open");
        //m2.setMnemonic(KeyEvent.VK_o);
        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);
        b2.setActionCommand("open");
        b2.addActionListener(this);
        m2.addActionListener(this);
        b1.addActionListener(this);
        m1.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getActionCommand().equals("open")){
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        File f=fc.getSelectedFile();
        try{
            FileInputStream fi=new FileInputStream(f);
            byte[] b=new byte[fi.available()];
            fi.read(b);
            String str=new String(b);
            ta.setText(str);
            fi.close();
        }
        catch(Exception e){};}
        else 
        {
            Color col=JColorChooser.showDialog(this,"Font Color",Color.red);
            ta.setForeground(col);
        }
    }
}
class MenuTool 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }        
}
