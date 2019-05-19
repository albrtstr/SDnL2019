/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.BorderLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author admin
 */
public class Demo1 extends JApplet {
    JTree tree;
    JLabel jlab;
    
    @Override
    public void init(){
        try{
            SwingUtilities.invokeAndWait(
            new Runnable(){
                @Override
                public void run(){
                    makeGUI();
                }
            }
            );
        } catch(Exception exc){
            System.out.println("Can't create because of " + exc);
        }
    
    }
    
    private void makeGUI(){
        //Buat node pertama dari pohon
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
        
        //Buat subpohon dari A
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);
        
        //Buat subpohon dari B
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);
        DefaultMutableTreeNode b4 = new DefaultMutableTreeNode("test");
        b.add(b4);
        
        //Buat pohon
        tree = new JTree(top);
        
        //Tambah pohon ke scroll pane
        JScrollPane jap = new JScrollPane(tree);
        //Add the scroll pane to the content pane
        add(jap);
        
        //Add the label to the content pane
        jlab = new JLabel();
        add(jlab, BorderLayout.SOUTH);
        
        
        //Handle tree selection events
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                jlab.setText("Selection is " + e.getPath());
            }
        });
    }
}
