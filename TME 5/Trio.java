//Henrique Pires Aragão 21304445
public class Trio {
    public Personne[] trio;
    public int numero;
    private static int compteur;

    public Trio() {
        compteur++;
        numero = compteur;
        trio = new Personne[3];
        trio[0] = new Personne();
        trio[1] = new Personne();
        trio[2] = new Personne();
    }
    public static int getCompteur(){
        return compteur;
    }
    public String toString() {
        return "Trio " + numero + " : " + trio[0].toString() + " " + trio[1].toString() + " " + trio[2].toString();
    }
}
