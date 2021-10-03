package graph;

import java.util.ArrayList;

class Graphs {
    ArrayList<ArrayList<Integer>> graph;
    int v;

    Graphs(int nodes){
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

    //START OF DFS IMPLEMENTATION
    void DFS(int start){
        boolean[] visited = new boolean[v];
        System.out.println("DFS TRAVERSAL IN AN ARRAY");
        dfsUtil(start, visited);
    }

    void dfsUtil(int node, boolean[] visited){
        visited[node] = true;
        System.out.print(node + " ");
        for(int x: graph.get(node)){
            if(visited[x] == false){
                dfsUtil(x, visited);
            }
        }
    }
    //END OF DFS IMPLEMENTATION

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

public class DFS{
    public static void main(String[]args){
        Graphs g = new Graphs(5);
        g.addEdges(0,1);
        g.addEdges(3,2);
        g.addEdges(2,4);
        g.addEdges(1,4);
        g.addEdges(3,1);
        g.addEdges(2,0);
        g.printGraph();
        g.DFS(0);
    }
}



