enum  Dept
{
    CS("j","a"),IT("jo","b"),CIVIL("joh","c"),ECE("john","d");
    String heead;
    String location;
    private Dept(String head,String loc)
    {
        this.heead=head;
        this.location=loc;
        System.out.println(this.name());
    }
    /*public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }*/
    public String headName()
    {
        return heead;
    }
    public String getLocation()
    {
        return location;
    }
}
class enumDemo 
{
    public static void main(String args[])
    {
        /*Dept d=Dept.CS;
        System.out.println(d.ordinal());//just like a index
        System.out.println(Dept.valueOf("IT"));//if matching give it as output if not matched then give error
        Dept list[]=Dept.values();//list will contain all the values of dept
        for(Dept x:list)
        {
            System.out.println(x);
        }*/
        /*Dept d=Dept.CIVIL;
        d.display();
        switch(d)
        {
            case CS:
                System.out.println("Head:cse");
                break;
            case CIVIL:
                System.out.println("Head:civil");
                break;
            case IT:
                System.out.println("Head:it");
                break;
            case ECE:
                System.out.println("Head:ece");
                break;
    
            
        }*/
        Dept d=Dept.CIVIL;
        System.out.println(d.headName());
    }    
}
