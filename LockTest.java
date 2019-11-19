

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LockTest.
 *
 * @author  Crouzet G8
 * @version 19/11/2019
 */
public class LockTest
{
    Key thatKey;
    Lock aLock;
    /**
     * Default constructor for test class LockTest
     */
    public LockTest()
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
        thatKey = new Key("test");
        aLock  = new Lock(thatKey);
    }
    @Test
    public void testGetIsLockValid()
    {
        assertEquals(aLock.getIsLocked(),true);
        
    }
    @Test
    public void testGetIsLockInvalid()
    {
        assertEquals(aLock.getIsLocked(),false);
        
    }
    @Test
    public void testUnlockValid()//test if the unlock method change correctly the isLocked attribut
    {
        aLock.unlock(thatKey);
        assertEquals(aLock.getIsLocked(),false);
        
    }
    @Test
    public void testUnlockInvalid()//test if the unlock method change correctly the isLocked attribut
    {
        aLock.unlock(thatKey);
        assertEquals(aLock.getIsLocked(),true);
        
    }
    @Test
    public void testUnlockReturnValid()//test if the unlock method retrun the verification
    {
        
        assertEquals(aLock.unlock(thatKey),true);
        
    }
    @Test
    public void testUnlockReturnInvalid()//test if the unlock method retrun the verification
    {
        
        assertEquals(aLock.unlock(thatKey),false);
        
    }
    @Test
    public void testUnlockReturnOpen()//test if the unlock method retrun the verification
    {
        aLock.unlock(thatKey);
        assertEquals(aLock.unlock(thatKey),true);
        
    }
    @Test
    public void testUnlockReturnAlreadyOpenWithoutKey()//test if the unlock method retrun the verification
    {
        aLock.unlock(thatKey);
        assertEquals(aLock.unlock(null),true);
        
    }
    @Test
    public void testUnlockReturnCloseWithoutKey()//test if the unlock method retrun the verification
    {
        assertEquals(aLock.unlock(null),false);
        
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
