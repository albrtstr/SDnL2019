/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodAdd;

/**
 *
 * @author admin
 */
public class mainTree {
    public static void main(String[] args) {
        Tree test = new Tree();
        
//        int[]data = {23, 19, 5, 45, 35, 42};
//        for (int i = 0; i < data.length; i++) {
//            test.add(data[i]);
//        }
        
        int[]data = {8, 6, 7, 3, 5, 1, 4, 15, 20, 10, 18, 19, 21};
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
        
        test.hapus012(6);
        System.out.println();
        System.out.print("Pre-Order Traversal  = ");
        test.helpPreOrder();
        System.out.println();
        System.out.print("In-Order Traversal   = ");
        test.helpInOrder();
        System.out.println();
        System.out.print("Post-Order Traversal = ");
        test.helpPostOrder();
        
        
        
//        System.out.println("");
//        TreeNode found = test.getNode(20);
//        if (found != null) {
//            System.out.println("Ketemu node key = "+ found.element);
//        }else{
//            System.out.println("Node key = "+found.element+"tidak ada");
//        }
    }
}
