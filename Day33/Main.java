int VId;
    Statement St1=null;
    ResultSet Rs1=null;
    private void VCount()
    {
        try{
           St1=Con.createStatement();
           Rs1=St1.executeQuery("Select Max(VoteId) from VotesTbl");
           Rs1.next();
           VId=Rs1.getInt(1)+1;
        }
        catch(Exception Ex)
        {
            
        }
    }
    int VNumber;
    private void VCheck()
    {
        try{
           St1=Con.createStatement();
           Rs1=St1.executeQuery("select * from VotesTbl where VoterID="+VotingId);
           if(Rs1.next())
           {
               VNumber=1;
           }
           else 
           {
               VNumber=0;
           }
        }
        catch(Exception Ex)
        {
            JOptionPane.showMessageDialog(this, Ex);
        }
    }
