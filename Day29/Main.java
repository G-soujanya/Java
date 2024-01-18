// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Thread{
//    public void run(){
//        int i=1;
//        while (true)
//        {
//            System.out.println(i+"Hello");
//            i++;
//        }
//    }
    public static void main(String[] args) {
//        byte b1=0b1010;
//        byte b2=012;
//        byte b3=0xA;
//        System.out.println(b1+" "+b2+" "+b3);
//        int x=5;
//        String binary=Integer.toBinaryString(x);
//        System.out.println(binary);
//        swapping(3,2);
//        printing(10,"rajesh",90.0f);
//        System.out.printf("%+5d",-9);
//        System.out.printf("%06.2f",13.45f);
//        System.out.printf("%-20s","java");
//        System.out.println("Java".compareTo("java"));
//        String str="ab";
//        System.out.println(str.matches("[abc]"));
//        String s[]={"hello","a","1"};
//        int sum=0;
//        for(String x:s)
//        {
//            if(x.matches("[0-9\\.]+"))
//                sum+=Double.parseDouble(x);
//
//        }
//        System.out.println(sum);
//        SingletonClass obj=SingletonClass.getInstance();
//        System.out.println(obj);
//        SingletonClass obj2=SingletonClass.getInstance();
//        System.out.println(obj2);
//        SingletonClass obj3=SingletonClass.getInstance();
//        System.out.println(obj3);
//        SingletonClass obj4=SingletonClass.getInstance();
//        System.out.println(obj4);
//        MultiThreading1 m=new MultiThreading1();
//        m.start();
//        int i=1;
//        while (true)
//        {
//            System.out.println(i+"world");
//            i++;
//        }
//        Main m=new Main();
//        m.start();
//        int i=1;
//        while (true)
//        {
//            System.out.println(i+"world");
//            i++;
//        }
//        MultiThreading2 m=new MultiThreading2();
//        Thread t=new Thread(m);
//        t.start();
//        int i=1;
//        while (true)
//        {
//            System.out.println(i+"world");
//            i++;
//        }
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);
//        Multi3 m=new Multi3("My thread");
//        System.out.println(m.getName());
//        Thread t=new Thread(new Multi4());
//        t.start();
//        Multi3 m=new Multi3("My thread");
//        m.start();
//        m.interrupt();
//        MyData d=new MyData();
//        MyThread1 t1=new MyThread1(d);
//        MyThread2 t2=new MyThread2(d);
//        t1.start();
//        t2.start();
//        AtmMachine a=new AtmMachine();
        Customer c=new Customer("soujanya",161);
        Customer c2=new Customer("suguna",162);
        c.start();
        c2.start();
    }
    public static void swapping(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("swapped values"+a+" "+b);
    }
    public static void printing(int a,String str,float c)
    {
        System.out.printf("%3$s %1$d %2$f ",a,c,str);
    }
}
