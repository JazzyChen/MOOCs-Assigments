package Lecture1Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */


public class BFS {

    private boolean[] visited;
    private int[] visitedList;
    private int[] shortestPath;

    private void setUp(Graph g,int s){
        this.visited = new boolean[g.V()];
        this.visitedList = new int[g.V()];
        this.shortestPath = new int[g.V()];
        BFS(g,s);
    }


    public int[] shortestPaths(Graph g,int s){

        setUp(g,s);
        return this.shortestPath;
    }

    public int[] visitedList(Graph g,int s){

        setUp(g, s);
        return this.visitedList;
    }


    private void BFS(Graph g,int s){

        ConcQueue<Integer> q =  new ConcQueue<Integer>();
        q.enqueue(s);
        visited[s] = true;

        while(!q.isEmpty()) {
            int v = q.dequeue();
            for(int w : g.adj(v)){
                 if(!visited[w]){
                     q.enqueue(w);
                     visited[w] = true;
                     visitedList[w] = v;
                 }
            }
        }

    }

    class  ConcQueue<T>{
        private final LinkedList<T> l;

        ConcQueue(){
            l = new LinkedList<T>();
        }

        public void enqueue(T v){
            l.addLast(v);
        }

        public T  dequeue(){
            return l.removeFirst();
        }

        public boolean isEmpty() {
            return l.isEmpty();
        }
    }

}
