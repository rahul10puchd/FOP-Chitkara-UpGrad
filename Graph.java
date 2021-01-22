package com.upgrad.graph;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

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
    //BSF of a graph from given Source
    void BFS(int source){
        boolean visited[]=new boolean[vertex];
        //queue for handling the nodes of Adjancey lists
        LinkedList<Integer> queue= new LinkedList<Integer>();
        visited[source]=true;
        queue.add(source);
        int remove=0;
        while(queue.size()>0){
            remove=queue.poll();
            System.out.print(remove+" ");
            Iterator<Integer> i=adjacentEdges[remove].listIterator();
            while(i.hasNext()){
                int temp=i.next();
                if(visited[temp]==false){
                    visited[temp]=true;
                    queue.add(temp);
                }
            }
        }
    }
    void DFS(int source){
        Vector<Boolean> visited= new Vector<Boolean>(vertex);
         for(int i=0;i<vertex;i++){
             visited.add(false);
         }
        Stack<Integer> stack= new Stack<>();
         stack.push(source);
         int temp=0;
         while(stack.empty()==false){
             temp=stack.peek();
             stack.pop();
             if(visited.get(temp)==false){
                 System.out.print(temp+" ");
                 visited.set(temp,true);
             }
             Iterator<Integer> i=adjacentEdges[temp].iterator();
             while(i.hasNext()){
                 int connected=i.next();
                 if(visited.get(connected)==false){
                     stack.push(connected);
                 }
             }
         }
    }

    public static void main(String[] args) {
        Graph city= new Graph(5);
        city.addEdge(0,1);
        city.addEdge(1,0);
        city.addEdge(2,0);
        city.addEdge(0,2);

        city.addEdge(1,3);
        city.addEdge(3,1);

        city.addEdge(2,3);
        city.addEdge(3,2);

        city.addEdge(3,4);
        city.addEdge(4,3);

        city.BFS(1);
        System.out.println(" ");
        city.DFS(1);
    }

}
