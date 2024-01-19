public class GenericMyArray<T>{
    T a[]=(T[]) new Object[10];
    int length=0;
    public void append(T v)
    {
        a[length++]=v;
    }
    public void display()
    {
        for (int i = 0; i < length; i++) {
            System.out.println(a[i]);
        }
    }
}
