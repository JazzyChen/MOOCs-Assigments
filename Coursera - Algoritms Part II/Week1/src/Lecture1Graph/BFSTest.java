package Lecture1Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 16:09
 * To change this template use File | Settings | File Templates.
 */
public class BFSTest {

    private Graph g;
    private int size;
    private BFS bfs;

    @Before
    public void setUp() throws Exception {

        bfs = new BFS();
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
        bfs = null;

    }

   @Test
    public void testShortestPaths() throws Exception {

        int[] sp = bfs.shortestPaths(g,0);

        assert (sp[0]==0);
        assert (sp[1]==1);
        assert (sp[2]==1);
        assert (sp[3]==2);
        assert (sp[4]==0);

    }

    @Test
    public void testVisitedList() throws Exception {

        int[] connectComp = bfs.visitedList(g,0);
        for(int i : connectComp)assert (i!=4);

    }
}
