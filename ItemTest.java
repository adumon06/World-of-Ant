

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test ItemTest.
 *
 * @AmbreDumontet
 * @13/11/2019
 * This is a class test for the Item class
 */
public class ItemTest
{
    
    Item item;

    /**
     * Default constructor of the test class ItemTest
     */
    public ItemTest()
    {
        
    }

    /**
     * Set up the test fixture
     * Called before every test case method
     */
     @Before
     public void setUp() 
    {
       item = new Item(""); 
    }
    
    /**
     * Tears down the text fixture
     * 
     * Called after every test case method
     */
    @After
    public void tearDown()
    {
    }
    

} 
   


