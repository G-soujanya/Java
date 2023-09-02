import java.util.LinkedHashSet;

class LinkedHashSetDemo 
{
    public static void main(String args[])
    {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
        lhs.add("A");
        lhs.add("B");
        lhs.add("F");
        lhs.add("U");
        lhs.add("B");
        lhs.forEach(System.out::println);
    }    
}
