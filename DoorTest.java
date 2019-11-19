
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DoorTest.
 *
 * @author
 * @version 13/11/2019
 */
public class DoorTest
{
     /**
     * The list of room contain the two rooms linked to a door. That will always be a list of 2 rooms, not less, not more.
     */
    private Room room1;
    private Room room2;
    private boolean locked;
    
    /**
     * A door can be linked to an only key which allow to open this one. Attribute a specific key to a door.
     */
    private Key key; 
    
    
    public DoorTest()
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
        room1 = new Room("cuisine");
        room2 = new Room("tunel");
        locked = false;
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


