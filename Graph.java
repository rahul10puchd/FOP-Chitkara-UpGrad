package com.upgrad.graph;

import java.util.LinkedList;

public class Graph {
    private int vertex;
    private LinkedList<Integer> adjacentEdges[];
    Graph(int v){
        vertex=v;
        adjacentEdges=new LinkedList[v];
        for(int i=0;i<vertex;i++){
            adjacentEdges[i]= new LinkedList();
        }
    }
    void addEdge(int a,int b){
        adjacentEdges[a].add(b);
    }
    void ShowGraph(Graph g){
    //TODO: Assignment for today's class
        //you can do it as you like..no restriction
    }

    public static void main(String[] args) {
        Graph city= new Graph(3);
        city.addEdge(1,2);
        city.addEdge(0,2);
        city.addEdge(2,0);
        city.addEdge(2,2);
    }

}
