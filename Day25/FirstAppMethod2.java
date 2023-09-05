import java.awt.*;
class MyApp extends Frame
{
    Label l;
    TextField tf;
    Button b;
    public MyApp()
    {
        super("My App");//title of the frame.super means frames constructor will be called 
        setLayout(new FlowLayout());
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("Ok");
        add(l);
        add(tf);
        add(b);
        setSize(300, 300);
        setVisible(true);
    }
}
class FirstAppMethod2 
{
    public static void main(String args[])
    {
        MyApp f=new MyApp();
    }    
}
//there is one more method to create frame that creatinh frame wthin in main clas itself if you are developing small application then go for it
