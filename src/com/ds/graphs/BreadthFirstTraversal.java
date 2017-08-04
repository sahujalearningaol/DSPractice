package com.ds.graphs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by sahuj6 on 7/27/17.
 */
public class BreadthFirstTraversal extends Graph {
    public BreadthFirstTraversal(int vertexes) {
        super(vertexes);
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[getVertexes().length];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(startVertex);
        visited[startVertex] = true;

        while(queue.size() != 0) {
            int vertex = queue.poll();
            System.out.println("Vertex : " + vertex);
            Iterator<Integer> itr = getAdj()[vertex].listIterator();

            while(itr.hasNext()) {
                int n = itr.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstTraversal g = new BreadthFirstTraversal(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 0)");

        g.BFS(0);
    }
}
