

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RoomTest.
 *
 * @author  Angelique, Dylan
 * @version 13/11/2019
 */
public class RoomTest
{
    Room cuisine;
    
    /**
     * Default constructor for test class RoomTest
     */
    public RoomTest(String rDescription)
    {
        if(rDescription.equals(" ")) 
            fail();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        cuisine = new Room("Cuisine");
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
