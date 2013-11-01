package Lecture1Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
public class ConnectedComponentsTest {

    private Graph g;
    private int size;

    @Before
    public void setUp() throws Exception {


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
    public void testConneComp() throws Exception {

        ConnectedComponents cc = new ConnectedComponents();
        int[] id = cc.ConneComp(g);
        assert(id[0]==0);
        assert(id[1]==0);
        assert(id[2]==0);
        assert(id[3]==0);
        assert(id[4]==1);

    }
}
