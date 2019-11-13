

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HumanTest.
 *
 * @author  Crouzet G8
 * @version (a version number or a date)
 */
public class HumanTest
{
    Human theHuman;
    StolenAnt thief;
    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
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
        theHuman=new Human();
    }
    @Test
    public void testNameInValid()
    {
        assertEquals(theHuman.getName(),"invalid");
    }
    @Test
    public void testNameValid()
    {
        assertEquals(theHuman.getName(),"");
    }
    @Test
    public void TestCrush()
    {   thief = new StolenAnt("");
        theHuman.crush(thief);
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
