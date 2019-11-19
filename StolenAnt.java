
/**
 * Décrivez votre classe Stolen ici.
 *
 * @author G8
 * @version (un numéro de version ou une date)
 */
public class StolenAnt extends Player
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int vp;

    /**
     * Constructeur d'objets de classe StolenAnt
     * give the natural vp(vital point)
     */
    public StolenAnt(String sName)
    {
        super(sName);
        vp = 100;
    }

    /**
     * modify the vp
     * cannot pass the vp bellow 0 or more that 100
     * @parameter thevp represent how much the stolen ant will lose or gain vp
     */
    public void setVp(int thevp)
    {
        // Insérez votre code ici
        
        
    }  
    
    /**
     * return the vp
     * @return the vp of the stolen ant who is a integer
     */
    public int getVp()
    {
        // Insérez votre code ici
        return vp;
    }
}
