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
public class Tree {
    private TreeNode root;
    private int size = 1;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
  
    private void preOrder(TreeNode localRoot){
        if (localRoot != null) {
            System.out.print(localRoot.getElement()+" ");
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());
        }
    }
    
    private void inOrder(TreeNode localRoot){
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            System.out.print(localRoot.getElement()+" ");
            inOrder(localRoot.getRightChild());
        }
    }
    
    private void postOrder(TreeNode localRoot){
        if (localRoot != null) {
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            System.out.print(localRoot.getElement()+ " ");
        }
    }
    
    public void helpPreOrder(){
        preOrder(root);
    }
    
    public void helpInOrder(){
        inOrder(root);
    }
    
    public void helpPostOrder(){
        postOrder(root);
    }
    
    public TreeNode getNode (int key){
        TreeNode bantu = root;
        while (bantu != null) {
            if (bantu.element == key) {
                return bantu;
            }else{
                if (bantu.element > key) {
                    bantu = bantu.leftChild;
                }else{
                    bantu = bantu.rightChild;
                }
            }
        }
        return null;
    }
    
    public void add(int x){
        TreeNode node = new TreeNode(x);
        if (root == null) {
            root = node;
        }else{
            getRoot().insert(x);
            size++;
        }
    }
}
