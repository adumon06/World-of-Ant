
/**
 * Décrivez votre classe Character ici.
 *
 * @author G8
 * @version (un numéro de version ou une date)
 */
public class Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;

    /**
     * Constructeur d'objets de classe Character
     * Constructe the player and give it a name who is a string
     */
    public Character(String cName)
    {
        name = cName;
    }
    
    /**
     * return the name of the character
     * @return the name of the character who is a String
     */
    public String getName()
    {
        return name;
    }

}