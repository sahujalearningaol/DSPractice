package com.ds.graphs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by sahuj6 on 7/27/17.
 */
public class DepthFirstTraversal extends Graph {
    public DepthFirstTraversal(int vertexes) {
        super(vertexes);
    }

    public void DFS(int startVertex, boolean[] visited) {
        visited[startVertex] = true;
        LinkedList edges = getAdjAtVertex(startVertex);
        Iterator<Integer> itr = edges.listIterator();

        while(itr.hasNext()) {
            int vertextConsidered = itr.next();
            if(!visited[vertextConsidered]) {

                System.out.println("Vertex Traversed: " + vertextConsidered);
                DFS(vertextConsidered, visited);
            }
        }
    }


    public static void main(String[] args) {
        DepthFirstTraversal g = new DepthFirstTraversal(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(2, new boolean[5]);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 0)");

        g.DFS(0, new boolean[5]);
    }
}
