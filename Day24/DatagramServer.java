import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class DatagramServer 
{
    public static void main(String args[]) throws Exception
    {
        DatagramSocket ds=new DatagramSocket(2000);
        //receiving
        DatagramPacket dp;
        byte b[]=new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        //reversing
        String msg;
        msg=new String(dp.getData()).trim();
        System.out.print("From client "+msg);
        StringBuilder sb=new StringBuilder(msg);
        sb.reverse();
        msg=sb.toString();
        //sending
        dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
        ds.send(dp);
        
        
        ds.close();
    }
}
