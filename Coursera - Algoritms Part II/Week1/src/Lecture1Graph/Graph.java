package Lecture1Graph;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */


import java.util.*;

public class Graph {

    private int v;
    private List<Integer>[] adj;

    Graph(int v){

       this.v = v;
       adj = (LinkedList<Integer>[]) new LinkedList[v];

       for(int i = 0; i<v;i++){
          adj[i] = new LinkedList<Integer>();

       }

    }



    void addEdge(int v, int w){

        adj[v].add(w);
        adj[w].add(v);

    }

    Iterable<Integer> adj(int v){

        return adj[v];

    }

    int V(){
       return adj.length;
    }

    int E(){
      int e = 0;

      for(List<Integer> edge : adj){
          e += edge.size();
      }
      return e/2;

    }

    boolean existsEdge(int v, int w){

        return adj[v].contains(w);

    }
    @Override
    public String toString() {
        return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
