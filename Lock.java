/**
 * The Lock class describe if a door or a chest is locked and how to unlocked it.
 *
 * @author  @author  Crouzet G8
 * @version 19/11/2019
 */

public class Lock
{
    private Key myKey; //The key link needed to open the chest/door
    private boolean isLocked; //status of the door/chest =>open or close (close by default)
    
    public Lock(Key theKey)
    {
        myKey = theKey; //attribution of the key
        isLocked = true;
    }
    /**
     * @parameter aKey of type Key
     * if you give the correct key it will unlock the object
     * else return an error (boolean)
     * @return 
     * true => operation was done succesfluly and the door/chest is opened
     * false => operation failed and the door/chest is not opened
     **/
    
    public boolean unlock(Key aKey)
    {
        if(isLocked == true && aKey == myKey)
        {
            isLocked = false;
            return true;
        }
        else if(isLocked == true && aKey != myKey)
        {
            return false;
        }
        else if(isLocked == false)
        {
            return true;
        }
        else
            return false;
    }
    
    public boolean getIsLocked()
    {
        return isLocked;
    }
}

