public class DynamicArray {
    int arr[];
    public DynamicArray()
    {
        arr=new int[5];
    }
    int count=0;
    public void add(int value)
    {
        if(count!= arr.length)
            arr[count]=value;
        else
        {
            arr=increaseArrayLen(arr);
            arr[count]=value;
        }
        count++;
    }
    private int[] increaseArrayLen(int arr[])
    {
        if(count==arr.length)
        {
            int[] arr1=new int[arr.length*2];
            for (int i = 0; i < count; i++) {
                arr1[i]=arr[i];
            }
            arr=arr1;
        }
        return arr;
    }
    public int length()
    {
        return count;
    }
    public int arrLen()
    {
        return arr.length;
    }
    public void display()
    {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void remove()
    {
        count--;
    }
    public void addBegin(int value)
    {
        if(count==0)
            arr[0]=value;
        else
        {
            arr=increaseArrayLen(arr);
            int arr1[]=new int[count+1];
            for (int i = 1; i <count+1;i++) {
                arr1[i]=arr[i-1];
            }
            arr1[0]=value;
            arr=arr1;
        }
        count++;
    }
    public void sort()
    {
        for (int i = 0; i < count; i++) {
            int min=arr[i];
            int minIndex=i;
            for (int j = i+1; j < count; j++) {
               if(min>arr[j])
               {
                   min=arr[j];
                   minIndex=j;
               }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public void subArray(int begin)
    {
        System.out.print("[");
        for (int i = begin; i <count ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("]");
    }
    public void subArray(int begin,int end)
    {
        System.out.print("[");
        for (int i = begin; i <=end; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("]");
    }
    public void removeAtBegin()
    {
        for (int i = 1; i <count ; i++) {
            arr[i-1]=arr[i];
        }
        arr[count-1]=0;
        count--;
    }
    public void addAtSpecific(int index,int value)
    {
        if(index<0)
            throw new IllegalStateException();
        arr=increaseArrayLen(arr);

        for (int i = count; i>=0; i--) {
            if(i>index)
                arr[i]=arr[i-1];

        }
        arr[index]=value;

        count++;
    }
    public void intersection(int []arr1)
    {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr[i]==arr1[j])
                    System.out.println(arr[i]);
            }
        }
    }
}
