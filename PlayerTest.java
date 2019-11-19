

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PlayerTest.
 *
 * @author  Crouzet G8
 * @version (a version number or a date)
 */
public class PlayerTest
{
    Player thePlayer;
    Item theitem;
    /**
     * Default constructor for test class PlayerTest
     */
    public PlayerTest()
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
        thePlayer = new Player("");
        theitem = new Item("drop");
    }
    @Test
    public void testNameInValid()
    {
        assertEquals(thePlayer.getName(),"invalid");
    }
    @Test
    public void testNameValid()
    {
        assertEquals(thePlayer.getName(),"");
    }
    @Test
    public void testMoveRoom()
    {
        thePlayer.moveRoom();
        fail("Not yet implemented");
        //assertEquals();
    }
    @Test
    public void testPickUp()
    {
        thePlayer.pickUp(theitem);
        fail("Not yet implemented");
        //assertEquals();
    }
    @Test
    public void testDrop()
    {
        thePlayer.drop("");
        fail("Not yet implemented");
        //assertEquals();
    }
    //private List<Item> bag;
    //private int sizeBag;
    @Test
    public void testGetSizeBag()
    {
        
        //fail("Not yet implemented");
        assertEquals(thePlayer.getSizeBag(),20);
    }
    @Test
    public void testGetBag()
    {
        
        //fail("Not yet implemented");
        assertEquals(thePlayer.getBag(),null);
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
