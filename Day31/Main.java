// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinekdList ll=new LinekdList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(30);
        ll.addLast(40);
        System.out.println(ll.lastIndexOf(30));
        System.out.println(ll.getElementMiddle());
    }
}
class LinekdList
{
    private int size=0;
    private Node head;
    private Node tail;
    private class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void display()
    {
        if(head==null)
            throw new IllegalStateException();
        Node currentNode=head;
        while(currentNode!=tail.next)
        {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }
    public void addFirst(int value)
    {
        size++;
        Node node=new Node(value);
        if(head==null)
            head=tail=node;
        else
        {
            node.next=head;
            head=node;
        }
    }
    public void addLast(int value)
    {
        size++;
        Node node=new Node(value);
        if(head==null)
            head=tail=node;
        else
        {
            tail.next=node;
            tail=node;
        }
    }
    public void removeFirst()
    {
        if(head==null)
            throw new IllegalStateException();
        size--;
        Node tempNode=head;
        head=head.next;
        tempNode.next=null;
    }
    public int getSize()
    {
        int count=0;
        Node currentNode=head;
        while (currentNode!=null)
        {
            count++;
            currentNode=currentNode.next;
        }
        return count;
    }
    public int getSizeUsingSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public boolean contains(int value)
    {
        if(isEmpty())
            throw new IllegalStateException();
        Node currentNode=head;
        while (currentNode!=null)
        {
            if(currentNode.data==value)
                return true;
            currentNode=currentNode.next;
        }
        return false;
    }
    public int indexOf(int value)
    {
        if(isEmpty())
            throw new IllegalStateException();
        Node currentNode=head;
        int count=0;
        while (head!=null)
        {
            if(currentNode.data==value)
                return count;
            count++;
            currentNode=currentNode.next;
        }
        return -1;
    }
    public int valueOf(int index)
    {
        if(isEmpty() || index>=size)
            throw new IllegalStateException();
        int count=0;
        Node currentNode=head;
        while (currentNode!=null)
        {
            if(count==index)
                return currentNode.data;
            count++;
            currentNode=currentNode.next;
        }
        return -1;
    }
    public void removeLast()
    {
        if(isEmpty())
            throw new IllegalStateException();
        Node currentNode=head;
        while (currentNode.next!=tail)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=null;
        size--;
    }
    public void reverse()
    {

        Node currentNode=head;
        Node prev=null;
        while (currentNode!=null)
        {
            Node nextNode=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=nextNode;
        }
        tail=head;
        head=prev;
    }
    public int nextNode(int value)
    {
        if(!contains(value))
            throw new IllegalStateException();
        Node currentNode=head;
        while (currentNode.next!=null)
        {
            if(currentNode.data==value)
                return currentNode.next.data;
            currentNode=currentNode.next;
        }
        return -1;
    }
    public int prevNode(int value)
    {
        if(!contains(value))
            throw  new IllegalStateException();
        Node currentNode=head;
        while (currentNode.next!=null)
        {
            if(currentNode.next.data==value)
                return currentNode.data;
            currentNode=currentNode.next;
        }
        return -1;
    }
    public int getElement(int k)
    {
        int count=0;
        var currentNode=head;
        while (currentNode!=null)
        {
            if(count==k)
                return currentNode.data;
            currentNode=currentNode.next;
            count++;
        }
        return -1;
    }
    public int getElementReverse(int k)
    {
        int count1=getSize()-k;
        int count=0;
        var currentNode=head;
        while (currentNode!=null)
        {
            if(count==count1)
                return currentNode.data;
            currentNode=currentNode.next;
            count++;
        }
        return -1;
    }
    public int getElementMiddle()
    {
        int k=(getSize()-1)/2;
        return getElement(k);
    }
    public int nextNextNode(int value)
    {
        if(head==null)
            throw new IllegalStateException();
        var currentNode=head;
        while (currentNode.next.next!=null)
        {
            if(currentNode.data==value)
                return currentNode.next.next.data;
            currentNode=currentNode.next;
        }
        return -1;
    }
    public int prevPrevNode(int value)
    {
        if(head==null)
            throw new IllegalStateException();
        var cuurentNode=head;
        while (cuurentNode.next.next!=null)
        {
            if(cuurentNode.next.next.data==value)
                return cuurentNode.data;
            cuurentNode=cuurentNode.next;
        }
        return -1;
    }
    public void addMany(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            addLast(arr[i]);
        }
    }
    public void clear()
    {
        head=tail=null;

    }
    public void addManyFirst(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            addFirst(arr[i]);
        }
    }

    public int reverseKthElementWithoutSize(int k)
    {
        if(isEmpty())
            throw new IllegalStateException();
        var slow=head;
        var fast=head;
        int count=1;
        while (count!=k)
        {
            fast=fast.next;
            if(fast==null)
                throw new IllegalStateException();
            count++;
        }
        while (fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public int getMiddleEleWithoueSize()
    {
        var slow=head;
        var fast=head;
        while (fast.next.next!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public int lastIndexOf(int value)
    {
        if(!contains(value) || isEmpty())
            throw new IllegalStateException();
        int index=0;
        int start=0;
        var current=head;
        while (current!=null)
        {
            if(current.data==value)
                index=start;
            start++;
            current=current.next;
        }
        return index;
    }
    public void addAt(int index,int value)
    {
        var current=head;
        int count=0;
        if(index<0 || index>getSize())
            throw new IllegalStateException();

    }
}