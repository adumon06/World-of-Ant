

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CharacterTest.
 *
 * @author  Crouzet G8
 * @version (a version number or a date)
 */
public class CharacterTest
{   
    Character charac;
    /**
     * Default constructor for test class CharacterTest
     */
    public CharacterTest()
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
        charac=new Character("");
    }
    @Test
    public void testNameInValid()
    {
        assertEquals(charac.getName(),"test");
    }
    @Test
    public void testNameValid()
    {
        assertEquals(charac.getName(),"");
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
