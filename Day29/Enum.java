class Main
{

        enum Dept{


            CS("john","block a"),IT("smith","block b"),CIVIL("srinivas","block c"),ECE("nivi","block d");
            String head;
            String location;
            private Dept(String head,String loc)
            {
                this.head=head;
                this.location=loc;
            }
            public String getHeadName()
            {
                return head;
            }
            public String getLocation()
            {
                return location;
            }

        }


    public static void main(String args[])
    {
        Dept d=Dept.CS;
        System.out.println(d.getHeadName());
    }

}
