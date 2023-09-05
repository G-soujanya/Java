import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;
    MyFrame()
    {
        super("menu demo");
        open=new MenuItem("open");
        save=new MenuItem("save");
        close=new MenuItem("close");
        closeall=new MenuItem("closeall");
        auto=new CheckboxMenuItem("autosave");
        file=new Menu("file");
        sub=new Menu("close");
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);
        sub.add(close);
        sub.add(closeall);
        MenuBar mb=new MenuBar();
        mb.add(file);
        setMenuBar(mb);//to set menubar
        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);
        open.addActionListener((ActionEvent ae)->tf.setText("open"));
        close.addActionListener((ActionEvent ae)->tf.setText("close"));
        save.addActionListener((ActionEvent ae)->tf.setText("save"));
        closeall.addActionListener((ActionEvent ae)->tf.setText("closeall"));
        auto.addItemListener((ItemEvent ie)->{
            if(auto.getState())
            tf.setText("auto on");
            else 
            tf.setText("wuto off");
        });
    }
}
class MenuDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
