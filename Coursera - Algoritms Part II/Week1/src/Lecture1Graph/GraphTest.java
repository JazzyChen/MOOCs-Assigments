package Lecture1Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Joao
 * Date: 01/11/13
 * Time: 14:31
 * To change this template use File | Settings | File Templates.
 */
public class GraphTest {

    private Graph g;
    private int size;
    private int edge;

    @Before
    public void setUp() throws Exception {

       this.size = 10;
       this.edge = 3;
       g = new Graph(size);
       this.size--;
       g.addEdge(size,0);
       g.addEdge(size/2,size);
       g.addEdge(size,size);


    }

    @After
    public void tearDown() throws Exception {
      g = null;
    }

    @Test
    public void testAddEdge() throws Exception {

       assert(g.existsEdge(size/2,size));
       assert(g.existsEdge(size,0));
       assert(g.existsEdge(size,size));

    }

    @Test
    public void testAdj() throws Exception {



    }

    @Test
    public void testV() throws Exception {

        assert(g.V() == size+1);
    }

    @Test
    public void testE() throws Exception {
        assert(g.E() == 3);
    }

    @Test
    public void testToString() throws Exception {

    }
}
