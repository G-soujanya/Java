import java.util.*;
import java.util.Map.*;
class MapDemo 
{
    public static void main(String args[])
    {
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        tm.put(4,"E");
        tm.get(4);
        //Entry<Integer,String> e=tm.firstEntry();
        //System.out.println(e.getValue()+" "+e.getKey());
        System.out.println(tm.get(4));
    }    
}
