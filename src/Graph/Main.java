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
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        
        
        graph.addEdge('A', 'B', 50);
        graph.addEdge('A', 'I', 20);
        graph.addEdge('A', 'F', 60);
        graph.addEdge('B', 'C', 50);
        graph.addEdge('B', 'E', 30);
        graph.addEdge('C', 'E', 20);
        graph.addEdge('C', 'D', 20);
        graph.addEdge('D', 'H', 20);
        graph.addEdge('D', 'G', 30);
        graph.addEdge('G', 'E', 20);
        graph.addEdge('G', 'F', 60);
        
        graph.show();
        System.out.println();
        graph.dfs();
    }
}
