/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AddRecursive;

/**
 *
 * @author ASUS
 */
public class MainTree {
    public static void main(String[] args) {
        Tree test = new Tree();
        
        int[]data = {20, 15, 10, 4, 19, 50, 25, 30, 2, 5};
        for (int i = 0; i < data.length; i++) {
            test.add(data[i]);
        }
        
        System.out.print("Pre-Order Traversal  = ");
        test.helpPreOrder();
        System.out.println();
        System.out.print("In-Order Traversal   = ");
        test.helpInOrder();
        System.out.println();
        System.out.print("Post-Order Traversal = ");
        test.helpPostOrder();
        
        System.out.println("");
        TreeNode found = test.getNode(14);
        if (found != null) {
            System.out.println("Ketemu node key = "+ found.element);
        }else{
            System.out.println("Node key = "+found.element+"tidak ada");
        }
    }
}
