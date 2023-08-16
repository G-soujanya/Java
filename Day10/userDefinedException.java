import java.lang.*;
class stackOverflow extends Exception{
    public String toString()
    {
        return "size of stack if filled";
    }
}
class stackUnderflow extends Exception
{
    public String toString()
    {
        return "size of stack if empty";
    }
}
class stack
{
    private int size;
    private int s[];
    private int top=-1;
    public stack(int sz)
    {
        size=sz;
        s=new int[sz];
    }
    public void push(int x) throws stackOverflow
    {
        
        if(top==size-1)
            throw new stackOverflow();
        top++;
        s[top]=x;
    }
    public int pop() throws stackUnderflow
    {
        
        if(top==-1)
        throw new stackUnderflow();
        int x=-1;
        x=s[top];
        top--;
        return x;

    }
}
class userDefinedException 
{
    public static void main(String args[])
    {
        stack s=new stack(5);
        try{
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        //s.push(10);
        s.pop();
        }
         catch(stackOverflow sw)
         {
            System.out.println(sw);
         }
         catch(stackUnderflow sr)
         {
            System.out.println(sr);
         }

    }
}
