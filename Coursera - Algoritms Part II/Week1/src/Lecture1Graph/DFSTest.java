package Lecture1Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
public class DFSTest {

    private Graph g;
    private int size;
    private DFS dfs;
    @Before
    public void setUp() throws Exception {

        dfs = new DFS();
        this.size = 10;

        g = new Graph(size);
        this.size--;
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(1,0);

    }

    @After
    public void tearDown() throws Exception {
        g = null;
    }

    @Test
    public void testDFSRec() throws Exception {

         int[] connectComp = dfs.DFSRec(g,0);
         for(int i : connectComp)assert (i!=4);

    }

    @Test
    public void testDFSInt() throws Exception {
        int[] connectComp = dfs.DFSInt(g,0);
        for(int i : connectComp)assert (i!=4);
    }
}
