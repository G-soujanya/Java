public class MyData extends Thread{
    synchronized void display(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
            try{
                Thread.sleep(100);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
