import java.util.*;

class listDemo {
    static void show(int n)
    {
        if(n>30)
            System.out.println(n);
    }
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>(20);
        al.add(10);
        al.add(0, 5);
        ArrayList<Integer> al1 = new ArrayList<>(List.of(10, 20, 30, 40));
        al.addAll(al1);
        // for(Iterator<Integer> it=al.iterator();it.hasNext();)
        // System.out.print(it.next()+" ");
        // al.forEach((x)->System.out.println(x));
        /*
         * Iterator<Integer> it=al.iterator();
         * while(it.hasNext())
         * System.out.println(it.next());
         * 
         * ListIterator<Integer> it = al.listIterator();
         * while (it.hasNext())
         * System.out.println(it.next());
         
        al.forEach(System.out::println);*/
        al.forEach((n)->show(n));
        
    }
}