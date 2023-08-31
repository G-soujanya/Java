class student 
{
    int rollNum;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;
    public void setStudDetails(int r,int m1,int m2,int m3)
    {
        rollNum=r;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    public void calculateTotal()
    {
        totalMarks=mark1+mark2+mark3;
    }
    public void displayStudDetails()
    {
        System.out.println("roll number is"+rollNum);
        System.out.println("total marks"+totalMarks);
    }
}
class studentDeno
{
    public static void main(String args[])
    {
        student s=new student();
        s.setStudDetails(161, 1, 2, 3);
        s.calculateTotal();;
        s.displayStudDetails();
    }
}