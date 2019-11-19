

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DelievrooAntTest.
 *
 * @author Crouzet G8
 * @version (a version number or a date)
 */
public class DelievrooAntTest
{
    DelievrooAnt delive;
    /**
     * Default constructor for test class DelievrooAntTest
     */
    public DelievrooAntTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        delive = new DelievrooAnt("");
    }
    
    
    @Test
    public void testSetHp()
    {
        
        //fail("Not yet implemented");
        delive.setHp(-100);
        assertEquals(delive.getHp(),0);
    }
    @Test
    public void testGetHp()
    {
        
        //fail("Not yet implemented");
        
        assertEquals(delive.getHp(),100);
    }
    public void testhitStolette()
    {
        
        //fail("Not yet implemented");
        delive.hitStolette();
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
