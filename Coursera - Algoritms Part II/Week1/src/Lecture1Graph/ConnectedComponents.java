package Lecture1Graph;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
public class ConnectedComponents {

    private boolean[] visited;
    private int[] id;
    private int count;

    public int[] ConneComp(Graph g){

        visited = new boolean[g.V()];
        id = new int[g.V()];

         for(int i = 0;i<g.V();i++){
             if(!visited[i]){
                 dfs(g,i);
                 count++;
             }
         }

        return id;

    }

    private void dfs(Graph g,int v){

        visited[v] = true;
        id[v] = count;

        for(int w:g.adj(v)){
            if(!visited[w])dfs(g,w);
        }
    }
}
