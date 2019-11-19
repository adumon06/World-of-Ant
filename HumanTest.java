

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
        theHuman=new Human("Bob");
        thief = new StolenAnt("Bob");
    }
    @Test
    public void testNameInValid()
    {
        assertEquals(theHuman.getName(),"");
        
    }
    @Test
    public void testNameValid()
    {
        assertEquals(theHuman.getName(),"Bob");
        
    }
    @Test
    public void TestCrush()
    {   
        theHuman.crush(thief);
        assertEquals(thief.getVp(),75);
               
    }
    @Test
    public void TestCrushToDeath()
    {   
        theHuman.crush(thief);
        theHuman.crush(thief);  
        theHuman.crush(thief);
        theHuman.crush(thief);
        assertEquals(thief.getVp(),0);
        
        
    }
    @Test
    public void TestCrushBeyondDeath()
    {   
        theHuman.crush(thief);
        theHuman.crush(thief);  
        theHuman.crush(thief);
        theHuman.crush(thief);
        theHuman.crush(thief);
        
        assertEquals(thief.getVp(),0);
        
        //The Vp can not be a negative
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
