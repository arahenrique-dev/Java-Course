//Henrique Pires Aragao
public class Assiette {
    int diametre;

    public Assiette(int diametre) {
        this.diametre = diametre;
    }
    public Assiette() {
        this(26);
    }
    @Override
    public String toString() {
        return "Assiette " + diametre + "cm";
    }
}
