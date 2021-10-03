package graph;

import java.util.ArrayList;

class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int v;

    Graph(int nodes){
        v = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < v; i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdges(int v, int u){
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.print("Node " + i);
            for (int x : graph.get(i)) {
                System.out.print(" -> " + x);
            }
            System.out.println();
        }
    }
}

public class Graph1{
    public static void main(String[]args){
        Graph g = new Graph(5);
        g.addEdges(0,1);
        g.addEdges(3,2);
        g.addEdges(2,4);
        g.addEdges(1,4);
        g.addEdges(3,1);
        g.addEdges(2,0);
        g.printGraph();
    }
}


