/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prim;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        char[] data={'A','B','C','D','E','F','G','H','I','J'};
        for (int i = 0; i < data.length; i++) {
            graph.addVertex(data[i]);
        }
        
        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'C', 6);
        graph.addEdge('B', 'D', 4);
        graph.addEdge('B', 'E', 9);
        graph.addEdge('C', 'D', 4);
        graph.addEdge('C', 'F', 7);
        graph.addEdge('D', 'E', 8);
        graph.addEdge('D', 'F', 6);
        graph.addEdge('E', 'F', 10);
        graph.addEdge('E', 'G', 10);
        graph.addEdge('E', 'H', 8);
        graph.addEdge('E', 'I', 9);
        graph.addEdge('F', 'G', 3);
        graph.addEdge('G', 'H', 6);
        graph.addEdge('G', 'J', 7);
        graph.addEdge('H', 'I', 4);
        graph.addEdge('H', 'J', 6);
        graph.addEdge('I', 'J', 7);
        int total = 0;
        ArrayList<Edge> edges = graph.prim();
        for (Edge edge : edges) {
            System.out.println(edge);
            
        }
    }
}
