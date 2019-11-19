

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StolenAntTest.
 *
 * @author  Crouzet G8
 * @version (a version number or a date)
 */
public class StolenAntTest
{   
    StolenAnt thief;
    /**
     * Default constructor for test class StolenAntTest
     */
    public StolenAntTest()
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
        thief = new StolenAnt("");
    }
    
    @Test
    public void testSetVp()
    {
        
        //fail("Not yet implemented");
        thief.setVp(-50);
        assertEquals(thief.getVp(),50);
    }
    @Test
    public void testGetVp()
    {
        
        //fail("Not yet implemented");
        
        assertEquals(thief.getVp(),100);
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
