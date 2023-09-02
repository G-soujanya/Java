import java.util.Enumeration;
import java.util.Hashtable;

class HashTableDemo 
{
    public static void main(String args[])
    {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"G");
        /*String s=(String)ht.get(3);
        Enumeration e=ht.keys();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());*/
        ht.computeIfAbsent(7, (k)->k+"z");
        System.out.println(ht);
    }
}
