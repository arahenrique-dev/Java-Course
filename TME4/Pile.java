//Henrique Pires Aragao
public class Pile {
    Assiette [] assiettes;
    int nbA = 0;

    public Pile(int max) {
        assiettes = new Assiette[max];
    }
    public boolean estVide() {
        return nbA == 0;
    }
    public boolean estPleine() {
        return nbA == assiettes.length;
    }
    public void empiler(Assiette a) {
        if (!estPleine()) {
            assiettes[nbA] = a;
            nbA++;
        }
    }
    public Assiette depiler() {
        Assiette a1;
        if (!estVide()){
            a1 = assiettes[nbA-1];
            assiettes[nbA-1] = null;
            nbA--;
            return a1;
        }
        return null;
    }
    @Override
    public String toString() {
        String s = "";
        if (!estVide()) {
            for (int i = nbA-1; i >= 0; i--) {
                s += assiettes[i].toString() + "\n";
            }
            return s;
        }
        return "";
    }

}
