//Henrique Pires Aragão 21304445
public class TestCone {
    public static void main(String[] args) {
        System.out.println(String.format("Nb de cones : %d", Cone.getNbCones()));
        Cone c1 = new Cone(2,3);
        Cone c2 = new Cone();
        System.out.println(String.format("Nb de cones : %d", c1.getNbCones()));
    }
}
