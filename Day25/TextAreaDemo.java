import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    MyFrame()
    {
        super("TextAreaDemo");
        l=new Label("No text entered");
        ta=new TextArea(10, 30);
        tf=new TextField(20);
        b=new Button("Click");
        setLayout(new FlowLayout());
        add(ta);
        add(tf);
        add(l);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        //l.setText(ta.getSelectedText());
        //ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());//second method return cursor position in textarea
    }
}
class TextAreaDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
