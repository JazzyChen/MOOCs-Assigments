package Lecture1Graph;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */
public class DFS {

        private boolean[] visited;
        private int[] visitedList;

        public int[] DFSRec(Graph g, int s){
        this.visited = new boolean[g.V()];
        this.visitedList = new int[g.V()];
        DFSRec(g,s,0);
        return this.visitedList;
        }


        private void DFSRec(Graph g, Integer rootElem, int x){

           visited[rootElem] = true;
           visitedList[x] = rootElem;
           for(Integer i : g.adj(rootElem)) {
               if(!visited[i])DFSRec(g,i,x+1);

           }

        }

       public int[] DFSInt(Graph g, int s){
           this.visited = new boolean[g.V()];
           this.visitedList = new int[g.V()];
           DFSInt(g,s);
           return this.visitedList;
       }


       private void DFSInt(Graph g, Integer rootElem){

           Stack<Integer> stack =  new Stack<Integer>();
           stack.push(rootElem);
           int x = 0;
           visited[rootElem] = true;
           Integer currElem;
           while(!stack.isEmpty()){

               currElem = stack.pop();
               visitedList[x] = currElem;
               for(Integer i : g.adj(currElem)) {
                   if(!visited[i]){
                       visited[currElem] = true;
                       stack.push(i);
                   }
               }
               x++;

           }

       }



}
