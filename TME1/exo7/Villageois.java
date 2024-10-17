package exo7;
public class Villageois {
    String nom;
    double poids;
    boolean malade;

    public Villageois(String nomV) {
        nom = nomV;
        poids = Math.random()*(150-50)  + 50;
        malade = Math.random() < 0.2;
    }

    public String toString() {
        String v_malade;
        v_malade = "non";
        if (malade ==true) {
            v_malade = "oui";
        }  
        return String.format("villageois : " + nom + ", poids : " + "%.0f" + " kg" + ", malade : " + v_malade + 
            ", peut soulever : " + "%.0f" + " kg.", poids, poidsSouleve());
    }
    
    public String getNom() {
        return nom;
    }
    public double getPoids() {
        return poids;
    }
    public boolean getMalade () {
        return malade;
    }

    public double poidsSouleve() {
        if (!malade) {
            return poids/3;
        }
        else {
            return poids/4;
        }
    }
}
