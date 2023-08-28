import java.io.*;
import java.util.*;
class Customer implements Serializable
{
    String custID;
    String name;
    String phno;
    static int data;
    Customer(){};
    Customer(String n,String p){
        custID="c"+data;
        data++;
        name=n;
        phno=p; 
    }
}
class CustomerSerialize 
{
    public static void main(String args[]) throws Exception
    {
        /*Customer[] c={new Customer("soujanya", "02349034"),new Customer("suguna", "7834254")};
        FileOutputStream fos=new FileOutputStream("./cust.txt");
        ObjectOutputStream dos=new ObjectOutputStream(fos);
        int length=c.length;
        dos.writeInt(length);
        for(int i=0;i<length;i++)
            dos.writeObject(c[i]);
        dos.close();
        fos.close();*/
        FileInputStream fis=new FileInputStream("cust.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int len=ois.readInt();
        Customer[] c=new Customer[len];
        for(int i=0;i<len;i++)
        {
            c[i]=(Customer)ois.readObject();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name");
        String name1;
        name1=sc.nextLine();
        for(int i=0;i<len;i++)
        {
            if((name1).equalsIgnoreCase(c[i].name))
            {
                System.out.println(c[i].custID+" "+c[i].name+" "+c[i].phno);
            }
        }
        ois.close();
        fis.close();
    }
}
