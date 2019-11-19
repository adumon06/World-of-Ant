

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class DeliveryTest
{
   
    private Room goal;
    private Delivery del;

    /**
     * Constructeur de la classe-test DeliverooTest
     */
    public DeliveryTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUpDel() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        del = new Delivery("");
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
