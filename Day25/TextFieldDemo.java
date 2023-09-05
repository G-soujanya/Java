import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    TextField tf;
    Label l1;
    Label l2;
    public MyFrame()
    {
        super("TextField Demo");
        l1=new Label("no text is entered yet");
        l2=new Label("enter key is not hit");
        tf=new TextField(20);
        tf.setEchoChar('*');
        Handler h=new Handler();
        tf.addTextListener(h);
        tf.addActionListener(h);
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }
    class Handler implements TextListener,ActionListener
    {
        public void textValueChanged(TextEvent te)
    {
        l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent e)
    {
        l2.setText(tf.getText());
    }
    }
}
class TextFieldDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
