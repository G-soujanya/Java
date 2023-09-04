import java.net.*;
import java.io.*;
class ReverseEcho extends Thread
{
    Socket stk;
    public ReverseEcho(Socket st)
    {
        stk=st;
    }

    public void run()
    {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        String msg;
        StringBuilder sb;
        do 
        {
            msg=br.readLine();
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            ps.println(msg);
        }while(!msg.equals("dne"));
        stk.close();
        }
        catch(Exception e)
        {
        
        };
    }
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        Socket stk;
        int count=1;
        ReverseEcho re;
        do{
        stk=ss.accept();
        System.out.println("client connected"+count++);
        re=new ReverseEcho(stk);
        re.start();
        }while(true);
    }
}