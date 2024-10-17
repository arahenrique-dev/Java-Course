//Henrique Pires Aragão 21304445
public class Personne {
    public String nom ;
    private static int nbPersonnes;
    public static char lettre = 'A';

    public Personne() {
        nom = "Individu" + lettre;
        nbPersonnes++;
        lettre++;
    }
    public static int getNbPersonnes(){
        return nbPersonnes;
    }
    public String toString(){
        return nom;
    }
}
