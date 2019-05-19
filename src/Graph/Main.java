/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        
        graph.addEdge('A', 'B', 20);
        graph.addEdge('A', 'C', 30);
        graph.addEdge('A', 'D', 40);
        graph.addEdge('A', 'E', 50);
        graph.addEdge('B', 'C', 60);
        graph.addEdge('C', 'D', 40);
        graph.addEdge('C', 'E', 40);
        
        graph.show();
        System.out.println();
        graph.dfs();
    }
}
