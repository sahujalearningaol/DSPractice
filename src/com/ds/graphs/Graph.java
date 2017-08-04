package com.ds.graphs;

import java.util.LinkedList;

/**
 * Created by sahuj6 on 7/27/17.
 */
public class Graph {
    private int[] vertexes;
    private LinkedList[] adj;

    public Graph(int numOfVertexes) {
        vertexes = new int[numOfVertexes];
        adj = new LinkedList[numOfVertexes];
        for(int i=0; i < numOfVertexes; i++) {
            vertexes[i] = i;
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    public int[] getVertexes() {
        return vertexes;
    }

    public void setVertexes(int[] vertexes) {
        this.vertexes = vertexes;
    }

    public LinkedList[] getAdj() {
        return adj;
    }

    public void setAdj(LinkedList[] adj) {
        this.adj = adj;
    }

    public LinkedList getAdjAtVertex(int v) {
        return adj[v];
    }
}
