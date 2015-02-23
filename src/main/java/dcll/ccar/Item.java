package dcll.ccar;

/**
 * Created by 20901927 on 13/02/2015.
 */
public class Item{

    private int nbr;
    private String nom;

    public Item(int nb,String nom){
        this.nbr = nb;
        this.nom = nom;
    }

    public int getNbr(){
        return nbr;
    }

    public String getNom(){
        return nom;
    }

}
