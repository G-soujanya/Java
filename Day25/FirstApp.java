import java.awt.*;
class FirstApp 
{
    public static void main(String args[])
    {
        //creating frame object
        Frame f=new Frame("MY Firsr App");
        //setting frame so that elements size is not oveflowed
        f.setLayout((new FlowLayout()));
        //creating objects
        Button b=new Button("OK");
        Label l=new Label("NAME ");
        TextField tf=new TextField(20);
        //connecting objects to the frame
        f.add(l);
        f.add(tf);
        f.add(b);
        //setting size and making them visible
        f.setSize(300, 300);
        f.setVisible(true);
    }
}