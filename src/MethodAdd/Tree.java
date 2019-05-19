/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodAdd;

import java.util.Stack;


/**
 *
 * @author admin
 */
public class Tree {
    private TreeNode root;
    private int size = 1;
    private TreeNode parent;
    private TreeNode predecessor;

    public TreeNode getPredecessor(TreeNode key) {
        TreeNode bantu = key;
        if (bantu.leftChild == null) {
            return null;
        } else {
            bantu = bantu.leftChild;
            while (bantu.rightChild != null) {
                if (bantu.rightChild == null) {
                    return bantu;
                } else {
                    bantu = bantu.rightChild;
                }
            }
        }
        return bantu;
    }


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
    
    public void add(int x){
        if (root == null) {
            root = new TreeNode(x);
        }else{
            TreeNode bantu = root;
            while (bantu != null) {
                if (x < bantu.element) {
                     if (bantu.leftChild == null) {
                        bantu.leftChild = new TreeNode(x);
                        bantu = null;
                    } else{
                        bantu = bantu.leftChild;
                    }
                }else{
                    if (bantu.rightChild == null) {
                        bantu.rightChild = new TreeNode(x);
                        bantu = null;
                    }else{
                        bantu = bantu.rightChild;
                    }
                }
            }
        }
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
    
    public TreeNode getParent (int key){
        TreeNode bantu = root;
        TreeNode parent = null;
        while (bantu != null) {
            if (key == bantu.element) {
                return parent;
            } else if (key < bantu.element){
                parent = bantu;
                bantu = bantu.leftChild;
            } else {
                parent = bantu;
                bantu = bantu.rightChild;
            }
        }
        return null;
    }
    
    public TreeNode hapus01 (int key){
        TreeNode bantu = getNode(key);
        if (bantu == null) {
            return null;
        } else {
            if (bantu.element == root.element) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.rightChild == null) {
                    root = bantu.leftChild;
                } else if (bantu.leftChild == null) {
                    root = bantu.rightChild;
                }
            } else {
                parent = getParent(bantu.element);
                if (key < parent.element) {
                    if (bantu.isLeaf()) {
                        parent.leftChild = null;
                    } else if (bantu.rightChild == null) {
                        parent.leftChild = bantu.leftChild;
                    } else if (bantu.leftChild == null) {
                        parent.leftChild = bantu.rightChild;
                    }
                } else {
                    if (bantu.isLeaf()) {
                        parent.rightChild = null;
                    } else if (bantu.rightChild == null) {
                        parent.rightChild = bantu.leftChild;
                    } else if (bantu.leftChild == null) {
                        parent.rightChild = bantu.rightChild;
                    }
                }
                return bantu;
            }
        }
        return null;
    }
    
    public TreeNode hapus012 (int key){
        TreeNode bantu = getNode(key);
        if (bantu == null) {
            return null;
        } else {
            if (bantu.element == root.element) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.rightChild == null) {
                    root = bantu.leftChild;
                } else if (bantu.leftChild == null) {
                    root = bantu.rightChild;
                } else {
                    TreeNode predecessor = getPredecessor(bantu);
                    TreeNode parentPredecessor = getParent(key);
                    bantu.element = predecessor.element;
                    if (parentPredecessor != bantu) {
                        if (predecessor.leftChild != null) {
                            parentPredecessor.rightChild = predecessor.leftChild;
                        } else {
                            parentPredecessor.rightChild = null;
                        }
                    } else {
                        bantu.leftChild = predecessor.leftChild;
                    }
                    
                }
            } else {
                parent = getParent(bantu.element);
                if (key < parent.element) {
                    if (bantu.isLeaf()) {
                        parent.leftChild = null;
                    } else if (bantu.rightChild == null) {
                        parent.leftChild = bantu.leftChild;
                    } else if (bantu.leftChild == null) {
                        parent.leftChild = bantu.rightChild;
                    } else {
                        TreeNode predecessor = getPredecessor(bantu);
                        TreeNode parentPredecessor = getParent(key);
                        bantu.element = predecessor.element;
                        if (parentPredecessor != bantu) {
                            if (predecessor.leftChild != null) {
                                parentPredecessor.rightChild = predecessor.leftChild;
                            } else {
                                parentPredecessor.rightChild = null;;
                            }
                        } else {
                            bantu.leftChild = predecessor.leftChild;
                        }
                    }
                } else {
                    if (bantu.isLeaf()) {
                        parent.rightChild = null;
                    } else if (bantu.rightChild == null) {
                        parent.rightChild = bantu.leftChild;
                    } else if (bantu.leftChild == null) {
                        parent.rightChild = bantu.rightChild;
                    } else {
                        TreeNode predecessor = getPredecessor(bantu);
                        TreeNode parentPredecessor = getParent(key);
                        bantu.element = predecessor.element;
                        if (parentPredecessor != bantu) {
                            if (predecessor.leftChild != null) {
                                parentPredecessor.rightChild = predecessor.leftChild;
                            } else {
                                parentPredecessor.rightChild = null;
                            }
                        } else {
                            bantu.leftChild = predecessor.leftChild;
                        }
                    }
                }
                return bantu;
            }
        }
        return null;
    }

    public TreeNode hapus012Suc (int key){
        TreeNode bantu;
        bantu = getNode(key);
        if (bantu == null) {
            return null;
        } else {
            if (bantu.element == root.element) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.rightChild == null){
                    root = bantu.leftChild;
                }
            }
        }
        return null;
    }
    
    public void addExpressionInfix(String a){
        Stack<TreeNode> operand = new Stack();
        Stack<TreeNode> operator = new Stack();
        TreeNode akar, kanan, kiri;
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '(' || c == '-' || c == '*' || c == '/') {
                operator.push(new TreeNode(c));
            } else if (c == ')'){
                kanan = operand.pop();
                kiri = operand.pop();
                akar = operand.pop();
                operand.push(combine(akar, root, kiri));            }
        }
        
        char c=a.charAt(0);
        
        switch (c) {
            case '(':
                operator.push(new TreeNode(c));
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                operator.push(new TreeNode(c));
                break;
            default:
                operand.push(new TreeNode(c));
        }
    }
    
    public void addExpressionPrefix(String a){
        
    }
    
    public void addExpressionPostfix(String a){
        
    }
    
    private TreeNode combine(TreeNode operator, TreeNode nodeLeft, TreeNode nodeRight){
        operator.leftChild = nodeLeft;
        operator.rightChild = nodeRight;
        return operator;
    }
}
