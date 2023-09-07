import java.awt.BorderLayout;
import java.io.File;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
class MyFrame extends JFrame implements TreeSelectionListener
{
    JLabel label1;
    MyFrame()
    {
        
        super("Tree Demo");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("./pro");
        File f=new File("./pro");
        for(File x:f.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles())
                {
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else 
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        JTree tree=new JTree(root);
        label1=new JLabel("Nofiles Selected");
        tree.addTreeSelectionListener(this);
        JScrollPane sp=new JScrollPane(tree);
        add(sp,BorderLayout.CENTER);
        add(label1,BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent arg0) {
        label1.setText(arg0.getPath().toString());
    }

    
}
class TreeDemo 
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
