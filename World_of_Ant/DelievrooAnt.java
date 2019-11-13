
/**
 * Décrivez votre classe Delievroo ici.
 *
 * @author G8
 * @version (un numéro de version ou une date)
 */
public class DelievrooAnt extends Player

{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int hp;

    /**
     * Constructeur d'objets de classe Delievroo
     * give the natural hp(honor point)
     */
    public DelievrooAnt(String dName)
    {
        super(dName);
        hp = 100;
    }

    /**
     * allow the delivery ant to hit the Stolen Ant
     */
    public void hitStolette()
    {
        // Insérez votre code ici
        
    }
    
    /**
     * modify the hp
     * cannot pass the hp bellow 0 or more that 100
     * @parameter thehp represent how much the delievroo ant will lose or gain hp
     */
    public void setHp(int thehp)
    {
        // Insérez votre code ici
        
    }  
    
    /**
     * return the hp
     * @return the hp of the stolen ant who is a integer
     */
    public int getHp()
    {
        // Insérez votre code ici
        return hp;
    } 
}
