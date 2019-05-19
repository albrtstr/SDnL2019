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
public class TreeNode {
    int element;
    TreeNode rightChild;
    TreeNode leftChild;

    public TreeNode(){
        
    }
    
    public TreeNode(int element) {
        this.element = element;
    }

    
    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }
    
    public void insert (int x){
        if (element > x) {
            if (leftChild == null) {
                leftChild = new TreeNode (element);
            }else{
                leftChild.insert(x);
            }
        }
    }
    
    public boolean isLeaf(){
        rightChild = leftChild = null;
        return false;
    }
    
    
    
}
