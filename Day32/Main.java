private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        if(Key==-1)
        {
            JOptionPane.showMessageDialog(this,"select the candidate to be deleted");
        }
        else
        {
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ElectionsDb","root","");
                String Query="Delete from CandidateTb where CId="+Key;
                Statement Del=Con.createStatement();
                Del.execute(Query);
                JOptionPane.showMessageDialog(this,"Candidate Delected successfully");
                DisplayCandidates();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }  
