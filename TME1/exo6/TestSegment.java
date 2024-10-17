package exo6;
public class TestSegment {
    public static void main(String[] arg) {
        Segment un = new Segment(6,8);
        Segment deux = new Segment(12,5);
        if (un.longueur() > deux.longueur()) {
            System.out.println("Le premier segment est plus long.");
        }
        else {
            System.out.println("Le deuxieme segment est plus long.");
        }
    }
}