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
    
    
    public void insert(int key) {
        if (key > getElement()) {
            if (getRightChild() == null) {
                setRightChild(new TreeNode(key));
            } else {
                getRightChild().insert(key);
            }
        } else {
            if (getLeftChild() == null) {
                setLeftChild(new TreeNode(key));
            } else {
                getLeftChild().insert(key);
            }
        }
    }
}
