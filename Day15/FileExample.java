import java.io.*;
class FileExample 
{
    public static void main(String args[]) throws Exception
    {
        /*try{
        FileOutputStream fos=new FileOutputStream("./t.txt");
        String s="Learn java programming";
        byte b[]=s.getBytes();*/
        /*for(byte x:b)
            fos.write(x);*/
        /*fos.write(s.getBytes());*/
        /*fos.write(b,6,s.length()-6);*/
        /*fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
        try(FileOutputStream fos=new FileOutputStream("./t1.txt"))
        {
            String s="Learn java programming";
            byte b[]=s.getBytes();
            fos.write(s.getBytes());
        }
    }
}