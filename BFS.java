package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    //BFS IMPLEMENTATION
    void BFS(int start){
        boolean[]visited = new boolean[v];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        System.out.println("BFS Traversal");
        visited[start] = true;
        while(q.isEmpty() == false){
            int node  = q.poll();
            System.out.print(node + " ");
            for(int i: graph.get(node)){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
  //END OF IMPLEMENTATION
  
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
//        g.DFS(0);
        System.out.println();
        g.BFS(0);
    }
}



