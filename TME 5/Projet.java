//Henrique Pires Aragão 21304445
public class Projet {
    public String nom;
    public Trio t;
    private static int cpt;

    public Projet(String nom){
        this.nom = nom;
        t = new Trio();
        cpt++;
    }
    public static int getCompteur(){
        return cpt;
    }
    public String toString() {
        return "Projet " + nom + " " + t.toString();
    }
}
