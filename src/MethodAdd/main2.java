/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MethodAdd;

/**
 *
 * @author ASUS
 */
public class main2 {
    public static void main(String[] args) {
        String y = "(a+(b-c))";
        Tree test = new Tree();
        test.addExpressionInfix(y);
        test.inOrder();
    }
}
