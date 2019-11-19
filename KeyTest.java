

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test KeyTest.
 *
 *@Ad
 *@
 */
public class KeyTest
{
    private Door door;
    private Key key;

    /**
     * Constructeur de la classe-test KeyTest
     */
    public KeyTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUpKey() // throws java.lang.Exception
    {
        key = new Key("");
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


