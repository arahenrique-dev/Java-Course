//Henrique Pires Aragão 21304445
public class TestProjet {
    public static void main(String[] args) {
        System.out.println("N de Personnes : "+Personne.getNbPersonnes());
        
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("nbPersonnes="+Personne.getNbPersonnes());

        Projet projet1 = new Projet("P3X-774");
        Projet projet2 = new Projet("P3R-233");
        System.out.println(projet1.toString());
        System.out.println(projet2.toString());

        System.out.println("NbPersonnes="+Personne.getNbPersonnes());
        System.out.println("NbTrios="+Trio.getCompteur());
        System.out.println("NbProjets="+Projet.getCompteur());


    }
}
