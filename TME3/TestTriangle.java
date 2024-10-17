public class TestTriangle {
    public static void main(String[] arg) {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        System.out.println(String.format("P1 : %s | P2 : %s", p1.toString(), p2.toString()));
        System.out.println(String.format("Distance entre P1 et P2 : %.2f", p1.distance(p2)));

        Triangle t1 = new Triangle(p1,p2,p3);
        System.out.println(String.format("T1 : %s", t1.toString()));
        System.out.println(String.format("Perimetre : %.2f", t1.getPerimetre()));
        Triangle t2 = new Triangle(t1);
        System.out.println(String.format("T2 : %s", t2.toString()));

        t1.s1.deplaceToi(3, 5);
        System.out.println("Apres Deplacement de T1");
        System.out.println(String.format("T1 : %s", t1.toString()));
        System.out.println(String.format("T2 : %s", t2.toString()));
    }
}
