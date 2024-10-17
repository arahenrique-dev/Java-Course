//Henrique Pires Aragao
public class TestPile {
    public static void main(String[] args) {
        Pile p = new Pile(3);
        System.out.println("On empile 3 fois");
        p.empiler(new Assiette(13));
        p.empiler(new Assiette());
        p.empiler(new Assiette(30));
        System.out.println(p.toString());

        System.out.println("On depile 1 fois");
        p.depiler();
        System.out.println(p.toString());

        System.out.println("On empile 2 fois");
        p.empiler(new Assiette());
        p.empiler(new Assiette());
        System.out.println(p.toString());

        System.out.println("On depile 4 fois");
        p.depiler();
        p.depiler();
        p.depiler();
        p.depiler();
        System.out.println(p.toString());

    }
}
