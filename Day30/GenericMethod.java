import java.io.*;
public class Main
{

    public static void main(String []args)  {
        show(new String[]{"hi","hello"});
    }
    static <E> void show(E[] list)
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }
   
}


