//Henrique Pires Aragao
public class TestVectN {
    public static void main(String[] args) {
        //pas possible de creer avec VectN(int n) parce que c'est privé
        VectN v1 = new VectN(3,5);
        VectN v2 = new VectN();
        VectN v3 = new VectN(1,2,3);

        
        System.out.println("V1 : " + v1.toString());
        System.out.println("V2 : " +v2.toString());
        System.out.println("V3 : " +v3.toString());
        System.out.println("Somme V3 : " +v3.somme());
        int [] t = v3.getTab();
        System.out.println("T : " + t[0]);
        t[0] = 100;
        System.out.println("T : " + t[0]);
        System.out.println("V3 : " +v3.toString());
        
    }
}
