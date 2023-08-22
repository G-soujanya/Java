class complex
{
    int real;
    int image;
    public complex(int r,int i)
    {
        real=r;
        image=i;
    }
    public void display()
    {
        System.out.println(real+"+i"+image);
    }
    public static complex add(complex c1,complex c2)
    {
        complex c3=new complex(0, 0);
        c3.real=c1.real+c2.real;
        c3.image=c1.image+c2.image;
        return c3;
    }
    public static void main(String args[])
    {
        complex c1=new complex(2,1);
        complex c2=new complex(3,4);
        complex c4;
        c4=add(c1,c2);
        c4.display();
    }
}