package exo7;

public class TestVillageois{

    public static void main(String[]arg) {
        double rocher = 100;
        Villageois un = new Villageois("Jean");
        Villageois deux = new Villageois("Pierre");
        Villageois trois = new Villageois("Arnaud");
        Villageois quatre = new Villageois("Baptiste");

        un.toString();
        deux.toString();
        trois.toString();
        quatre.toString();

        //Accesseurs
        System.out.println("Villageois 1 :");
        System.out.println("Nom : " + un.getNom());
        System.out.println("Poids : " + un.getPoids());
        System.out.println("Malade : " + un.getMalade());
        System.out.println("\nVillageois 2 :");
        System.out.println(deux.toString());

        //poids total qu'ils peuvent soulever
        System.out.println("\nEst-ce que les 4 peuvent lever le rocher ?");
        double poidsTotal = un.poidsSouleve() + deux.poidsSouleve() + trois.poidsSouleve() + quatre.poidsSouleve();
        if (poidsTotal > rocher || poidsTotal == rocher) {System.out.println("Oui, réussite de soulever le rocher :D");}
        else {System.out.println("Non, échec de soulever le rocher :(");}
    }
}