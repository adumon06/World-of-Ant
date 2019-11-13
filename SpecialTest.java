import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test SpecialTest.
 *
 * @Ad
 * @13/11/2019
 *
 */
public class SpecialTest
{
    // Variable of the SpecialTest class
    private int bonus;
    private Special spe;

    /**
     * Constructeur de la classe-test SpecialTest
     */
    public SpecialTest()
    {
    }

    /**
     * Set up the test fixture
     * Called before every test case method
     */
     @Before
     public void setUpSpecial() 
    {
       spe = new Special("");      
       
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
