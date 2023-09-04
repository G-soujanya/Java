import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import javax.swing.text.Style;

class Client 
{
    public static void main(String args[]) throws Exception
    {
        Socket stk=new Socket("localhost",2000);
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        String msg;
        StringBuilder sb;
        do 
        {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From server"+msg);

        }while(!msg.equals("dne"));
        stk.close();
    }    
}
