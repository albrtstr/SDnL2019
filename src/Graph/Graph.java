/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Stack;

/**
 *
 * @author admin
 */
public class Graph {
    private int maxVertex;
    private Vertex[] vertexList;
    private int[][] adjancencyMatrix;
    private int countVertex;

    public int getMaxVertex() {
        return maxVertex;
    }

    public void setMaxVertex(int maxVertex) {
        this.maxVertex = maxVertex;
    }

    public Vertex[] getVertexList() {
        return vertexList;
    }

    public void setVertexList(Vertex[] vertexList) {
        this.vertexList = vertexList;
    }

    public int[][] getAdjancencyMatrix() {
        return adjancencyMatrix;
    }

    public void setAdjancencyMatrix(int[][] adjancencyMatrix) {
        this.adjancencyMatrix = adjancencyMatrix;
    }

    public int getCountVertex() {
        return countVertex;
    }

    public void setCountVertex(int countVertex) {
        this.countVertex = countVertex;
    }
    
    public Graph(){
        maxVertex = 10;
        vertexList = new Vertex[maxVertex];
        adjancencyMatrix = new int[10][10];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    adjancencyMatrix[i][j] = 0;
                } else {
                    adjancencyMatrix[i][j] = -1;
                }
            }
        }
        countVertex = 0;
    }
    
    public void addVertex(char key){
        vertexList[countVertex++] = new Vertex(key);
    }
    
    public void addEdge(int x, int y, int z){
        adjancencyMatrix[x][y] = z;
        adjancencyMatrix[y][x] = z;
    }
    
    public void addEdge(char x, char y, int z){
        adjancencyMatrix[indexVertex(x)][indexVertex(y)] = z;
        adjancencyMatrix[indexVertex(y)][indexVertex(x)] = z;
    }
    
    private int indexVertex(char index){
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].label == index) {
                return i;
            }
        }
        return -1;
    }
    
    public void show(){
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjancencyMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public void dfs(){
        int seed = 0;
        Stack tumpukan = new Stack();
        tumpukan.push(vertexList[seed]);
        while (!tumpukan.isEmpty()) {
            Vertex vertex = (Vertex) tumpukan.pop();
            if (vertex.flagVisited == false) {
                System.out.print(vertex.label + " ");
                vertex.flagVisited = true;
                for (int i = countVertex -1; i >= 0; i--) {
                    if (adjancencyMatrix[indexVertex(vertex.label)][i] > 0) {
                        tumpukan.push(vertexList[i]);
                    }
                }
            }
        }
    }
    
    @Override
    public String toString(){
        return null;
    }
}
