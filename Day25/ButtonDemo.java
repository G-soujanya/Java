import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
    int count=0;
    Label l;
    Button b;
    public MyFrame()
    {
        super("Button Demo");
        l=new Label("  "+count);
        b=new Button("Click");
        b.addActionListener(this);//register itself with component which generate action
        setLayout(new FlowLayout());
        add(l);
        add(b);
        setSize(300, 300);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText(""+count);
    }
}
class ButtonDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
    }    
}
