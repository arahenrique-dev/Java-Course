//Henrique Pires Aragao
public class TestTrianglePascal {
    public static void main(String[] args) {
        //Triangle 1
        TrianglePascal t1 =  new TrianglePascal(5);
        t1.remplirTriangle();
        System.out.println(t1.toString() + "\n");

        //Triangle 2
        TrianglePascal t2 =  new TrianglePascal(8);
        t2.remplirTriangle();
        System.out.println(t2.toString() + "\n");

        //Triangle 3
        TrianglePascal t3 =  new TrianglePascal(2);
        t3.remplirTriangle();
        System.out.println(t3.toString() + "\n");

        //Triangle 4
        TrianglePascal t4 =  new TrianglePascal(3);
        t4.remplirTriangle();
        System.out.println(t4.toString() + "\n");

        //Triangle 5
        TrianglePascal t5 =  new TrianglePascal(12);
        t5.remplirTriangle();
        System.out.println(t5.toString() + "\n");
    }
}
